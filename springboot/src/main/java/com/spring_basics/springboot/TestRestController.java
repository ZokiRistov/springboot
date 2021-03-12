package com.spring_basics.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestRestController {
    @GetMapping("/test")
    public List<TestData> getData()  {
        return Arrays.asList(
                new TestData(0, "TestData_ID0", 3),
                new TestData(1, "TestData_ID1", 5)
        );
    }
}
