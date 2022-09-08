package com.demo.controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.demo.model.Farmer;
import com.demo.service.FarmerService;

@RestController
public class FarmerController {
	 
		//autowired the StudentService class  
		@Autowired  
		FarmerService farmerService;  
		//creating a get mapping that retrieves all the students detail from the database   
		@GetMapping("/student")  
		public List<Farmer> getAllFarmer()   
		{  
		return farmerService.getAllFarmer();  
		}  
	
	
	

}
