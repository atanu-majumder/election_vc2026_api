package com.service.election_apis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="milestone_type", schema="pdms")
public class MilestoneType {
	
    @Id
    @Column(name = "milestone_id")
    private Integer milestoneId;

    @Column(name = "milestone_type", length = 200)
    private String milestoneType;

    public MilestoneType() {
    }

    public MilestoneType(Integer milestoneId, String milestoneType) {
        this.milestoneId = milestoneId;
        this.milestoneType = milestoneType;
    }

    public Integer getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(Integer milestoneId) {
        this.milestoneId = milestoneId;
    }

    public String getMilestoneType() {
        return milestoneType;
    }

    public void setMilestoneType(String milestoneType) {
        this.milestoneType = milestoneType;
    }

}
