package com.service.election_apis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.election_apis.entity.Milestone;
import com.service.election_apis.repo.MilestoneRepository;
//import com.service.election_apis.service.MilestoneService;

@Service
public class MilestoneServiceImpl implements MilestoneService{

	private final MilestoneRepository milestoneRepository;

    public MilestoneServiceImpl(MilestoneRepository milestoneRepository) {
        this.milestoneRepository = milestoneRepository;
    }

//	@Override
//    public Milestone createMilestone(Milestone milestone) {
//
//        if (milestone.getIsActive() == null ||
//                milestone.getIsActive().isBlank()) {
//
//            milestone.setIsActive("Y");
//        }
//
//        return milestoneRepository.save(milestone);
//    }

//    @Override
//    public Milestone updateMilestone(Integer id, Milestone milestone) {
//
//        Milestone existing = milestoneRepository.findById(id)
//                .orElseThrow(() ->
//                        new RuntimeException("Milestone not found with ID: " + id));
//
//        existing.setMilestoneName(milestone.getMilestoneName());
//        existing.setActiveOnDay(milestone.getActiveOnDay());
//        existing.setStartTime(milestone.getStartTime());
//        existing.setResponsibleOfficer(milestone.getResponsibleOfficer());
//        existing.setIsActive(milestone.getIsActive());
//        existing.setMilestoneDesc(milestone.getMilestoneDesc());
//
//        return milestoneRepository.save(existing);
//    }

    @Override
    public Milestone getMilestoneById(Integer id) {

        return milestoneRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Milestone not found with ID: " + id));
    }

//    @Override
//    public List<Milestone> getAllMilestones() {
//
//        return milestoneRepository.findAll();
//    }

    @Override
    public List<Milestone> getActiveMilestones() {

        return milestoneRepository.findByIsActive("Y");
    }

    @Override
    public List<Milestone> getActiveMilestonesByDay(Integer activeOnDay, String isActive) {

        //return milestoneRepository.findByActiveOnDay(activeOnDay));
        return milestoneRepository.findByActiveOnDayAndIsActive(activeOnDay, "Y");
    }

//	@Override
//	public void deleteMilestone(Integer id) {
//		// TODO Auto-generated method stub
//		if (!milestoneRepository.existsById(id)) {
//            throw new RuntimeException(
//                    "Milestone not found with ID: " + id);
//        }
//
//        milestoneRepository.deleteById(id);
//		
//	}
	
	
}
