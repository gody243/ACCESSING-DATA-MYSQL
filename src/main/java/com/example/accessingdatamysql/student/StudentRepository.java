package com.example.accessingdatamysql.student;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository; 
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;
>>>>>>> b8f3fe1... post & delete request

@Repository
public interface StudentRepository 
        extends JpaRepository<Student, Long> {
<<<<<<< HEAD
=======

    @Query("SELECT s FROM Student s WHERE s.email=?1")
    Optional<Student> findStudentByEmail(String email);
>>>>>>> b8f3fe1... post & delete request
    
}
