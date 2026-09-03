package com.service.election_apis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.election_apis.entity.Election_notification;
import com.service.election_apis.repo.ElectionRepository;

@Service
public class ElectionServiceImpl implements ElectionService{
	
	@Autowired
	private ElectionRepository repository;

	@Override
	public Election_notification save(Election_notification election) {
		// TODO Auto-generated method stub
		return repository.save(election);
	}

	@Override
	public List<Election_notification> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Election_notification getById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Election not found"));
	}

	@Override
	public Election_notification update(Long id, Election_notification election) {
		// TODO Auto-generated method stub
		Election_notification existing = getById(id);

        existing.setElectionName(election.getElectionName());
        existing.setElectionType(election.getElectionType());
        existing.setElectionDate(election.getElectionDate());
        existing.setNominationStartDate(election.getNominationStartDate());
        existing.setNominationEndDate(election.getNominationEndDate());
        existing.setDateOfScrutiny(election.getDateOfScrutiny());
        existing.setFinalNominatedList(election.getFinalNominatedList());
        existing.setState(election.getState());
        existing.setTotNoAc(election.getTotNoAc());

        return repository.save(existing);
	}
	

}
