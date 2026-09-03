package com.service.election_apis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.election_apis.entity.Election_notification;
import com.service.election_apis.service.ElectionService;



@RestController
@RequestMapping("/api/election")
public class ElectionController {
	
	@Autowired
	private ElectionService service;

    @PostMapping
    public Election_notification create(@RequestBody Election_notification election){
        return service.save(election);
    }

    @GetMapping
    public List<Election_notification> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Election_notification getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Election_notification update(@PathVariable Long id,
                           @RequestBody Election_notification election){

        return service.update(id,election);
    }
    
    
    
    

}
