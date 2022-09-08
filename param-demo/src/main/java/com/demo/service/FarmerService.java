package com.demo.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.demo.model.Farmer;
import com.demo.repository.FarmerRepository;
@Service
public class FarmerService {
	@Autowired  
	FarmerRepository farmerRepository;  
	//getting all student records  
	public List<Farmer> getAllFarmer()   
	{  
	List<Farmer> farmer = new ArrayList<Farmer>();  
	farmerRepository.findAll().forEach(farmers -> farmer.add((Farmer) farmer));  
	return farmer;  
	}  

}
