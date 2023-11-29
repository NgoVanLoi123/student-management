package com.example.studentmanagement.model.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class StudentCreationRequest {

    @NotBlank(message = "Tên sinh viên bắt buộc nhập")
    private String name;
    private String address;
    private String phone;
    private String className;

}
