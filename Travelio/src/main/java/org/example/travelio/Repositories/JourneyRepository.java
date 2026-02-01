package org.example.travelio.Repositories;

import org.example.travelio.Entities.Journey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends CrudRepository<Journey, Long> {
}
