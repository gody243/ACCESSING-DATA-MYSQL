package com.example.accessingdatamysql.student;


import java.util.List;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
>>>>>>> b8f3fe1... post & delete request

@RestController
@RequestMapping(path= "api/v1/student")
public class StudentController {
   
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
<<<<<<< HEAD
=======

    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId")Long studentId){
        studentService.deleteService(studentId);
    }
    @PutMapping(path="{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId,
                              @RequestParam(required = false)String name,
                              @RequestParam(required = false)String email){
        studentService.updateStudent(studentId,name,email);

    }
>>>>>>> b8f3fe1... post & delete request
}
