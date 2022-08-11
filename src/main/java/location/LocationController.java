package location;

import java.util.List;
import java.util.Arrays;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

	 @RequestMapping(value = "/locations")
	   public List<Location> getAllLocations() 
	   {
		Location location1 = new Location("l1", "Lagos");
		Location location2 = new Location("l2", "Asaba");
		Location location3 = new Location("l3", "Budapest");	
			
		return Arrays.asList(location1, location2, location3);
	   }	
}
