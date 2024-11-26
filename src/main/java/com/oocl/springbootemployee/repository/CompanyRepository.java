package com.oocl.springbootemployee.repository;

import com.oocl.springbootemployee.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    List<Company> findAll();
    Company findById(int id);
    Company save(Company company);
    void deleteById(int id);
}
