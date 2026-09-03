package com.service.election_apis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.election_apis.entity.UserDetail;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Long>{
	
	Optional<UserDetail> findByUsername(String username);

    Optional<UserDetail> findByMobileNo(String mobileNo);

    List<UserDetail> findByElectionId(Integer electionId);

    List<UserDetail> findByDistrictId(Integer districtId);

    List<UserDetail> findBySubdivisionId(Integer subdivisionId);

    List<UserDetail> findByPollingStationId(Integer pollingStationId);

    List<UserDetail> findByDutyRole(String dutyRole);

    List<UserDetail> findByIsActive(Boolean isActive);

    List<UserDetail> findByIsVerified(Boolean isVerified);

    List<UserDetail> findByDeviceRegistered(Boolean deviceRegistered);

    List<UserDetail> findByElectionIdAndDistrictId(
            Integer electionId,
            Integer districtId);

    List<UserDetail> findByElectionIdAndDutyRole(
            Integer electionId,
            String dutyRole);

    List<UserDetail> findByElectionIdAndPollingStationId(
            Integer electionId,
            Integer pollingStationId);

}
