package org.example.travelio.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.resilience.annotation.EnableResilientMethods;

@Getter
@Setter
@Entity
@Table(name = "places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placeName;
    private String cityName;
    private String exploreUrl;
}
