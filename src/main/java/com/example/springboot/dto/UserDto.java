package com.example.springboot.dto;

import com.example.springboot.validation.FieldsValueMatch;
import com.example.springboot.validation.UserConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@FieldsValueMatch.List({
        @FieldsValueMatch(
                field = "password",
                fieldMatch = "retypePassword"
        )
})
public class UserDto {
    private Long iD;

    private String userName;
    private String password;
    private String retypePassword;
    private String fullName;
}
