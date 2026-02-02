package org.example.travelio.Utility;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class ExploreUrlGenerator {

    private static final String GOOGLE_IMAGES_BASE =
            "https://www.google.com/search?tbm=isch&q=";

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
