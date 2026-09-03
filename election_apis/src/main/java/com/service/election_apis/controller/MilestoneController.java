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

import com.service.election_apis.service.MilestoneService;
import com.service.election_apis.entity.Milestone;

@RestController
@RequestMapping("/pdms/v1/milestones")
//@CrossOrigin(origins = "*")
public class MilestoneController {
	
	private final MilestoneService milestoneService;

    public MilestoneController(MilestoneService milestoneService) {
        this.milestoneService = milestoneService;
    }

    // CREATE
//    @PostMapping
//    public ResponseEntity<Milestone> createMilestone(
//            @RequestBody Milestone milestone) {
//
//        Milestone savedMilestone =
//                milestoneService.createMilestone(milestone);
//
//        return new ResponseEntity<>(
//                savedMilestone,
//                HttpStatus.CREATED);
//    }

    // GET ALL
//    @GetMapping
//    public ResponseEntity<List<Milestone>> getAllMilestones() {
//
//        return ResponseEntity.ok(
//                milestoneService.getAllMilestones());
//    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<Milestone> getMilestoneById(
            @PathVariable Integer id) {

        return ResponseEntity.ok(
                milestoneService.getMilestoneById(id));
    }

    // GET ACTIVE
    @GetMapping("/active")
    public ResponseEntity<List<Milestone>> getActiveMilestones() {

        return ResponseEntity.ok(
                milestoneService.getActiveMilestones());
    }

    // GET BY ACTIVE DAY
    @GetMapping("/day/{activeOnDay}")
    public ResponseEntity<List<Milestone>> getMilestonesByDay(
            @PathVariable Integer activeOnDay) {

        return ResponseEntity.ok(
                milestoneService.getActiveMilestonesByDay(activeOnDay,"Y"));
    }
    
 // UPDATE
//    @PutMapping("/{id}")
//    public ResponseEntity<Milestone> updateMilestone(
//            @PathVariable Integer id,
//            @RequestBody Milestone milestone) {
//
//        return ResponseEntity.ok(
//                milestoneService.updateMilestone(id, milestone));
//    }

    // DELETE
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteMilestone(
//            @PathVariable Integer id) {
//
//        milestoneService.deleteMilestone(id);
//
//        return ResponseEntity.noContent().build();
//    }
}


