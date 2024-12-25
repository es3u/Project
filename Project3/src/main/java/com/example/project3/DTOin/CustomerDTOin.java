package com.example.project3.DTOin;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTOin {

    private String username ;



    private String password ;



    private String name ;


    private String email ;

    private String phone;

}
