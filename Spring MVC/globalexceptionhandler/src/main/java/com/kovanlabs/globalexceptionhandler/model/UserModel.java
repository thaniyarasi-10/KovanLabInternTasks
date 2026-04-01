package com.kovanlabs.globalexceptionhandler.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserModel {
    private String name;
    private String email;
    private int age;
}