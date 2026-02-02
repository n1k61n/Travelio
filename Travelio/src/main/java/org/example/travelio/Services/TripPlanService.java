package org.example.travelio.Services;

import org.example.travelio.DTO.Response.PlanItemResponse;
import org.example.travelio.Entities.Place;
import org.example.travelio.Utility.ExploreUrlGenerator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripPlanService {

    public List<PlanItemResponse> getPlan() {

        // Məsələn DB-dən gələn entity-lər
        List<Place> places = fetchPlaces();

        return places.stream()
                .map(this::mapToResponse)
                .toList();
    }

    private List<Place> fetchPlaces() {
        return List.of();
    }


    private PlanItemResponse mapToResponse(Place place) {

        PlanItemResponse response = new PlanItemResponse();
        response.setPlaceName(place.getPlaceName());
        response.setCityName(place.getCityName());

        String exploreUrl = ExploreUrlGenerator.generate(
                place.getPlaceName(),
                place.getCityName()
        );

        response.setExploreUrl(exploreUrl);

        return response;
    }
}
