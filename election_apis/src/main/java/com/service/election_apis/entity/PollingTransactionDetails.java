package com.service.election_apis.entity;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;


@Entity
@Table(name="polling_transaction_details", schema="pdms")
@IdClass(PollingTransactionDetailsId.class)
public class PollingTransactionDetails {
	
	@Column(name = "tran_id", nullable = false)
    private Integer tranId;

    @Column(name="tran_sub_id",  nullable = false)
    private Long tranSubId;

    @Id
    @Column(
            name = "polling_station_id",
            nullable = false
    )
    private Integer pollingStationId;

    @Id
    @Column(name="seat_no", nullable = false)
    private Integer seatNo;
    
   
    @Column(
            name = "vc_constituency_no",
            nullable = false
    )
    private Integer vcConstituencyNo;

    @Column(
            name = "name_polling_station",
            nullable = false
    )
    private String namePollingStation;

    @Column(name = "vc_constituency_name")
    private String vcConstituencyName;

    @Column(name = "election_id", nullable = false)
    private Integer electionId;

    @Column(name = "election_name")
    private String electionName;

    @Column(
            name = "entry_by",
            nullable = false
    )
    private Integer entryBy;
    
    @Column(
            name = "entry_by_name",
            nullable = false
    )
    private String entryByName;

    @Column(
            name = "final_electors_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String finalElectorsDetails;

    @Column(name = "tot_final_electors")
    private Long totFinalElectors;

    @Column(
            name = "assigned_voters_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String assignedVotersDetails;

    @Column(name = "tot_assigned_voters")
    private Long totAssignedVoters;

    @Column(
            name = "tournout_7to9_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String tournout7to9Details;

    @Column(name = "tournout_7to9_total")
    private Integer tournout7to9Total;

    @Column(
            name = "tournout_9to11_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String tournout9to11Details;

    @Column(name = "tournout_9to11_total")
    private Integer tournout9to11Total;

    @Column(
            name = "tournout_11to13_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String tournout11to13Details;

    @Column(name = "tournout_11to13_total")
    private Integer tournout11to13Total;

    @Column(
            name = "tournout_13to15_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String tournout13to15Details;

    @Column(name = "tournout_13to15_total")
    private Integer tournout13to15Total;

    @Column(
            name = "tournout_15to16_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String tournout15to16Details;

    @Column(name = "tournout_15to16_total")
    private Integer tournout15to16Total;

    @Column(name = "is_poll_completed_at_16")
    private Boolean isPollCompletedAt16;

    @Column(name = "no_slip_issued_after_16")
    private Integer noSlipIssuedAfter16;

    @Column(
            name = "tournout_after16_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String tournoutAfter16Details;

    @Column(name = "tournout_after16_total")
    private Integer tournoutAfter16Total;

    @Column(
            name = "total_vote_cast_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String totalVoteCastDetails;

    @Column(name = "total_vote_cast")
    private Long totalVoteCast;

    @Column(
            name = "final_vote_cast_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String finalVoteCastDetails;

    @Column(name = "final_vote_cast")
    private Long finalVoteCast;

    @Column(
            name = "percentage_vote_details", columnDefinition = "json"
    )
    @JdbcTypeCode(SqlTypes.JSON)
    private String percentageVoteDetails;

    @Column(name = "percentage_vote")
    private Double percentageVote;


    public PollingTransactionDetails() {
    }

    // Getters and Setters

    public Integer getTranId() {
        return tranId;
    }

    public void setTranId(Integer tranId) {
        this.tranId = tranId;
    }

    public Long getTranSubId() {
        return tranSubId;
    }

    public void setTranSubId(Long tranSubId) {
        this.tranSubId = tranSubId;
    }

    public Integer getPollingStationId() {
        return pollingStationId;
    }

    public void setPollingStationId(Integer pollingStationId) {
        this.pollingStationId = pollingStationId;
    }
    
    public Integer getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}


    public Integer getVcConstituencyNo() {
        return vcConstituencyNo;
    }

    public void setVcConstituencyNo(Integer vcConstituencyNo) {
        this.vcConstituencyNo = vcConstituencyNo;
    }

    public String getNamePollingStation() {
        return namePollingStation;
    }

    public void setNamePollingStation(String namePollingStation) {
        this.namePollingStation = namePollingStation;
    }

    public String getVcConstituencyName() {
        return vcConstituencyName;
    }

    public void setVcConstituencyName(String vcConstituencyName) {
        this.vcConstituencyName = vcConstituencyName;
    }

    public Integer getElectionId() {
        return electionId;
    }

    public void setElectionId(Integer electionId) {
        this.electionId = electionId;
    }

    public String getElectionName() {
        return electionName;
    }

    public void setElectionName(String electionName) {
        this.electionName = electionName;
    }

	public Integer getEntryBy() {
		return entryBy;
	}

	public void setEntryBy(Integer entryBy) {
		this.entryBy = entryBy;
	}

	public String getEntryByName() {
		return entryByName;
	}

	public void setEntryByName(String entryByName) {
		this.entryByName = entryByName;
	}

	public String getFinalElectorsDetails() {
        return finalElectorsDetails;
    }

    public void setFinalElectorsDetails(String finalElectorsDetails) {
        this.finalElectorsDetails = finalElectorsDetails;
    }

    public Long getTotFinalElectors() {
        return totFinalElectors;
    }

    public void setTotFinalElectors(Long totFinalElectors) {
        this.totFinalElectors = totFinalElectors;
    }

    public String getAssignedVotersDetails() {
        return assignedVotersDetails;
    }

    public void setAssignedVotersDetails(String assignedVotersDetails) {
        this.assignedVotersDetails = assignedVotersDetails;
    }

    public Long getTotAssignedVoters() {
        return totAssignedVoters;
    }

    public void setTotAssignedVoters(Long totAssignedVoters) {
        this.totAssignedVoters = totAssignedVoters;
    }

    public String getTournout7to9Details() {
        return tournout7to9Details;
    }

    public void setTournout7to9Details(String value) {
        this.tournout7to9Details = value;
    }

    public Integer getTournout7to9Total() {
        return tournout7to9Total;
    }

    public void setTournout7to9Total(Integer value) {
        this.tournout7to9Total = value;
    }

    public String getTournout9to11Details() {
        return tournout9to11Details;
    }

    public void setTournout9to11Details(String value) {
        this.tournout9to11Details = value;
    }

    public Integer getTournout9to11Total() {
        return tournout9to11Total;
    }

    public void setTournout9to11Total(Integer value) {
        this.tournout9to11Total = value;
    }

    public String getTournout11to13Details() {
        return tournout11to13Details;
    }

    public void setTournout11to13Details(String value) {
        this.tournout11to13Details = value;
    }

    public Integer getTournout11to13Total() {
        return tournout11to13Total;
    }

    public void setTournout11to13Total(Integer value) {
        this.tournout11to13Total = value;
    }

    public String getTournout13to15Details() {
        return tournout13to15Details;
    }

    public void setTournout13to15Details(String value) {
        this.tournout13to15Details = value;
    }

    public Integer getTournout13to15Total() {
        return tournout13to15Total;
    }

    public void setTournout13to15Total(Integer value) {
        this.tournout13to15Total = value;
    }

    public String getTournout15to16Details() {
        return tournout15to16Details;
    }

    public void setTournout15to16Details(String value) {
        this.tournout15to16Details = value;
    }

    public Integer getTournout15to16Total() {
        return tournout15to16Total;
    }

    public void setTournout15to16Total(Integer value) {
        this.tournout15to16Total = value;
    }

    public Boolean getIsPollCompletedAt16() {
        return isPollCompletedAt16;
    }

    public void setIsPollCompletedAt16(Boolean value) {
        this.isPollCompletedAt16 = value;
    }

    public Integer getNoSlipIssuedAfter16() {
        return noSlipIssuedAfter16;
    }

    public void setNoSlipIssuedAfter16(Integer value) {
        this.noSlipIssuedAfter16 = value;
    }

    public String getTournoutAfter16Details() {
        return tournoutAfter16Details;
    }

    public void setTournoutAfter16Details(String value) {
        this.tournoutAfter16Details = value;
    }

    public Integer getTournoutAfter16Total() {
        return tournoutAfter16Total;
    }

    public void setTournoutAfter16Total(Integer value) {
        this.tournoutAfter16Total = value;
    }

    public String getTotalVoteCastDetails() {
        return totalVoteCastDetails;
    }

    public void setTotalVoteCastDetails(String value) {
        this.totalVoteCastDetails = value;
    }

    public Long getTotalVoteCast() {
        return totalVoteCast;
    }

    public void setTotalVoteCast(Long value) {
        this.totalVoteCast = value;
    }

    public String getFinalVoteCastDetails() {
        return finalVoteCastDetails;
    }

    public void setFinalVoteCastDetails(String value) {
        this.finalVoteCastDetails = value;
    }

    public Long getFinalVoteCast() {
        return finalVoteCast;
    }

    public void setFinalVoteCast(Long value) {
        this.finalVoteCast = value;
    }

    public String getPercentageVoteDetails() {
        return percentageVoteDetails;
    }

    public void setPercentageVoteDetails(String value) {
        this.percentageVoteDetails = value;
    }

    public Double getPercentageVote() {
        return percentageVote;
    }

    public void setPercentageVote(Double value) {
        this.percentageVote = value;
    }

}
