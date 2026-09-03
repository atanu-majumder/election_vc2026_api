package com.service.election_apis.service;

import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.service.election_apis.entity.UserDetail;
import com.service.election_apis.repo.UserDetailRepository;

@Service
public class UserDetailServiceImpl implements UserDetailService{

	private final UserDetailRepository userDetailRepository;

    public UserDetailServiceImpl(
            UserDetailRepository userDetailRepository) {

        this.userDetailRepository = userDetailRepository;
    }

    @Override
    public UserDetail createUser(UserDetail user) {

        if (user.getDutyRole() == null ||
                user.getDutyRole().isBlank()) {

            user.setDutyRole("PRESIDING_OFFICER");
        }

        if (user.getIsActive() == null) {
            user.setIsActive(true);
        }

        if (user.getIsVerified() == null) {
            user.setIsVerified(false);
        }

        if (user.getIsLocked() == null) {
            user.setIsLocked(false);
        }

        if (user.getFailedLoginAttempts() == null) {
            user.setFailedLoginAttempts(0);
        }

        if (user.getDeviceRegistered() == null) {
            user.setDeviceRegistered(false);
        }

        OffsetDateTime now = OffsetDateTime.now();

        user.setCreatedAt(now);
        user.setUpdatedAt(now);

        return userDetailRepository.save(user);
    }

    @Override
    public UserDetail updateUser(
            Long id,
            UserDetail user) {

        UserDetail existing =
                userDetailRepository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "User not found with ID: " + id));

        existing.setUsername(user.getUsername());
        existing.setMobileNo(user.getMobileNo());
        existing.setEmail(user.getEmail());
        existing.setEmpCode(user.getEmpCode());
        existing.setEmpName(user.getEmpName());
        existing.setDesignation(user.getDesignation());
        existing.setGender(user.getGender());

        existing.setElectionId(user.getElectionId());
        existing.setDistrictId(user.getDistrictId());
        existing.setSubdivisionId(user.getSubdivisionId());

        existing.setConstituencyTypeId(
                user.getConstituencyTypeId());

        existing.setConstituencyCode(
                user.getConstituencyCode());

        existing.setPollingStationId(
                user.getPollingStationId());

        existing.setPollingStationCode(
                user.getPollingStationCode());

        existing.setPollingStationName(
                user.getPollingStationName());

        existing.setPollingStationAddress(
                user.getPollingStationAddress());

        existing.setDutyRole(user.getDutyRole());
        existing.setIsActive(user.getIsActive());
        existing.setIsVerified(user.getIsVerified());
        existing.setIsLocked(user.getIsLocked());

        existing.setDeviceRegistered(
                user.getDeviceRegistered());

        existing.setUpdatedAt(OffsetDateTime.now());

        return userDetailRepository.save(existing);
    }

    @Override
    public UserDetail getUserById(Long id) {

        return userDetailRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "User not found with ID: " + id));
    }

    @Override
    public UserDetail getUserByUsername(
            String username) {

        return userDetailRepository.findByUsername(username)
                .orElseThrow(() ->
                        new RuntimeException(
                                "User not found: " + username));
    }

    @Override
    public UserDetail getUserByMobileNo(
            String mobileNo) {

        return userDetailRepository.findByMobileNo(mobileNo)
                .orElseThrow(() ->
                        new RuntimeException(
                                "User not found with mobile: "
                                        + mobileNo));
    }

    @Override
    public List<UserDetail> getAllUsers() {

        return userDetailRepository.findAll();
    }

    @Override
    public List<UserDetail> getUsersByElection(
            Integer electionId) {

        return userDetailRepository
                .findByElectionId(electionId);
    }

    @Override
    public List<UserDetail> getUsersByDistrict(
            Integer districtId) {

        return userDetailRepository
                .findByDistrictId(districtId);
    }

    @Override
    public List<UserDetail> getUsersBySubdivision(
            Integer subdivisionId) {

        return userDetailRepository
                .findBySubdivisionId(subdivisionId);
    }

    @Override
    public List<UserDetail> getUsersByPollingStation(
            Integer pollingStationId) {

        return userDetailRepository
                .findByPollingStationId(pollingStationId);
    }

    @Override
    public List<UserDetail> getUsersByDutyRole(
            String dutyRole) {

        return userDetailRepository
                .findByDutyRole(dutyRole);
    }

    @Override
    public List<UserDetail> getActiveUsers() {

        return userDetailRepository
                .findByIsActive(true);
    }

    @Override
    public List<UserDetail> getVerifiedUsers() {

        return userDetailRepository
                .findByIsVerified(true);
    }

    @Override
    public List<UserDetail> getDeviceRegisteredUsers() {

        return userDetailRepository
                .findByDeviceRegistered(true);
    }

    @Override
    public List<UserDetail> getUsersByElectionAndDistrict(
            Integer electionId,
            Integer districtId) {

        return userDetailRepository
                .findByElectionIdAndDistrictId(
                        electionId,
                        districtId);
    }

    @Override
    public List<UserDetail> getUsersByElectionAndPollingStation(
            Integer electionId,
            Integer pollingStationId) {

        return userDetailRepository
                .findByElectionIdAndPollingStationId(
                        electionId,
                        pollingStationId);
    }

    @Override
    public void deleteUser(Long id) {

        if (!userDetailRepository.existsById(id)) {

            throw new RuntimeException(
                    "User not found with ID: " + id);
        }

        userDetailRepository.deleteById(id);
    }
}
