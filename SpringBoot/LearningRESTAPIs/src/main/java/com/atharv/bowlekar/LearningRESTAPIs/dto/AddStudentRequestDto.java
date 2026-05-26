package com.atharv.bowlekar.LearningRESTAPIs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddStudentRequestDto {

    @NotBlank(message = "Name is Required...")
    @Size(min = 3,max = 30,message = "Length of Name can be of 3-30 characters")
    private String name;

    @Email
    @NotBlank(message = "Email is Required...")
    private String email;
}
