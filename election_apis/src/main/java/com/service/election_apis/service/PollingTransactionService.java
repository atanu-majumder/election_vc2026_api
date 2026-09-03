package com.service.election_apis.service;

import java.util.List;
import java.util.Optional;

import com.service.election_apis.entity.PollingTransaction;

public interface PollingTransactionService {
	
	List<PollingTransaction> getAllPollingTransactions();

    
    PollingTransaction getByPollingStationId(Integer pollingStationId);
	//Optional<PollingTransaction>  getByPollingStationId(Integer polling_station_id);

    PollingTransaction createPollingTransaction(
            PollingTransaction pollingTransaction
    );

    PollingTransaction updatePollingTransaction(
            Integer pollingStationId,
            PollingTransaction pollingTransaction
    );

//    void deletePollingTransaction(
//            Integer pollingStationId
//    );


}
