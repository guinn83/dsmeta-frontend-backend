package com.wa.dsmeta.controllers;

import com.wa.dsmeta.entities.Sale;
import com.wa.dsmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<List<Sale>> findAll() {
        return ResponseEntity.ok().body(service.findSales());
    }
}
