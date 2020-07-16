package com.demo.fleetapp.repository;

import com.demo.fleetapp.model.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMaintenance, Long> {
}
