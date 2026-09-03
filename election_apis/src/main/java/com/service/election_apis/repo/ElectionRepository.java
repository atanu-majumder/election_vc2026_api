package com.service.election_apis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.service.election_apis.entity.*;

public interface ElectionRepository extends JpaRepository<Election_notification, Long>{

}
