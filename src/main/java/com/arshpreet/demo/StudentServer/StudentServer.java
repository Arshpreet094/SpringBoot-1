package com.arshpreet.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {

    //1. Store the student info (Post)
    @PostMapping("/create")
    public String storeStudent(){
        return """
                id : 1
                name : Arshpreet
                Department : CSE
                age : 21
                """;
    }

    //2. Read the student info (Get)

    //3. update the student info (Put,Patch)

    //4. delete the student info (Delete)
}
