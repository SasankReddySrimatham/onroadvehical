package com.onroadvehilclebreakdownassistance.Dao;

import java.util.List;
import com.onroadvehilclebreakdownassistance.Model.AdminModel;


public interface AdminService {
 
	
	 List<AdminModel> getAllAdmin();
	 
	 AdminModel getSingleAdmin(int Id);
	 
	 AdminModel saveAdmin(AdminModel AdminModel);
	 
	 AdminModel updateAdmin(AdminModel AdminModel);
	 
	 void deleteAdmin(int id);
	 
	 
	 

}
