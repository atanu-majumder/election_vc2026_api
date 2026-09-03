package com.service.election_apis.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.election_apis.entity.MilestoneType;
import com.service.election_apis.service.MilestoneTypeService;

@RestController
@RequestMapping("/pdms/v1/milestonetype")
public class MilestoneTypeController {
	
	private final MilestoneTypeService service;

    public MilestoneTypeController(MilestoneTypeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<MilestoneType>> getAllMilestoneTypes() {

        List<MilestoneType> milestones = service.getAllMilestoneTypes();

        return ResponseEntity.ok(milestones);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<MilestoneType> getMilestoneTypeById(
//            @PathVariable Integer id) {
//
//        MilestoneType milestone = service.getMilestoneTypeById(id);
//
//        return ResponseEntity.ok(milestone);
//    }

}
