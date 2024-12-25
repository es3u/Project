package com.example.project3.Controller;

import com.example.project3.DTOin.Accountin;
import com.example.project3.Model.User;
import com.example.project3.Service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/account")
public class AccountController {

    private final AccountService accountService;
    @PostMapping("/createAccount")
    public ResponseEntity createAccount(@AuthenticationPrincipal User user , Accountin accountin){
        accountService.createAccount(user.getId(),accountin);
        return ResponseEntity.ok().body("Account created successfully");
    }
}
