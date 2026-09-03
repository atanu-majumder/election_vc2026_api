package com.service.election_apis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.election_apis.entity.PollingTransactionDetails;
import com.service.election_apis.entity.PollingTransactionDetailsId;
import com.service.election_apis.repo.PollingTransactionDetailsRepository;


@Service
public class PollingTransactionDetailsServiceImpl implements PollingTransactionDetailsService{
	
	private final PollingTransactionDetailsRepository repository;

    public PollingTransactionDetailsServiceImpl(
            PollingTransactionDetailsRepository repository) {

        this.repository = repository;
    }


    @Override
    public List<PollingTransactionDetails>
    getAllPollingTransactionDetails() {

        return repository.findAll();
    }


    @Override
    public PollingTransactionDetails
    getPollingTransactionDetailsById(
            Integer pollingStationId,
            Integer seatNo) {

        PollingTransactionDetailsId id =
                new PollingTransactionDetailsId(
                        pollingStationId,
                        seatNo
                );

        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "Polling transaction details "
                                + "not found"
                        )
                );
    }


    @Override
    public PollingTransactionDetails
    createPollingTransactionDetails(
            PollingTransactionDetails details) {

        return repository.save(details);
    }


    @Override
    public PollingTransactionDetails
    updatePollingTransactionDetails(
            Integer pollingStationId,
            Integer seatNo,
            PollingTransactionDetails details) {

		PollingTransactionDetails existing = getPollingTransactionDetailsById(pollingStationId, seatNo);     

		if (details.getNamePollingStation() != null && !details.getNamePollingStation().isEmpty()) {
			existing.setNamePollingStation(details.getNamePollingStation());
		}
		
		if (details.getVcConstituencyNo() != null && details.getVcConstituencyNo()!=0) {
			existing.setVcConstituencyNo(details.getVcConstituencyNo());
		}

		if (details.getVcConstituencyName() != null && !details.getVcConstituencyName().isEmpty()) {
			existing.setVcConstituencyName(details.getVcConstituencyName());
		}

		if (details.getElectionId() != null && details.getElectionId() != 0) {
			existing.setElectionId(details.getElectionId());
		}

		if (details.getElectionName() != null && !details.getElectionName().isEmpty()) {
			existing.setElectionName(details.getElectionName());
		}

		if (details.getEntryBy() != null && details.getEntryBy() != 0) {
			existing.setEntryBy(details.getEntryBy());
		}

		if (details.getEntryByName() != null && !details.getEntryByName().isEmpty()) {
			existing.setEntryByName(details.getEntryByName());
		}
		
		if (details.getFinalElectorsDetails() != null && !details.getFinalElectorsDetails().isEmpty()) {
			existing.setFinalElectorsDetails(details.getFinalElectorsDetails());
		}

		if (details.getTotFinalElectors() != null && details.getTotFinalElectors() != 0) {
			existing.setTotFinalElectors(details.getTotFinalElectors());
		}

		if (details.getAssignedVotersDetails() != null && !details.getAssignedVotersDetails().isEmpty()) {
			existing.setAssignedVotersDetails(details.getAssignedVotersDetails());
		}

		if (details.getTotAssignedVoters() != null && details.getTotAssignedVoters() != 0) {
			existing.setTotAssignedVoters(details.getTotAssignedVoters());
		}

		if (details.getTournout7to9Details() != null && !details.getTournout7to9Details().isEmpty()) {
			existing.setTournout7to9Details(details.getTournout7to9Details());
		}

		if (details.getTournout7to9Total() != null && details.getTournout7to9Total() != 0) {
			existing.setTournout7to9Total(details.getTournout7to9Total());
		}

		if (details.getTournout9to11Details() != null && !details.getTournout9to11Details().isEmpty()) {
			existing.setTournout9to11Details(details.getTournout9to11Details());
		}

		if (details.getTournout9to11Total() != null && details.getTournout9to11Total() != 0) {
			existing.setTournout9to11Total(details.getTournout9to11Total());
		}

		if (details.getTournout11to13Details() != null && !details.getTournout11to13Details().isEmpty()) {
			existing.setTournout11to13Details(details.getTournout11to13Details());
		}

		if (details.getTournout11to13Total() != null && details.getTournout11to13Total() != 0) {
			existing.setTournout11to13Total(details.getTournout11to13Total());
		}

		if (details.getTournout13to15Details() != null && !details.getTournout13to15Details().isEmpty()) {
			existing.setTournout13to15Details(details.getTournout13to15Details());
		}

		if (details.getTournout13to15Total() != null && details.getTournout13to15Total() != 0) {
			existing.setTournout13to15Total(details.getTournout13to15Total());
		}

		if (details.getTournout15to16Details() != null && !details.getTournout15to16Details().isEmpty()) {
			existing.setTournout15to16Details(details.getTournout15to16Details());
		}

		if (details.getTournout15to16Total() != null && details.getTournout15to16Total() != 0) {
			existing.setTournout15to16Total(details.getTournout15to16Total());
		}

		if (details.getIsPollCompletedAt16() != null && details.getIsPollCompletedAt16()) {
			existing.setIsPollCompletedAt16(details.getIsPollCompletedAt16());
		}

		if (details.getNoSlipIssuedAfter16() != null && details.getNoSlipIssuedAfter16() != 0) {
			existing.setNoSlipIssuedAfter16(details.getNoSlipIssuedAfter16());
		}

		if (details.getTournoutAfter16Details() != null && !details.getTournoutAfter16Details().isEmpty()) {
			existing.setTournoutAfter16Details(details.getTournoutAfter16Details());
		}

		if (details.getTournoutAfter16Total() != null && details.getTournoutAfter16Total() != 0) {
			existing.setTournoutAfter16Total(details.getTournoutAfter16Total());
		}

		if (details.getTotalVoteCastDetails() != null && !details.getTotalVoteCastDetails().isEmpty()) {
			existing.setTotalVoteCastDetails(details.getTotalVoteCastDetails());
		}

		if (details.getTotalVoteCast() != null && details.getTotalVoteCast() != 0) {
			existing.setTotalVoteCast(details.getTotalVoteCast());
		}

		if (details.getFinalVoteCastDetails() != null && !details.getFinalVoteCastDetails().isEmpty()) {
			existing.setFinalVoteCastDetails(details.getFinalVoteCastDetails());
		}

		if (details.getFinalVoteCast() != null && details.getFinalVoteCast() != 0) {
			existing.setFinalVoteCast(details.getFinalVoteCast());
		}

		if (details.getPercentageVoteDetails() != null && !details.getPercentageVoteDetails().isEmpty()) {
			existing.setPercentageVoteDetails(details.getPercentageVoteDetails());
		}

		if (details.getPercentageVote() != null && details.getPercentageVote() > 0.0) {
			existing.setPercentageVote(details.getPercentageVote());
		}

        return repository.save(existing);
    }


    @Override
    public void deletePollingTransactionDetails(
            Integer pollingStationId,
            Integer seatNo) {

        PollingTransactionDetailsId id =
                new PollingTransactionDetailsId(
                        pollingStationId,
                        seatNo
                );

        if (!repository.existsById(id)) {

            throw new RuntimeException(
                    "Polling transaction details "
                    + "not found"
            );
        }

        repository.deleteById(id);
    }

}
