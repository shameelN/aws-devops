package com.shameel.aws.awscicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @RequestMapping
    public String Hello(){
        return "Hello youtube";
    }
}
