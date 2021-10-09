package com.bancopan.project.repository;


import com.bancopan.project.model.MaintenanceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepository extends JpaRepository<MaintenanceModel, Long> {
}
