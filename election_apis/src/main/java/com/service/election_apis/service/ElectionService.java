package com.service.election_apis.service;

import com.service.election_apis.entity.*;
import java.util.List;

public interface ElectionService {
	
	Election_notification save(Election_notification election);

    List<Election_notification> getAll();

    Election_notification getById(Long id);

    Election_notification update(Long id, Election_notification election);

}
