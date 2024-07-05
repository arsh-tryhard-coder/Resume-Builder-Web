package com.r_web.RWB.Service;

import ch.qos.logback.classic.Logger;
import com.r_web.RWB.Entity.User;
import com.r_web.RWB.Repository.UserRepository;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;




@Component
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    private static final Logger logger = (Logger) LoggerFactory.getLogger(UserService.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            logger.error("User not found: {}", username);
            throw new UsernameNotFoundException("User not found");
        }

         // Encode the password "ars"

      /*  if (username.equals("Arsh_Rumi")) {
            logger.info("Username matches: {}", username);
            if ((user.getPassword()).equals("ars")) {
                logger.info("Password matches");
                org.springframework.security.core.userdetails.User.UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(username);
                builder.password(user.getPassword());
                return builder.build();
            } else {
                logger.info("Password does not match");
            }
        } */
        org.springframework.security.core.userdetails.User.UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(username);
        builder.password(user.getPassword());

        return builder.build();
    }
}
