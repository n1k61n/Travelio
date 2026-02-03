package org.example.travelio.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "place_name", nullable = false)
    private String placeName;

    @Column(name = "city_name", nullable = false)
    private String cityName;

    @Column(name = "explore_url", columnDefinition = "TEXT")
    private String exploreUrl;
}
