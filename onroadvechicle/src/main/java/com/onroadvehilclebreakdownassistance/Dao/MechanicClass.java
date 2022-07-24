package com.onroadvehilclebreakdownassistance.Dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onroadvehilclebreakdownassistance.Model.MechanicMethod;
import com.onroadvehilclebreakdownassistance.repo.RepoInterfaceMechanic;



@Service
public class MechanicClass implements MechanicService{
    @Autowired
	private RepoInterfaceMechanic repoobj;
	
	
	@Override
	public List<MechanicMethod> getAllMechanic() {
		
		return repoobj.findAll();
	}

	@Override
	public MechanicMethod getSingleMechanic(int id) {
		return repoobj.findById(id).get();
		
	}

	@Override
	public MechanicMethod saveMechanic(MechanicMethod	 MechanicMethod) {
		return repoobj.save(MechanicMethod);
	
	}

	@Override
	public MechanicMethod updateMechanic(MechanicMethod MechanicMethod) {
		return repoobj.save(MechanicMethod);
		
	}

	@Override
	public void deleteMechanic(int id) {
		 repoobj.deleteById(id);
		
	}

}