package com.service.election_apis.entity;

import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_detail", schema = "pdms")
public class UserDetail {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username", length = 100, nullable = false)
    private String username;

    @Column(name = "mobile_no", length = 15, nullable = false)
    private String mobileNo;

    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "emp_code", length = 50)
    private String empCode;

    @Column(name = "emp_name", length = 150, nullable = false)
    private String empName;

    @Column(name = "designation", length = 100)
    private String designation;

    @Column(name = "gender", length = 20)
    private String gender;

    @Column(name = "election_id", nullable = false)
    private Integer electionId;

    @Column(name = "district_id", nullable = false)
    private Integer districtId;

    @Column(name = "subdivision_id")
    private Integer subdivisionId;

    @Column(name = "constituency_type_id")
    private Integer constituencyTypeId;

    @Column(name = "constituency_code")
    private Integer constituencyCode;

    @Column(name = "polling_station_id")
    private Integer pollingStationId;

    @Column(name = "polling_station_code", length = 30)
    private String pollingStationCode;

    @Column(name = "polling_station_name", length = 255)
    private String pollingStationName;

    @Column(name = "polling_station_address", columnDefinition = "TEXT")
    private String pollingStationAddress;

    @Column(name = "duty_role", length = 50, nullable = false)
    private String dutyRole = "PRESIDING_OFFICER";

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    @Column(name = "is_verified", nullable = false)
    private Boolean isVerified = false;

    @Column(name = "is_locked", nullable = false)
    private Boolean isLocked = false;

    @Column(name = "failed_login_attempts", nullable = false)
    private Integer failedLoginAttempts = 0;

    @Column(name = "last_login_at")
    private OffsetDateTime lastLoginAt;

    @Column(name = "last_logout_at")
    private OffsetDateTime lastLogoutAt;

    @Column(name = "device_registered", nullable = false)
    private Boolean deviceRegistered = false;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getElectionId() {
        return electionId;
    }

    public void setElectionId(Integer electionId) {
        this.electionId = electionId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getSubdivisionId() {
        return subdivisionId;
    }

    public void setSubdivisionId(Integer subdivisionId) {
        this.subdivisionId = subdivisionId;
    }

    public Integer getConstituencyTypeId() {
        return constituencyTypeId;
    }

    public void setConstituencyTypeId(Integer constituencyTypeId) {
        this.constituencyTypeId = constituencyTypeId;
    }

    public Integer getConstituencyCode() {
        return constituencyCode;
    }

    public void setConstituencyCode(Integer constituencyCode) {
        this.constituencyCode = constituencyCode;
    }

    public Integer getPollingStationId() {
        return pollingStationId;
    }

    public void setPollingStationId(Integer pollingStationId) {
        this.pollingStationId = pollingStationId;
    }

    public String getPollingStationCode() {
        return pollingStationCode;
    }

    public void setPollingStationCode(String pollingStationCode) {
        this.pollingStationCode = pollingStationCode;
    }

    public String getPollingStationName() {
        return pollingStationName;
    }

    public void setPollingStationName(String pollingStationName) {
        this.pollingStationName = pollingStationName;
    }

    public String getPollingStationAddress() {
        return pollingStationAddress;
    }

    public void setPollingStationAddress(String pollingStationAddress) {
        this.pollingStationAddress = pollingStationAddress;
    }

    public String getDutyRole() {
        return dutyRole;
    }

    public void setDutyRole(String dutyRole) {
        this.dutyRole = dutyRole;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Integer getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public void setFailedLoginAttempts(Integer failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    public OffsetDateTime getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(OffsetDateTime lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public OffsetDateTime getLastLogoutAt() {
        return lastLogoutAt;
    }

    public void setLastLogoutAt(OffsetDateTime lastLogoutAt) {
        this.lastLogoutAt = lastLogoutAt;
    }

    public Boolean getDeviceRegistered() {
        return deviceRegistered;
    }

    public void setDeviceRegistered(Boolean deviceRegistered) {
        this.deviceRegistered = deviceRegistered;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
