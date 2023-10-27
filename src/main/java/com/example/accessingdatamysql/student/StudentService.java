package com.example.accessingdatamysql.student;


import java.util.List;
<<<<<<< HEAD

=======
import java.util.Objects;
import java.util.Optional;
>>>>>>> b8f3fe1... post & delete request
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


<<<<<<< HEAD

=======
>>>>>>> b8f3fe1... post & delete request
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student){
<<<<<<< HEAD
        System.out.println(student);
    }
=======
       Optional<Student>studentOptional= studentRepository
                .findStudentByEmail(student.getEmail());
       if(studentOptional.isPresent()){
           throw new IllegalStateException("email taken");
       }
       studentRepository.save(student);
        System.out.println(student);
    }

    public void deleteService(Long studentId) {

       boolean exists= studentRepository.existsById(studentId);
       if(!exists){
           throw new IllegalStateException(
                   "student with id "+ studentId+" does not exist"
           );
       }
         studentRepository.deleteById(studentId);
    }

    public void updateStudent(Long studentId,
                              String name,
                              String email) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(()->new IllegalStateException("student with id "+studentId+" does not exist"));
        if (name !=null &&
                name.length()>0 &&
                !Objects.equals(student.getName(),name)){
            student.setName(name);
        }

        if (email !=null &&
                email.length()>0 &&
                !Objects.equals(student.getEmail(),email)){
           Optional<Student>studentOptional=studentRepository
                   .findStudentByEmail(email);
           if(studentOptional.isPresent()){
               throw new IllegalStateException("email taken");
           }
            student.setEmail(email);
        }
    }
>>>>>>> b8f3fe1... post & delete request
}
