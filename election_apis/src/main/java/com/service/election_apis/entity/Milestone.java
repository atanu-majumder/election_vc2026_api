package com.service.election_apis.entity;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "mas_milestone", schema = "pdms")
public class Milestone {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "milestone_id")
    private Integer milestoneId;

    @Column(name = "milestone_name", length = 100, nullable = false)
    private String milestoneName;

    @Column(name = "active_on_day", nullable = false)
    private Integer activeOnDay;

    @Column(name = "start_time")
    private OffsetDateTime startTime;

    @Column(name = "responsible_officer")
    private Integer responsibleOfficer;

    @Column(name = "is_active", length = 1, nullable = false)
    private String isActive = "Y";

    @Column(name = "milestone_desc", columnDefinition = "TEXT")
    private String milestoneDesc;

    // Getters and Setters

    public Integer getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(Integer milestoneId) {
        this.milestoneId = milestoneId;
    }

    public String getMilestoneName() {
        return milestoneName;
    }

    public void setMilestoneName(String milestoneName) {
        this.milestoneName = milestoneName;
    }

    public Integer getActiveOnDay() {
        return activeOnDay;
    }

    public void setActiveOnDay(Integer activeOnDay) {
        this.activeOnDay = activeOnDay;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public Integer getResponsibleOfficer() {
        return responsibleOfficer;
    }

    public void setResponsibleOfficer(Integer responsibleOfficer) {
        this.responsibleOfficer = responsibleOfficer;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getMilestoneDesc() {
        return milestoneDesc;
    }

    public void setMilestoneDesc(String milestoneDesc) {
        this.milestoneDesc = milestoneDesc;
    }

}
