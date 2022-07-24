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

import com.onroadvehilclebreakdownassistance.Dao.AdminService;
import com.onroadvehilclebreakdownassistance.Model.AdminModel;

@RestController
public class AdminController {
	@Autowired
	private AdminService adminobj;
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/Admin")
	public List<AdminModel> getAllAdmin(){
		return adminobj.getAllAdmin();
	
	}
	@GetMapping("/Admin/{Id}")
	public AdminModel getSingleAdmin(@PathVariable int Id) {
		return adminobj.getSingleAdmin(Id); 
		
	}
	@PostMapping("/Admin")
	public AdminModel saveAdmin(@RequestBody AdminModel AdminModel) {
		return adminobj.saveAdmin(AdminModel);
		
	}
	@PutMapping("/Admin/{Id}")
	public AdminModel updateAdmin(@RequestBody AdminModel AdminModel,@PathVariable int Id) {
		AdminModel.setAdmin_id(Id);
		return adminobj.updateAdmin(AdminModel);
	}
	@DeleteMapping("/Admin")
	public void deleteAdmin(@RequestParam int Id) {
		adminobj.deleteAdmin(Id);
	}
	
	

}

