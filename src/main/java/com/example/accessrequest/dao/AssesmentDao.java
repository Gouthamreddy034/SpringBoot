package com.example.accessrequest.dao;


import com.example.accessrequest.entity.Assesment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssesmentDao extends JpaRepository<Assesment,Integer> {
}
