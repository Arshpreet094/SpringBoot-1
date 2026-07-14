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
    @GetMapping("/skills")
    public String skills(){
        return """
                <h1>Skills</h1>
                <p>Languages</p>
                <ul>
                <li>C++</li>
                <li>Python</li><li>Java</li>
                </ul>
                
                <p>Tools and Technologies</p>
                <ul>
                <li>Git</li>
                <li>PowerBI</li><li>PL/SQL</li>
                </ul>
                """;
    }
    @GetMapping("/education")
    public String education(){
        return """
                <h1>Education</h1>
                <p>Lovely Professional University</p>
                """;
    }
    @GetMapping("/projects")
    public String projects(){
        return """
                <h1>Projects</h1>
                <ul>
                <li>1. ML Project</li>
                <li>2. PowerBI DashBoard</li>
                </ul>
                """;
    }

}
