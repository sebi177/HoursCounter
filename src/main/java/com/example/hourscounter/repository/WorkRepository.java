package com.example.hourscounter.repository;

import com.example.hourscounter.model.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkRepository extends JpaRepository<Work, UUID> {
}
