package com.service.election_apis.service;

import java.util.List;

import com.service.election_apis.entity.PollingTransactionDetails;

public interface PollingTransactionDetailsService {
	
	List<PollingTransactionDetails>
    getAllPollingTransactionDetails();

    PollingTransactionDetails
    getPollingTransactionDetailsById(
            Integer pollingStationId,
            Integer seatNo
    );

    PollingTransactionDetails
    createPollingTransactionDetails(
            PollingTransactionDetails details
    );

    PollingTransactionDetails
    updatePollingTransactionDetails(
            Integer pollingStationId,
            Integer seatNo,
            PollingTransactionDetails details
    );

    void deletePollingTransactionDetails(
            Integer pollingStationId,
            Integer seatNo
    );

}
