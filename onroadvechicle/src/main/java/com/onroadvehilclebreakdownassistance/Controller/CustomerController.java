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

import com.onroadvehilclebreakdownassistance.Dao.CustomerService;
import com.onroadvehilclebreakdownassistance.Model.CustomerModel;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerobj;
	@GetMapping("/good")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/Customer")
	public List<CustomerModel> getAllCustomer(){
		return customerobj.getAllCustomer();
	
	}
	@GetMapping("/Customer/{Id}")
	public CustomerModel getSingleCustomer(@PathVariable int Id) {
		return customerobj.getSingleCustomer(Id); 
		
	}
	@PostMapping("/Customer")
	public CustomerModel saveCustomer(@RequestBody CustomerModel CustomerModel) {
		return customerobj.saveCustomer(CustomerModel);
		
	}
	@PutMapping("/Customer/{Id}")
	public CustomerModel updateCustomer(@RequestBody CustomerModel CustomerModel,@PathVariable int Id) {
		CustomerModel.setCust_id(Id);
		return customerobj.updateCustomer(CustomerModel);
	}
	@DeleteMapping("/Customer")
	public void deleteCustomer(@RequestParam int Id) {
		customerobj.deleteCustomer(Id);
	}
	
	
}