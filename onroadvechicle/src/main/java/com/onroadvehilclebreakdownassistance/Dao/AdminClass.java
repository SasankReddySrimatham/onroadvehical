package com.onroadvehilclebreakdownassistance.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onroadvehilclebreakdownassistance.Model.AdminModel;
import com.onroadvehilclebreakdownassistance.repo.RepoInterfaceAdmin;



@Service
public class AdminClass implements AdminService{
    @Autowired
	private RepoInterfaceAdmin repoobj;
	
	
	@Override
	public List<AdminModel> getAllAdmin() {
		
		return repoobj.findAll();
	}

	@Override
	public AdminModel getSingleAdmin(int id) {
		return repoobj.findById(id).get();
		
	}

	@Override
	public AdminModel saveAdmin(AdminModel	 AdminModel) {
		return repoobj.save(AdminModel);
	
	}

	@Override
	public AdminModel updateAdmin(AdminModel AdminModel) {
		return repoobj.save(AdminModel);
		
	}

	@Override
	public void deleteAdmin(int id) {
		 repoobj.deleteById(id);
		
	}

}

