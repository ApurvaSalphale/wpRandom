package com.sunbeam.controller;

import com.sunbeam.dto.VendorRequest;
import com.sunbeam.dto.VendorResponse;
import com.sunbeam.service.VendorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/vendors")
@CrossOrigin(origins = "*")
public class VendorController {
    
    @Autowired
    private VendorService vendorService;
    
    @PostMapping("/register")
    public ResponseEntity<VendorResponse> addVendor(@Valid @RequestBody VendorRequest request) {
        try {
            VendorResponse response = vendorService.addVendor(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping
    public ResponseEntity<List<VendorResponse>> getAllVendors() {
        List<VendorResponse> vendors = vendorService.getAllVendors();
        return ResponseEntity.ok(vendors);
    }
    
    @GetMapping("/active")
    public ResponseEntity<List<VendorResponse>> getActiveVendors() {
        List<VendorResponse> vendors = vendorService.getActiveVendors();
        return ResponseEntity.ok(vendors);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<VendorResponse> getVendorById(@PathVariable Long id) {
        try {
            VendorResponse vendor = vendorService.getVendorById(id);
            return ResponseEntity.ok(vendor);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/type/{vendorType}")
    public ResponseEntity<List<VendorResponse>> getVendorsByType(@PathVariable String vendorType) {
        try {
            List<VendorResponse> vendors = vendorService.getVendorsByType(vendorType);
            return ResponseEntity.ok(vendors);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @GetMapping("/city/{city}")
    public ResponseEntity<List<VendorResponse>> getVendorsByCity(@PathVariable String city) {
        List<VendorResponse> vendors = vendorService.getVendorsByCity(city);
        return ResponseEntity.ok(vendors);
    }
    
    @GetMapping("/search")
    public ResponseEntity<List<VendorResponse>> searchVendors(@RequestParam String keyword) {
        List<VendorResponse> vendors = vendorService.searchVendors(keyword);
        return ResponseEntity.ok(vendors);
    }
    
    @GetMapping("/filter")
    public ResponseEntity<List<VendorResponse>> getVendorsByTypeAndCity(
            @RequestParam String vendorType,
            @RequestParam String city) {
        try {
            List<VendorResponse> vendors = vendorService.getVendorsByTypeAndCity(vendorType, city);
            return ResponseEntity.ok(vendors);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<VendorResponse> updateVendor(
            @PathVariable Long id,
            @Valid @RequestBody VendorRequest request) {
        try {
            VendorResponse response = vendorService.updateVendor(id, request);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVendor(@PathVariable Long id) {
        try {
            vendorService.deleteVendor(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PutMapping("/{id}/deactivate")
    public ResponseEntity<Void> deactivateVendor(@PathVariable Long id) {
        try {
            vendorService.deactivateVendor(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PutMapping("/{id}/activate")
    public ResponseEntity<Void> activateVendor(@PathVariable Long id) {
        try {
            vendorService.activateVendor(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
    @GetMapping("/types")
    public ResponseEntity<List<String>> getAllVendorTypes() {
        List<String> types = vendorService.getAllVendorTypes();
        return ResponseEntity.ok(types);
    }

    @GetMapping("/counts")
    public ResponseEntity<Map<String, Long>> getCountsByType() {
        return ResponseEntity.ok(vendorService.getActiveCountsByType());
    }

    @PostMapping("/seed")
    public ResponseEntity<Void> seedSampleVendors() {
        vendorService.seedSampleVendors();
        return ResponseEntity.ok().build();
    }
}
