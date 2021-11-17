package com.nezam.proxy.management.controllers;

import com.nezam.proxy.management.models.Proxy;
import com.nezam.proxy.management.services.ProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/proxies")
public class ProxyController {

    private final ProxyService proxyService;

    @Autowired
    public ProxyController(ProxyService proxyService) {
        this.proxyService = proxyService;
    }

    @GetMapping
    public String getAllProxies(Model model){
        model.addAttribute("proxies",proxyService.getAllProxies());
        return "proxies.html";
    }
}
