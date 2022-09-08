package com.demo.repository;
import org.springframework.data.repository.CrudRepository;  
import com.demo.model.Farmer;


public interface FarmerRepository extends CrudRepository<Farmer,Integer>
{

}
