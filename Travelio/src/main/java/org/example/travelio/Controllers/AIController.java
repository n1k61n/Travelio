package org.example.travelio.Controllers;

import org.example.travelio.DTO.Request.AIRequest;
import org.example.travelio.DTO.Response.JourneyResponse;
import org.example.travelio.Services.AIService;
import org.example.travelio.Services.JourneyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/ai")
public class AIController {

    private final AIService aiService;
    private final JourneyService journeyService;

    public AIController(AIService aiService, JourneyService journeyService) {
        this.aiService = aiService;
        this.journeyService = journeyService;
    }

    @PostMapping("/get-plan")
    public ResponseEntity<?> getPlanFromAI(@RequestBody JourneyResponse journey) {
        try {
            AIRequest dto = new AIRequest();
            dto.setInterests(journey.getInterests());
            dto.setChildrenCount(journey.getChildrenCount());
            dto.setBudgetType(journey.getBudgetType().toString());
            dto.setTravelStyle(journey.getTravelStyle().toString());
            dto.setTravelWith(journey.getTravelWith().toString());
            dto.setTripDays(journey.getTripDays());
            dto.setCurrency("AZN");
            Map<String, Object> plan = aiService.generatePlan(dto);
            return ResponseEntity.ok(plan);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(Map.of("error", "Could not generate trip plan. Please try again."));
        }
    }


    @PostMapping("/enrich-plan")
    public ResponseEntity<?> enrichPlan(@RequestBody Map<String, Object> plan) {
        try {
            aiService.enrichPlanWithExploreUrls(plan);
            return ResponseEntity.ok(plan);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(Map.of("error", e.getMessage()));
        }
    }

}
