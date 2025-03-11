package com.megdotstew.peony.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ApplicationController {

    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("title","Home")
        return "index"
    }
}