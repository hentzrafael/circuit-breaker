package com.hentzrafael.loan_service.repositories;

import com.hentzrafael.loan_service.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Integer> {
    List<Loan> findByType(String type);
}