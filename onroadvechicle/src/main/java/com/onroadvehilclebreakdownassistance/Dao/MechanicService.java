package com.onroadvehilclebreakdownassistance.Dao;


import java.util.List;
import com.onroadvehilclebreakdownassistance.Model.MechanicMethod;


public interface MechanicService {
 
	
	 List<MechanicMethod> getAllMechanic();
	 
	 MechanicMethod getSingleMechanic(int Id);
	 
	 MechanicMethod saveMechanic(MechanicMethod MechanicMethod);
	 
	 MechanicMethod updateMechanic(MechanicMethod MechanicMethod);
	 
	 void deleteMechanic(int id);

	
}
	 
