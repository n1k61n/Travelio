package org.example.travelio.Services;

import lombok.RequiredArgsConstructor;
import org.example.travelio.DTO.Response.PlanResponse;
import org.example.travelio.Entities.Place;
import org.example.travelio.Repositories.PlaceRepository;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TripPlanService {

    private static final String GOOGLE_IMAGES_BASE =
            "https://www.google.com/search?tbm=isch&q=";


    private final PlaceRepository placeRepository;


    public List<PlanResponse> getPlan() {

        List<Place> places = placeRepository.findAll();

        return places.stream()
                .map(this::mapToResponse)
                .toList();
    }


    private PlanResponse mapToResponse(Place place) {

        PlanResponse response = new PlanResponse();
        response.setPlaceName(place.getPlaceName());
        response.setCityName(place.getCityName());

        String exploreUrl = generate(
                place.getPlaceName(),
                place.getCityName()
        );

        response.setExploreUrl(exploreUrl);

        return response;
    }



    public static String generate(String placeName, String cityName) {

        if (placeName == null || placeName.isBlank()) {
            throw new IllegalArgumentException("placeName boş ola bilməz");
        }

        String query = placeName;

        if (cityName != null && !cityName.isBlank()) {
            query += " " + cityName;
        }

        query += " Azerbaijan";

        String encodedQuery = URLEncoder.encode(query, StandardCharsets.UTF_8);

        return GOOGLE_IMAGES_BASE + encodedQuery;
    }

}
