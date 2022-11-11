package com.example.springweb.mvc.Controller;

import java.util.HashMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.example.springweb.mvc.DataObject.Student;

@SpringBootApplication
@RestController
@RequestMapping("/student")
public class FethDetails {

    @RequestMapping("/getStudnetDetails")

    public static HashMap<String, Object> getDetails() {

        HashMap reepsonseObject = new HashMap<String, Object>();
        Student s = Student.getStudentInstance();
        try {

            reepsonseObject.put("reepsonseObject", s);

        } catch (Exception e) {

        }

        return reepsonseObject;
    }

    @RequestMapping("/updateStudentDetails")

    public static String updateStudentDetails(@RequestParam String studentName, @RequestParam String email,
            @RequestParam long phoneNumber) {

        Student studentObject = Student.getStudentInstance();
        try {
            studentObject.setEmail(email);
            studentObject.setName(studentName);
            studentObject.setPhoneNumber(phoneNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return studentObject.toString();
    }

}
