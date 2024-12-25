package com.example.project3.Controller;

import com.example.project3.DTOin.CustomerDTOin;
import com.example.project3.DTOin.EmplyeeDTOIn;
import com.example.project3.Service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/register")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;


    @PostMapping("/registerCustomer")
    public ResponseEntity registerCustomer(@RequestBody@Valid CustomerDTOin customerDTOin){
        authService.registerCustomer(customerDTOin);
        return ResponseEntity.ok().body("Customer registered successfully");
    }



    @PostMapping("/registerEmployee")
    public ResponseEntity registerEmployee(@RequestBody @Valid EmplyeeDTOIn emplyeeDTOIn){
        authService.registerEmployee(emplyeeDTOIn);
        return ResponseEntity.ok().body("registered employee successfully");
    }



}
