package com.service.election_apis.service;

import com.service.election_apis.entity.UserDetail;

import java.util.List;

public interface UserDetailService {
	
	UserDetail createUser(UserDetail user);

    UserDetail updateUser(Long id, UserDetail user);

    UserDetail getUserById(Long id);

    UserDetail getUserByUsername(String username);

    UserDetail getUserByMobileNo(String mobileNo);

    List<UserDetail> getAllUsers();

    List<UserDetail> getUsersByElection(Integer electionId);

    List<UserDetail> getUsersByDistrict(Integer districtId);

    List<UserDetail> getUsersBySubdivision(Integer subdivisionId);

    List<UserDetail> getUsersByPollingStation(Integer pollingStationId);

    List<UserDetail> getUsersByDutyRole(String dutyRole);

    List<UserDetail> getActiveUsers();

    List<UserDetail> getVerifiedUsers();

    List<UserDetail> getDeviceRegisteredUsers();

    List<UserDetail> getUsersByElectionAndDistrict(
            Integer electionId,
            Integer districtId);

    List<UserDetail> getUsersByElectionAndPollingStation(
            Integer electionId,
            Integer pollingStationId);

    void deleteUser(Long id);

}
