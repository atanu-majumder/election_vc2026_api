package com.service.election_apis.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.election_apis.entity.Milestone;

@Repository
public interface MilestoneRepository extends JpaRepository<Milestone, Integer>{
	List<Milestone> findByIsActive(String isActive);

    //List<Milestone> findByActiveOnDay(Integer activeOnDay, String isActive);
    List<Milestone> findByActiveOnDayAndIsActive(Integer activeOnDay, String isActive);

    List<Milestone> findByResponsibleOfficer(Integer responsibleOfficer);

}
