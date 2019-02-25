package com.rci.resort.detail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rci.resort.detail.entity.ResortEntity;

@Repository
public interface ResortRepository extends JpaRepository<ResortEntity,String>{
	

}
