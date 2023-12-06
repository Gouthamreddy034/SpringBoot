package com.example.accessrequest.service;


import com.example.accessrequest.entity.Assesment;

import java.util.List;

public interface AssesmentService {
    List<Assesment> findAll();
    Assesment findById(Integer id);
    Assesment save(Assesment employee);
}
