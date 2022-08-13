package com.example.demo.location;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.User;

@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationService;

	 @RequestMapping(value = "/locations")
	 public List<Location> getAllLocations() 
	   {
		
		return locationService.getAllLocations(); 
	   }
	 
	 
	 @RequestMapping(value="/locations/{id}")
	 public Location getLocation(@PathVariable String id) {
		 
		 return locationService.getLocationById(id);
	 }
	 
	 @RequestMapping(value="/locations/add", method = RequestMethod.POST)
	 public void addLocation(@RequestBody Location location) {
		 
		 locationService.addLocation(location);
		 
	 }
	 
	 @RequestMapping(value="/locations/update/{id}", method = RequestMethod.PUT)
	 public void updateLocation(@RequestBody Location location, @PathVariable String id) {
		 
		 locationService.updateLocation(id, location);
		 
	 }
	 
	 
	 @RequestMapping(value = "/location/delete/{id}", method = RequestMethod.DELETE)
	 public void deleteLocation(@PathVariable String id) {
	     locationService.deleteLocation(id);
	 }
}
