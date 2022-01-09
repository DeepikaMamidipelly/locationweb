package com.locationweb.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locationweb.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
