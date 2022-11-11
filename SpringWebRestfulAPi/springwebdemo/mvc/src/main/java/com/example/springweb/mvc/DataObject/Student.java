package com.example.springweb.mvc.DataObject;

public class Student {

    private static Student studentObject = null;

    private int id;

    private String email;

    private String name;

    private long phoneNumber;

    public static Student getStudentInstance() {

        if (studentObject == null)
            studentObject = new Student();

        return studentObject;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Stundent [id=" + id + ", email=" + email + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

    public Student(int id, String email, String name, long phoneNumber) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
