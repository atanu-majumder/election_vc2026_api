package com.service.election_apis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.election_apis.service.UserDetailService;
import com.service.election_apis.entity.UserDetail;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping("/pdms/v1/users")
public class UserDetailController {
	
	private final UserDetailService userDetailService;

    public UserDetailController(
            UserDetailService userDetailService) {

        this.userDetailService = userDetailService;
    }


    // CREATE USER
    @Operation(
            summary = "Create user",
            description = "Creates a new election duty user"
    )
    @PostMapping
    public ResponseEntity<UserDetail> createUser(
            @RequestBody UserDetail user) {

        UserDetail savedUser =
                userDetailService.createUser(user);

        return new ResponseEntity<>(
                savedUser,
                HttpStatus.CREATED);
    }


    // GET ALL USERS
    @Operation(
            summary = "Get all users",
            description = "Returns all election duty users"
    )
    @GetMapping
    public ResponseEntity<List<UserDetail>> getAllUsers() {

        return ResponseEntity.ok(
                userDetailService.getAllUsers());
    }


    // GET USER BY ID
    @Operation(
            summary = "Get user by ID",
            description = "Returns user details using user ID"
    )
    @GetMapping("/{id}")
    public ResponseEntity<UserDetail> getUserById(

            @Parameter(
                    description = "User ID",
                    example = "1"
            )
            @PathVariable Long id) {

        return ResponseEntity.ok(
                userDetailService.getUserById(id));
    }


    // GET USER BY USERNAME
    @Operation(
            summary = "Get user by username"
    )
    @GetMapping("/username/{username}")
    public ResponseEntity<UserDetail> getUserByUsername(

            @Parameter(
                    description = "Username",
                    example = "po001"
            )
            @PathVariable String username) {

        return ResponseEntity.ok(
                userDetailService
                        .getUserByUsername(username));
    }


    // GET USER BY MOBILE
    @Operation(
            summary = "Get user by mobile number"
    )
    @GetMapping("/mobile/{mobileNo}")
    public ResponseEntity<UserDetail> getUserByMobileNo(

            @Parameter(
                    description = "Mobile number",
                    example = "9876543210"
            )
            @PathVariable String mobileNo) {

        return ResponseEntity.ok(
                userDetailService
                        .getUserByMobileNo(mobileNo));
    }


    // GET USERS BY ELECTION
//    @Operation(
//            summary = "Get users by election"
//    )
//    @GetMapping("/election/{electionId}")
//    public ResponseEntity<List<UserDetail>>
//    getUsersByElection(
//
//            @PathVariable Integer electionId) {
//
//        return ResponseEntity.ok(
//                userDetailService
//                        .getUsersByElection(electionId));
//    }


    // GET USERS BY DISTRICT
//    @Operation(
//            summary = "Get users by district"
//    )
//    @GetMapping("/district/{districtId}")
//    public ResponseEntity<List<UserDetail>>
//    getUsersByDistrict(
//
//            @PathVariable Integer districtId) {
//
//        return ResponseEntity.ok(
//                userDetailService
//                        .getUsersByDistrict(districtId));
//    }


    // GET USERS BY SUBDIVISION
//    @Operation(
//            summary = "Get users by subdivision"
//    )
//    @GetMapping("/subdivision/{subdivisionId}")
//    public ResponseEntity<List<UserDetail>>
//    getUsersBySubdivision(
//
//            @PathVariable Integer subdivisionId) {
//
//        return ResponseEntity.ok(
//                userDetailService
//                        .getUsersBySubdivision(subdivisionId));
//    }


    // GET USERS BY POLLING STATION
//    @Operation(
//            summary = "Get users by polling station"
//    )
//    @GetMapping("/polling-station/{pollingStationId}")
//    public ResponseEntity<List<UserDetail>>
//    getUsersByPollingStation(
//
//            @PathVariable Integer pollingStationId) {
//
//        return ResponseEntity.ok(
//                userDetailService
//                        .getUsersByPollingStation(
//                                pollingStationId));
//    }


    // GET USERS BY DUTY ROLE
//    @Operation(
//            summary = "Get users by duty role"
//    )
//    @GetMapping("/role/{dutyRole}")
//    public ResponseEntity<List<UserDetail>>
//    getUsersByDutyRole(
//
//            @PathVariable String dutyRole) {
//
//        return ResponseEntity.ok(
//                userDetailService
//                        .getUsersByDutyRole(dutyRole));
//    }


    // GET ACTIVE USERS
//    @Operation(
//            summary = "Get active users"
//    )
//    @GetMapping("/active")
//    public ResponseEntity<List<UserDetail>>
//    getActiveUsers() {
//
//        return ResponseEntity.ok(
//                userDetailService.getActiveUsers());
//    }


    // GET VERIFIED USERS
//    @Operation(
//            summary = "Get verified users"
//    )
//    @GetMapping("/verified")
//    public ResponseEntity<List<UserDetail>>
//    getVerifiedUsers() {
//
//        return ResponseEntity.ok(
//                userDetailService.getVerifiedUsers());
//    }


    // GET DEVICE REGISTERED USERS
    @Operation(
            summary = "Get device registered users"
    )
    @GetMapping("/device-registered")
    public ResponseEntity<List<UserDetail>>
    getDeviceRegisteredUsers() {

        return ResponseEntity.ok(
                userDetailService
                        .getDeviceRegisteredUsers());
    }


    // GET USERS BY ELECTION + DISTRICT
    @Operation(
            summary = "Get users by election and district"
    )
    @GetMapping("/election/{electionId}/district/{districtId}")
    public ResponseEntity<List<UserDetail>>
    getUsersByElectionAndDistrict(

            @PathVariable Integer electionId,
            @PathVariable Integer districtId) {

        return ResponseEntity.ok(
                userDetailService
                        .getUsersByElectionAndDistrict(
                                electionId,
                                districtId));
    }


    // GET USERS BY ELECTION + POLLING STATION
    @Operation(
            summary = "Get users by election and polling station"
    )
    @GetMapping("/election/{electionId}/polling-station/{pollingStationId}")
    public ResponseEntity<List<UserDetail>>
    getUsersByElectionAndPollingStation(

            @PathVariable Integer electionId,
            @PathVariable Integer pollingStationId) {

        return ResponseEntity.ok(
                userDetailService
                        .getUsersByElectionAndPollingStation(
                                electionId,
                                pollingStationId));
    }


    // UPDATE USER
    @Operation(
            summary = "Update user",
            description = "Updates an existing election duty user"
    )
    @PutMapping("/{id}")
    public ResponseEntity<UserDetail> updateUser(

            @PathVariable Long id,
            @RequestBody UserDetail user) {

        return ResponseEntity.ok(
                userDetailService
                        .updateUser(id, user));
    }


    // DELETE USER
//    @Operation(
//            summary = "Delete user"
//    )
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUser(
//
//            @PathVariable Long id) {
//
//        userDetailService.deleteUser(id);
//
//        return ResponseEntity.noContent().build();
//    }

}
