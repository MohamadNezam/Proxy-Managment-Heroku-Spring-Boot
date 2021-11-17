package com.nezam.proxy.management.controllers;

import com.nezam.proxy.management.models.Proxy;
import com.nezam.proxy.management.services.ProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/proxies")
public class ProxyRestController {
    private final ProxyService proxyService;

    @Autowired
    public ProxyRestController(ProxyService proxyService) {
        this.proxyService = proxyService;
    }

    @GetMapping
    public List<Proxy> getAllProxies(){

        return proxyService.getAllProxies();
    }
}
