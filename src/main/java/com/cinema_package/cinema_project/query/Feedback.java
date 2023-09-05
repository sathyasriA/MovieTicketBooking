package com.cinema_package.cinema_project.query;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table
public class Feedback {
    @Id
    @SequenceGenerator(
            name = "feedback_sequencw",
            sequenceName = "feedback_sequencw",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "feedback_sequencw"
    )
    private int id;
    private String firstName;
    private String LastName;
    private String email;
    private String contactNumber;
    private String message;

    public Feedback(int id, String firstName, String LastName, String email, String contactNumber, String message) {
            this.id = id;
            this.firstName = firstName;
            this.LastName = LastName;
            this.email = email;
            this.contactNumber = contactNumber;
            this.message = message;
        }

    public Feedback() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
