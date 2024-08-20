package com.example.demo;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class StudentController {

    @PostMapping("/students")
    public String create(@RequestBody @Valid Student student) {
        return "執行create操作";
    }

    @GetMapping("/students/{studentId}")
    public String read(@PathVariable Integer studentId) {
        return "執行read操作";
    }


    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student) {
        return "執行update操作";
    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable String studentId) {
        return "執行delete操作";
    }

}
