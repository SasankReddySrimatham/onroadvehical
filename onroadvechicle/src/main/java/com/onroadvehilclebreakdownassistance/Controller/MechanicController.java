package com.onroadvehilclebreakdownassistance.Controller;


import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onroadvehilclebreakdownassistance.Dao.MechanicService;
import com.onroadvehilclebreakdownassistance.Model.MechanicMethod;

@RestController
public class MechanicController {
	@Autowired
	private MechanicService mechanicobj;
	@GetMapping("/very")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/Mechanic")
	public List<MechanicMethod> getAllMechanic(){
		return mechanicobj.getAllMechanic();
	
	}
	@GetMapping("/Mechanic/{Id}")
	public MechanicMethod getSingleMechanic(@PathVariable int Id) {
		return mechanicobj.getSingleMechanic(Id); 
		
	}
	@PostMapping("/Mechanic")
	public MechanicMethod saveMechanic(@RequestBody MechanicMethod MechanicMethod) {
		return mechanicobj.saveMechanic(MechanicMethod);
		
	}
	@PutMapping("/Mechanic/{Id}")
	public MechanicMethod updateMechanic(@RequestBody MechanicMethod MechanicMethod,@PathVariable int Id) {
		MechanicMethod.setMechanic_id(Id);
		return mechanicobj.updateMechanic(MechanicMethod);
	}
	@DeleteMapping("/Mechanic")
	public void deleteMechanic(@RequestParam int Id) {
		mechanicobj.deleteMechanic(Id);
	}
	
	

}

