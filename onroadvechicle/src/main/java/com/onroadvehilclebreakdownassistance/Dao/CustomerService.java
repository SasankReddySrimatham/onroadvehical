package com.onroadvehilclebreakdownassistance.Dao;


import java.util.List;
import com.onroadvehilclebreakdownassistance.Model.CustomerModel;


public interface CustomerService {
 
	
	 List<CustomerModel> getAllCustomer();
	 
	 CustomerModel getSingleCustomer(int Id);
	 
	 CustomerModel saveCustomer(CustomerModel CustomerModel);
	 
	 CustomerModel updateCustomer(CustomerModel CustomerModel);
	 
	 void deleteCustomer(int id);
}
	 