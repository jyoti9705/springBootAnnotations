package com.example.annotations;

import org.springframework.stereotype.Component;

@Component
public class Student1 {

    public  void study(){
        System.out.println("Hello, I name is Jyoti Singh and I am a student, Bean for me is created with help of @Component Annotation");
    }
}
