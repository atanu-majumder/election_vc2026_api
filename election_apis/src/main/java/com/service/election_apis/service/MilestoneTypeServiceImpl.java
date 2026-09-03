package com.service.election_apis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.election_apis.repo.MilestoneTypeRepository;
import com.service.election_apis.entity.MilestoneType;

@Service
public class MilestoneTypeServiceImpl implements MilestoneTypeService {
	
	private final MilestoneTypeRepository milestoneTypeRepository;

    public MilestoneTypeServiceImpl(
            MilestoneTypeRepository milestoneTypeRepository) {
        this.milestoneTypeRepository = milestoneTypeRepository;
    }

    @Override
    public List<MilestoneType> getAllMilestoneTypes() {

        return milestoneTypeRepository.findAll();
    }

    @Override
    public MilestoneType getMilestoneTypeById(Integer id) {

        return milestoneTypeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Milestone type not found with id: " + id
                        )
                );
    }

}
