package org.example.travelio.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.example.travelio.DTO.Response.PlanItemResponse;
import org.example.travelio.Services.TripPlanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trip-plan")
@RequiredArgsConstructor
public class TripPlanController {

    private final TripPlanService tripPlanService;

    @Operation(
            summary = "Get trip plan",
            description = "Returns the generated trip plan. Each place/location item is enriched with an automatically generated Google Images explore URL based on place name, city name, and Azerbaijan. The explore URL is intended to be opened by the frontend in a new browser tab."
    )

    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Trip plan successfully returned"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })


    @GetMapping
    public List<PlanItemResponse> getYourPlan() {
        return tripPlanService.getPlan();
    }
}
