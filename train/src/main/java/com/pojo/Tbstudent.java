package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tbstudent {
    String no;
    String name;
    String gender;
    Date birthdate;
    String hometown;
    String classid;
    String idcard;



}
