package com.hentzrafael.rate_service.repositories;

import com.hentzrafael.rate_service.entities.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RateRepository extends JpaRepository<Rate, Integer> {
    Optional<Rate> findByType(String type);
}