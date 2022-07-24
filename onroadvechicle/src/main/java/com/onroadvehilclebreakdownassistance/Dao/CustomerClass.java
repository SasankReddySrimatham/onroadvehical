package com.onroadvehilclebreakdownassistance.Dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onroadvehilclebreakdownassistance.Model.CustomerModel;
import com.onroadvehilclebreakdownassistance.repo.RepoInterfaceCustomer;



@Service
public class CustomerClass implements CustomerService{
    @Autowired
	private RepoInterfaceCustomer repoobj;
	
	
	@Override
	public List<CustomerModel> getAllCustomer() {
		
		return repoobj.findAll();
	}

	@Override
	public CustomerModel getSingleCustomer(int id) {
		return repoobj.findById(id).get();
		
	}

	@Override
	public CustomerModel saveCustomer(CustomerModel	 CustomerModel) {
		return repoobj.save(CustomerModel);
	
	}

	@Override
	public CustomerModel updateCustomer(CustomerModel CustomerModel) {
		return repoobj.save(CustomerModel);
		
	}

	@Override
	public void deleteCustomer(int id) {
		 repoobj.deleteById(id);
		
	}

}
