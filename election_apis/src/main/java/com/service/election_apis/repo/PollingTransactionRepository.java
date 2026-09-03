package com.service.election_apis.repo;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.election_apis.entity.PollingTransaction;


@Repository
public interface PollingTransactionRepository extends JpaRepository<PollingTransaction, Integer>{

	//Optional<PollingTransaction>  findByPollingStationId(Integer polling_station_id);
}
