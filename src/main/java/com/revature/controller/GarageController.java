package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.data.GarageRepository;

@RestController
@RequestMapping("/garage")
public class GarageController {
	
	@Autowired
	GarageRepository garageRepo;

}
