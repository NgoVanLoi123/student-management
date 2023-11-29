package com.example.studentmanagement.entity;

import com.example.studentmanagement.statics.SubjectType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    private int id;
    private String name;
    private int credit;
    private SubjectType subjectType;

}
