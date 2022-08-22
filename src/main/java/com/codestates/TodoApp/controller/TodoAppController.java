package com.codestates.TodoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoAppController {
    @GetMapping("/")
    public String checkText() {
        return "Todo Main Feature Application!";
    }
}
