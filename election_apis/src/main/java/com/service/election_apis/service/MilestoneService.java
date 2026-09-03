package com.service.election_apis.service;

import com.service.election_apis.entity.Milestone;
import java.util.List;

public interface MilestoneService {
	//Milestone createMilestone(Milestone milestone);

    //Milestone updateMilestone(Integer id, Milestone milestone);

    Milestone getMilestoneById(Integer id);

    //List<Milestone> getAllMilestones();

    List<Milestone> getActiveMilestones();

    List<Milestone> getActiveMilestonesByDay(Integer activeOnDay, String isActive);

    //void deleteMilestone(Integer id);

}
