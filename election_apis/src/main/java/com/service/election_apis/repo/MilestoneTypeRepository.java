package com.service.election_apis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.election_apis.entity.MilestoneType;


@Repository
public interface MilestoneTypeRepository extends JpaRepository<MilestoneType, Integer>{

}
