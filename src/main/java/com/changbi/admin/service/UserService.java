package com.changbi.admin.service;

import com.changbi.admin.domain.User;
import com.changbi.admin.mapper.mysql.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Transactional
    public void signUpUser(User user){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setUserPwd(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER");
        userRepository.signUpUser(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.getUserAccount(username);
        if(user == null){
            throw new NullPointerException("회원이 존재하지 않습니다.");
        }

        return user;
    }
}
