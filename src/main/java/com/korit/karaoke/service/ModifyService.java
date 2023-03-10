package com.korit.karaoke.service;

import com.korit.karaoke.entity.UserMst;
import com.korit.karaoke.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.Map;

@Slf4j
@Service
public class ModifyService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public boolean checkPassword(UserMst user, String checkPassword) {
        String realPassword = user.getPassword(); // AuthenticationPrincipal
        return passwordEncoder.matches(checkPassword, realPassword);
    }

}
