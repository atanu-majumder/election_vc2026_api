package com.service.election_apis.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.service.election_apis.entity.PollingTransaction;
import com.service.election_apis.repo.PollingTransactionRepository;

@Service
public class PollingTransactionServiceImpl implements PollingTransactionService{

	private final PollingTransactionRepository repository;

    public PollingTransactionServiceImpl(
            PollingTransactionRepository repository) {

        this.repository = repository;
    }


    @Override
    public List<PollingTransaction>
    getAllPollingTransactions() {
 
        return repository.findAll();
    }


    @Override
    public PollingTransaction getByPollingStationId(Integer pollingStationId) {

        return repository.findById(pollingStationId)
                .orElse(null);
    }



    @Override
    public PollingTransaction
    createPollingTransaction(
            PollingTransaction pollingTransaction) {

        LocalDateTime now = LocalDateTime.now();

        if (pollingTransaction.getTotal_polling_agent()
                == null) {

            pollingTransaction.setTotal_polling_agent(null);
        }

        return repository.save(pollingTransaction);
    }


    @Override
    public PollingTransaction
    updatePollingTransaction(
            Integer pollingStationId,
            PollingTransaction pollingTransaction) {

//		PollingTransaction existing = getPollingTransactionById(pollingStationId);
    	PollingTransaction existing = getByPollingStationId(pollingStationId);

		if (pollingTransaction.getName_polling_station() != null
				&& !pollingTransaction.getName_polling_station().isEmpty()) {
			existing.setName_polling_station(pollingTransaction.getName_polling_station()

			);
		}

		if (pollingTransaction.getDistrict() != null && !pollingTransaction.getDistrict().isEmpty()) {
			existing.setDistrict(pollingTransaction.getDistrict());
		}

		if (pollingTransaction.getState_code() != null && pollingTransaction.getState_code() != 0) {
			existing.setState_code(pollingTransaction.getState_code());
		}

		if (pollingTransaction.getState_name() != null && !pollingTransaction.getState_name().isEmpty()) {
			existing.setState_name(pollingTransaction.getState_name());
		}

		if (pollingTransaction.getBlock() != null && !pollingTransaction.getBlock().isEmpty()) {
			existing.setBlock(pollingTransaction.getBlock());
		}

		if (pollingTransaction.getVillage_commitee_name() != null
				&& !pollingTransaction.getVillage_commitee_name().isEmpty()) {
			existing.setVillage_commitee_name(pollingTransaction.getVillage_commitee_name());
		}

		if (pollingTransaction.getElection_id() != null && pollingTransaction.getElection_id() != 0) {
			existing.setElection_id(

					pollingTransaction.getElection_id());
		}

		if (pollingTransaction.getElection_name() != null && !pollingTransaction.getElection_name().isEmpty()) {
			existing.setElection_name(pollingTransaction.getElection_name());
		}

		if (pollingTransaction.getPresiding_officer_id() != null && pollingTransaction.getPresiding_officer_id() != 0) {
			existing.setPresiding_officer_id(pollingTransaction.getPresiding_officer_id());
		}

		if (pollingTransaction.getPolling_party_despatched() != null
				&& !pollingTransaction.getPolling_party_despatched().toString().isEmpty()) {
			existing.setPolling_party_despatched(pollingTransaction.getPolling_party_despatched());
		}

		if (pollingTransaction.getPolling_party_reached() != null
				&& !pollingTransaction.getPolling_party_reached().toString().isEmpty()) {
			existing.setPolling_party_reached(pollingTransaction.getPolling_party_reached());
		}

		if (pollingTransaction.getMock_poll_conducted() != null
				&& !pollingTransaction.getMock_poll_conducted().toString().isEmpty()) {
			existing.setMock_poll_conducted(

					pollingTransaction.getMock_poll_conducted());
		}

		if (pollingTransaction.getPoll_started_at7am() != null
				&& !pollingTransaction.getPoll_started_at7am().toString().isEmpty()) {
			existing.setPoll_started_at7am(pollingTransaction.getPoll_started_at7am());
		}

		if (pollingTransaction.getWeather_at_ps() != null && !pollingTransaction.getWeather_at_ps().isEmpty()) {
			existing.setWeather_at_ps(pollingTransaction.getWeather_at_ps());
		}

		if (pollingTransaction.getLaw_order_at_ps() != null && !pollingTransaction.getLaw_order_at_ps().isEmpty()) {
			existing.setLaw_order_at_ps(pollingTransaction.getLaw_order_at_ps());
		}

		if (pollingTransaction.getPolling_agent_details() != null
				&& !pollingTransaction.getPolling_agent_details().isEmpty()) {
			existing.setPolling_agent_details(pollingTransaction.getPolling_agent_details());
		}

		if (pollingTransaction.getTotal_polling_agent() != null
				&& !pollingTransaction.getTotal_polling_agent().toString().isEmpty()) {
			existing.setTotal_polling_agent(pollingTransaction.getTotal_polling_agent());
		}

		return repository.save(existing);
    }


//    @Override
//    public void deletePollingTransaction(
//            Integer pollingStationId) {
//
//        if (!repository.existsById(pollingStationId)) {
//
//            throw new RuntimeException(
//                    "Polling transaction not found "
//                    + "for polling station ID: "
//                    + pollingStationId
//            );
//        }
//
//        repository.deleteById(pollingStationId);
//    }
}
