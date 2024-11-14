package com.customspring.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Nahian",
                        26,
                        LocalDate.of(1999, Month.JULY,7),
                        "nahian@gmail.com"
                )
        );
    }
}
