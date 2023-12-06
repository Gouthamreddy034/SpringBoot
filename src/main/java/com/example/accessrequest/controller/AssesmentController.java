package com.example.accessrequest.controller;

import com.example.accessrequest.entity.Assesment;
import com.example.accessrequest.service.AssesmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("assesment")
@CrossOrigin(origins = "http://localhost:4200")
public class AssesmentController {
    private AssesmentService assesmentService;
    AssesmentController(AssesmentService assesmentService){
        this.assesmentService = assesmentService;
    }
    @GetMapping("/record/{id}")
    public Assesment recordId(@PathVariable int id){
        return assesmentService.findById(id);
    }
    @PostMapping("/record")
    public void saving(@RequestBody Assesment assesment){
        assesmentService.save(assesment);
    }
    @GetMapping("/records")
    public List<Assesment> getAll(){
        return assesmentService.findAll();
    }
}
