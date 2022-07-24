package com.onroadvehilclebreakdownassistance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onroadvehilclebreakdownassistance.Model.CustomerModel;


@Repository
public interface RepoInterfaceCustomer extends JpaRepository<CustomerModel,Integer>{


}
