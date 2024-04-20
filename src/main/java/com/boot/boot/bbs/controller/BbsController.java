package com.boot.boot.bbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BbsController {

    @GetMapping("/bbs")
    public String BbsMain() {
        return "Bbs Main Page";
    }
}
