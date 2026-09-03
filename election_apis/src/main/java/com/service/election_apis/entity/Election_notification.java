package com.service.election_apis.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="election_notification")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Election_notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "election_id")
	private Long electionId;

    @Column(name = "election_name", nullable = false)
    private String electionName;

    @Column(name = "election_type")
    private String electionType;

    @Column(name = "election_date")
    private LocalDate electionDate;

    @Column(name = "nomination_start_date")
    private LocalDate nominationStartDate;

    @Column(name = "nomination_end_date")
    private LocalDate nominationEndDate;

    @Column(name = "date_of_scrutiny")
    private LocalDate dateOfScrutiny;

    @Column(name = "final_nominated_list")
    private LocalDate finalNominatedList;

    @Column(name = "state")
    private String state;

    @Column(name = "tot_no_ac")
    private Integer totNoAc;

	public Long getElectionId() {
		return electionId;
	}

	public void setElectionId(Long electionId) {
		this.electionId = electionId;
	}

	public String getElectionName() {
		return electionName;
	}

	public void setElectionName(String electionName) {
		this.electionName = electionName;
	}

	public String getElectionType() {
		return electionType;
	}

	public void setElectionType(String electionType) {
		this.electionType = electionType;
	}

	public LocalDate getElectionDate() {
		return electionDate;
	}

	public void setElectionDate(LocalDate electionDate) {
		this.electionDate = electionDate;
	}

	public LocalDate getNominationStartDate() {
		return nominationStartDate;
	}

	public void setNominationStartDate(LocalDate nominationStartDate) {
		this.nominationStartDate = nominationStartDate;
	}

	public LocalDate getNominationEndDate() {
		return nominationEndDate;
	}

	public void setNominationEndDate(LocalDate nominationEndDate) {
		this.nominationEndDate = nominationEndDate;
	}

	public LocalDate getDateOfScrutiny() {
		return dateOfScrutiny;
	}

	public void setDateOfScrutiny(LocalDate dateOfScrutiny) {
		this.dateOfScrutiny = dateOfScrutiny;
	}

	public LocalDate getFinalNominatedList() {
		return finalNominatedList;
	}

	public void setFinalNominatedList(LocalDate finalNominatedList) {
		this.finalNominatedList = finalNominatedList;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getTotNoAc() {
		return totNoAc;
	}

	public void setTotNoAc(Integer totNoAc) {
		this.totNoAc = totNoAc;
	}
    
    
    

}
