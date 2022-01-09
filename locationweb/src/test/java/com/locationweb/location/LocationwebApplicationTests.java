package com.locationweb.location;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.locationweb.location.entities.Location;
import com.locationweb.location.repos.LocationRepository;


@SpringBootTest
public class LocationwebApplicationTests {

	@Autowired
	private LocationRepository repo;
	
	@Test
	void createStudent() {
		Location student=new Location();
		student.setCode("CS");
		student.setId(2l);
		student.setName("Name");
		student.setType("type1");
		repo.save(student);
	}

}
