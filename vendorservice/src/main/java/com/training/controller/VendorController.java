package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.business.bean.VendorBean;
import com.training.service.VendorService;

@RestController
public class VendorController {
	
	@Autowired
    private VendorService vendorServiceImpl;

    @GetMapping("/")
    public String index() {
        return "Welcome to Spring Boot Vendor Service API!";
    }
    
    @RequestMapping("/vendor/controller/getVendors")
    @GetMapping
    public ResponseEntity<List<VendorBean>> getVendorDetails() {
        List<VendorBean> list = vendorServiceImpl.getVendorDetails();
        return ResponseEntity.ok(list);
    }
}