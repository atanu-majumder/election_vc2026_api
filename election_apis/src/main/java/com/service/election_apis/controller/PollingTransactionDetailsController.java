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

import com.service.election_apis.entity.PollingTransactionDetails;
import com.service.election_apis.service.PollingTransactionDetailsService;

@RestController
@RequestMapping("/pdms/v1/pstrandet")
//@CrossOrigin(origins = "*")
public class PollingTransactionDetailsController {

	private final PollingTransactionDetailsService service;

    public PollingTransactionDetailsController(
            PollingTransactionDetailsService service) {

        this.service = service;
    }


    // =====================================================
    // CREATE
    // =====================================================

    @PostMapping()
    public ResponseEntity<PollingTransactionDetails> createPSDetails(@RequestBody PollingTransactionDetails details) {
    	
//    	System.out.println(
//		        "Polling Station ID = "
//		        + details + details.getAssignedVotersDetails() + "~~" + details.getTranId() + "~~" + details.getTranSubId()
//		    );


        PollingTransactionDetails saved = service.createPollingTransactionDetails(details);

//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .body(saved);
        
        
        return new ResponseEntity<>(
                saved,
                HttpStatus.CREATED);
    }


    // =====================================================
    // GET ALL
    // =====================================================

//    @GetMapping
//    public ResponseEntity<List<PollingTransactionDetails>>
//    getAll() {
//
//        return ResponseEntity.ok(
//                service.getAllPollingTransactionDetails()
//        );
//    }


    // =====================================================
    // GET BY COMPOSITE ID
    // =====================================================

    @GetMapping("/{pollingStationId}/{seatNo}")
    public ResponseEntity<PollingTransactionDetails>
    getById(

            @PathVariable Integer pollingStationId,

            @PathVariable Integer seatNo) {

        return ResponseEntity.ok(
                service.getPollingTransactionDetailsById(
                        pollingStationId,
                        seatNo
                )
        );
    }



    // =====================================================
    // UPDATE
    // =====================================================

    @PutMapping("/{pollingStationId}/{seatNo}")
    public ResponseEntity<PollingTransactionDetails>
    update(

            @PathVariable Integer pollingStationId,

            @PathVariable Integer seatNo,

            @RequestBody
            PollingTransactionDetails details) {

        return ResponseEntity.ok(
                service.updatePollingTransactionDetails(
                        pollingStationId,
                        seatNo,
                        details
                )
        );
    }


    // =====================================================
    // DELETE
    // =====================================================

//    @DeleteMapping("/{pollingStationId}/{vcConstituencyNo}")
//    public ResponseEntity<Void>
//    delete(
//
//            @PathVariable Integer pollingStationId,
//
//            @PathVariable Integer vcConstituencyNo) {
//
//        service.deletePollingTransactionDetails(
//                pollingStationId,
//                vcConstituencyNo
//        );
//
//        return ResponseEntity.noContent().build();
//    }
}
