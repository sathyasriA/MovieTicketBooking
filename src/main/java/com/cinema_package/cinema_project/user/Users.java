package com.cinema_package.cinema_project.user;

import jakarta.persistence.*;

@Entity
@Table
public class Users {
    @Id
    @SequenceGenerator(
            name = "movie_id_sequence",
            sequenceName = "movie_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "movie_id_sequence"
    )
    private int id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    public Users(int id, String userName, String password, String firstName, String lastName) {
            this.id = id;
            this.userName = userName;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
        }

    public Users() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
