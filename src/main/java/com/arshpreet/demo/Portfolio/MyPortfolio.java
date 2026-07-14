package com.arshpreet.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/mySelf")
    public String mySelf(){
        return """
                <h1>MySelf</h1>
                <p> I am passionate Software Engineer </p>
                <ul>
                <li>gitHub Link</<li>
                <li>Leetcode Link</li>
                </ul>
                """;
    }

}
