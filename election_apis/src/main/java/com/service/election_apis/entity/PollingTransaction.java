package com.service.election_apis.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
//import org.springframework.boot.jackson.autoconfigure.JacksonProperties.Json;

import jakarta.persistence.*;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
////import jakarta.persistence.GeneratedValue;
////import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//import jakarta.persistence.Table;

@Entity
@Table(name = "polling_transaction", schema = "pdms")
public class PollingTransaction {

	@Column
	private Integer tran_id;
	
	@Id
	@Column(nullable = false)
	private Integer polling_station_id;
	
	
	
	
	@Column
    private String block;
	@Column
    private String district;
	
	@Column(nullable = false)
    private Integer election_id;
	@Column(nullable = false)
    private String election_name;
	@Column
    private String law_order_at_ps;
	@Column
    private LocalDateTime mock_poll_conducted;
	@Column
    private String name_polling_station;
	@Column
    private LocalDateTime poll_started_at7am;
	
	@Column(columnDefinition = "json")
	@JdbcTypeCode(SqlTypes.JSON)
    private String polling_agent_details;
	
	@Column
    private LocalDateTime polling_party_despatched;
	@Column
    private LocalDateTime polling_party_reached;
	
	@Column(nullable = false)
    private Integer presiding_officer_id;
	@Column
    private Integer state_code;
	@Column
    private String state_name;
	@Column
    private Integer total_polling_agent ;
    
	@Column
    private String village_commitee_name;
	@Column
    private String weather_at_ps;
	


    public PollingTransaction() {
    }



	public Integer getPolling_station_id() {
		return polling_station_id;
	}



	public void setPolling_station_id(Integer polling_station_id) {
		this.polling_station_id = polling_station_id;
	}



	public String getBlock() {
		return block;
	}



	public void setBlock(String block) {
		this.block = block;
	}



	public String getDistrict() {
		return district;
	}



	public void setDistrict(String district) {
		this.district = district;
	}



	public Integer getElection_id() {
		return election_id;
	}



	public void setElection_id(Integer election_id) {
		this.election_id = election_id;
	}



	public String getElection_name() {
		return election_name;
	}



	public void setElection_name(String election_name) {
		this.election_name = election_name;
	}



	public String getLaw_order_at_ps() {
		return law_order_at_ps;
	}



	public void setLaw_order_at_ps(String law_order_at_ps) {
		this.law_order_at_ps = law_order_at_ps;
	}



	public LocalDateTime getMock_poll_conducted() {
		return mock_poll_conducted;
	}



	public void setMock_poll_conducted(LocalDateTime mock_poll_conducted) {
		this.mock_poll_conducted = mock_poll_conducted;
	}



	public String getName_polling_station() {
		return name_polling_station;
	}



	public void setName_polling_station(String name_polling_station) {
		this.name_polling_station = name_polling_station;
	}



	public LocalDateTime getPoll_started_at7am() {
		return poll_started_at7am;
	}



	public void setPoll_started_at7am(LocalDateTime poll_started_at7am) {
		this.poll_started_at7am = poll_started_at7am;
	}



	public String getPolling_agent_details() {
		return polling_agent_details;
	}



	public void setPolling_agent_details(String polling_agent_details) {
		this.polling_agent_details = polling_agent_details;
	}



	public LocalDateTime getPolling_party_despatched() {
		return polling_party_despatched;
	}



	public void setPolling_party_despatched(LocalDateTime polling_party_despatched) {
		this.polling_party_despatched = polling_party_despatched;
	}



	public LocalDateTime getPolling_party_reached() {
		return polling_party_reached;
	}



	public void setPolling_party_reached(LocalDateTime polling_party_reached) {
		this.polling_party_reached = polling_party_reached;
	}



	public Integer getPresiding_officer_id() {
		return presiding_officer_id;
	}



	public void setPresiding_officer_id(Integer presiding_officer_id) {
		this.presiding_officer_id = presiding_officer_id;
	}


	public Integer getTotal_polling_agent() {
		return total_polling_agent;
	}



	public void setTotal_polling_agent(Integer total_polling_agent) {
		this.total_polling_agent = total_polling_agent;
	}


	public String getWeather_at_ps() {
		return weather_at_ps;
	}



	public void setWeather_at_ps(String weather_at_ps) {
		this.weather_at_ps = weather_at_ps;
	}



	public Integer getTran_id() {
		return tran_id;
	}



	public void setTran_id(Integer tran_id) {
		this.tran_id = tran_id;
	}



	public Integer getState_code() {
		return state_code;
	}



	public void setState_code(Integer state_code) {
		this.state_code = state_code;
	}



	public String getState_name() {
		return state_name;
	}



	public void setState_name(String state_name) {
		this.state_name = state_name;
	}



	public String getVillage_commitee_name() {
		return village_commitee_name;
	}



	public void setVillage_commitee_name(String village_commitee_name) {
		this.village_commitee_name = village_commitee_name;
	}

    
}
