package com.example.skeleton.domain.district.repository;

import com.example.skeleton.domain.district.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DistrictRepository extends JpaRepository<District, Long> {
    Optional<District> findByDosiAndSgg(String dosi, String sgg);
}
