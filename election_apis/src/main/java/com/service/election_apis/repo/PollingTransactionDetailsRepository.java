package com.service.election_apis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.election_apis.entity.PollingTransactionDetails;
import com.service.election_apis.entity.PollingTransactionDetailsId;

@Repository
public interface PollingTransactionDetailsRepository extends JpaRepository<PollingTransactionDetails, PollingTransactionDetailsId>{

}
