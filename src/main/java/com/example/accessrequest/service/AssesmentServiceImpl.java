package com.example.accessrequest.service;

import com.example.accessrequest.dao.AssesmentDao;
import com.example.accessrequest.entity.Assesment;
import com.example.accessrequest.exception.MyException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssesmentServiceImpl implements AssesmentService{

    private AssesmentDao assesmentDao;
    AssesmentServiceImpl(AssesmentDao assesmentDao){
        this.assesmentDao = assesmentDao;
    }
    @Override
    public List<Assesment> findAll() {
        return assesmentDao.findAll();
    }

    @Override
    public Assesment findById(Integer id) {
        return assesmentDao
                .findById(id)
                .orElseThrow(() -> new MyException("Employee not existed with Id :" + id));
    }

    @Override
    public Assesment save(Assesment assesment) {
        return assesmentDao.save(assesment);
    }
}
