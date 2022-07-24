package com.onroadvehilclebreakdownassistance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onroadvehilclebreakdownassistance.Model.AdminModel;


@Repository
public interface RepoInterfaceAdmin extends JpaRepository<AdminModel,Integer>{


}
