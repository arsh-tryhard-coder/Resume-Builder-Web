package com.r_web.RWB.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="User_Details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;
}
