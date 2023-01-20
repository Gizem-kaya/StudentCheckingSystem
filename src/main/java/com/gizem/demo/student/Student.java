package com.gizem.demo.student;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {
    private final UUID studentID;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    public Student(@JsonProperty("studentID") UUID studentID,
                   @JsonProperty("firstName") String firstName,
                   @JsonProperty("lastName") String lastName,
                   @JsonProperty("email") String email,
                   @JsonProperty("gender") Gender gender) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public UUID getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    enum Gender {
        MALE, FEMALE
    }
}
