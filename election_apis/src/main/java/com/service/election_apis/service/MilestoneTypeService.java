package com.service.election_apis.service;


import java.util.List;
import com.service.election_apis.entity.MilestoneType;

public interface MilestoneTypeService {
	
	List<MilestoneType> getAllMilestoneTypes();

    MilestoneType getMilestoneTypeById(Integer id);

}
