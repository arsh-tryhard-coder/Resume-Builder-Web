package com.r_web.RWB.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name="Resume_details")
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private String phone;

    private String address;

    @Lob
    private String summary;

    @Lob
    private String experience;

    @Lob
    private String education;

    @Lob
    private String skills;

    private Date createdDate;

}
