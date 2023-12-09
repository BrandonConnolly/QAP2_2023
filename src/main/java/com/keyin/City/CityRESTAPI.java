package com.keyin.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "City", path = "City")
public interface CityRESTAPI extends JpaRepository<City, Long> {
    public List<City> findByName(@RequestParam String name);
    public List<City> findByState(@RequestParam String state);
}
