package com.service.election_apis.entity;

import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
    name = "nomination",
    schema = "nomination"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Nomination {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id")
    private Integer id;

    @Column(name = "election_id", nullable = false)
    private Integer electionId;

    @Column(name = "constituency_type_id", nullable = false)
    private Integer constituencyTypeId;

    @Column(name = "district_id", nullable = false)
    private Integer districtId;

    @Column(name = "block_id", nullable = false)
    private Integer blockId;

    @Column(name = "constituency_code", nullable = false)
    private Integer constituencyCode;

    @Column(name = "gp_id")
    private Integer gpId;

    @Column(name = "word_id")
    private Integer wordId;

    @Column(name = "seat_no", length = 10)
    private String seatNo;

    @Column(name = "candidate_name", nullable = false, length = 100)
    private String candidateName;

    @Column(name = "guardian", length = 100)
    private String guardian;

    @Column(name = "relation", length = 50)
    private String relation;

    @Column(name = "postal_address", nullable = false, columnDefinition = "TEXT")
    private String postalAddress;

    @Column(name = "form2_scanned", columnDefinition = "TEXT")
    private String form2Scanned;

    @Column(name = "form2_esigned", columnDefinition = "TEXT")
    private String form2Esigned;

    @Column(name = "authorization_letter", columnDefinition = "TEXT")
    private String authorizationLetter;

    @Column(name = "party_id")
    private Integer partyId;

    @Column(name = "ind_party_symbol_id")
    private Integer indPartySymbolId;

    @Column(name = "submission_dt")
    private OffsetDateTime submissionDt;

    @Column(name = "is_accepted")
    private Boolean isAccepted;

    @Column(name = "ip", length = 50)
    private String ip;

    @Column(name = "user_id", length = 50)
    private String userId;

}
