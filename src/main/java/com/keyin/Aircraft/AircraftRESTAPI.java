package com.keyin.Aircraft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
@RepositoryRestResource(collectionResourceRel = "aircraft", path = "aircraft")
public interface AircraftRESTAPI extends JpaRepository<Aircraft, Long> {
    public List<Aircraft> findByType(@RequestParam String type);
    public List<Aircraft> findByTailNumber(@RequestParam String type);
}
