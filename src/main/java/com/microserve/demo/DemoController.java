package com.microserve.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping(path = "/hello", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getGreetings() { return "Hello to you too!"; }

    @GetMapping(path = "/date", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getCurrentDate() { return LocalDate.now().format(DateTimeFormatter.ISO_DATE); }

}
