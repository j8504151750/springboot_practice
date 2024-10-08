package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired  // 引入 StudentRepository
    private StudentRepository studentRepository;

    @PostMapping("/students")
    public String insert(@RequestBody Student student){

        studentRepository.save(student);

        return "執行資料庫create操作";
    }

    @PutMapping("/students/{studentId}")
    public String update(@PathVariable Integer studentId,
                         @RequestBody Student student){

        Student s = studentRepository.findById(studentId).orElse(null);
        if(s != null){
            s.setName(student.getName());
            studentRepository.save(s);
            return "執行資料庫update操作";

        }else {
            return "找不到修改資料";
        }
        //student.setId(studentId);//url路徑裡的

    }

    @DeleteMapping("/students/{studentId}")
    public String delete(@PathVariable Integer studentId){

        studentRepository.deleteById(studentId);

        return "執行資料庫delete操作";
    }

    @GetMapping("/students/{studentId}")
    public Student read(@PathVariable Integer studentId){

        Student student = studentRepository.findById(studentId).orElse(null);

        return student;
    }


}
