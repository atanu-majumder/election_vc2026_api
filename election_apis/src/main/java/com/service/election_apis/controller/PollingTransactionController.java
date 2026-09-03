package com.service.election_apis.controller;



//import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.election_apis.entity.PollingTransaction;
import com.service.election_apis.service.PollingTransactionService;


@RestController
@RequestMapping("/pdms/v1/pstran")
public class PollingTransactionController {

	private final PollingTransactionService service;

    public PollingTransactionController(
            PollingTransactionService service) {

        this.service = service;
    }


    // =====================================================
    // GET ALL
    // =====================================================

//    @GetMapping
//    public ResponseEntity<List<PollingTransaction>>
//    getAllPollingTransactions() {
//
//        return ResponseEntity.ok(
//                service.getAllPollingTransactions()
//        );
//    }


    // =====================================================
    // GET BY POLLING STATION ID
    // =====================================================

    @GetMapping("/{pollingStationId}")
    public ResponseEntity<?> getByPollingStationId(
            @PathVariable Integer pollingStationId) {

        PollingTransaction transaction =
                service.getByPollingStationId(pollingStationId);

        if (transaction == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Polling Station ID " + pollingStationId + " not found");
        }

        return ResponseEntity.ok(transaction);
    }

    // =====================================================
    // CREATE
    // =====================================================

    @PostMapping()
    public ResponseEntity<PollingTransaction>
    createPollingTransaction(

            @RequestBody
            PollingTransaction pollingTransaction) {  		    

        PollingTransaction saved =
                service.createPollingTransaction(
                        pollingTransaction
                );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(saved);
    }


    // =====================================================
    // UPDATE
    // =====================================================
//
    @PutMapping("/{pollingStationId}")
    public ResponseEntity<PollingTransaction>
    updatePollingTransaction(

            @PathVariable Integer pollingStationId,

            @RequestBody
            PollingTransaction pollingTransaction) {

        PollingTransaction updated =
                service.updatePollingTransaction(
                        pollingStationId,
                        pollingTransaction
                );

        return ResponseEntity.ok(updated);
    }


    // =====================================================
    // DELETE
    // =====================================================

//    @DeleteMapping("/{pollingStationId}")
//    public ResponseEntity<Void>
//    deletePollingTransaction(
//
//            @PathVariable Integer pollingStationId) {
//
//        service.deletePollingTransaction(
//                pollingStationId
//        );
//
//        return ResponseEntity.noContent().build();
//    }
}
