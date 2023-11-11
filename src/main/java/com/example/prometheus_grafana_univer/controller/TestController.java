package com.example.prometheus_grafana_univer.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Timed
    @GetMapping("/test")
    public String getString() {
        return "Hello~~~~!";
    }

    @Timed
    @GetMapping("/testOK")
    public ResponseEntity<Void> getOK() {
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
    @Timed
    @GetMapping("/testClientError")
    public ResponseEntity<Void> getClientError() {
        return new ResponseEntity<>(HttpStatusCode.valueOf(400));
    }
    @Timed
    @GetMapping("/testServerError")
    public ResponseEntity<Void> getServerError() {
        return new ResponseEntity<>(HttpStatusCode.valueOf(500));
    }
    @Timed
    @GetMapping("/test1")
    public ResponseEntity<Void> get() {
        return new ResponseEntity<>(HttpStatusCode.valueOf(300));
    }
}
