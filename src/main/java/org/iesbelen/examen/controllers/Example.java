package org.iesbelen.examen.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class Example {

    @GetMapping
    public String example() {
        return "example";
    }
}
