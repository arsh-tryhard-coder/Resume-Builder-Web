package com.r_web.RWB.Repository;

import com.r_web.RWB.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String usernname);
        User findByEmail(String email);
    }

