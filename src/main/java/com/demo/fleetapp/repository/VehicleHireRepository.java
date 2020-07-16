package com.demo.fleetapp.repository;

import com.demo.fleetapp.model.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Long> {
}
