package com.bot2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO javadoc
 *
 * @author Churmeev Dmitriy (churmeev@yoomoney.ru)
 * @since 30.12.2021
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
