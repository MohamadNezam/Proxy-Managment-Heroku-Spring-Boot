package com.nezam.proxy.management.services;

import com.nezam.proxy.management.models.Proxy;
import com.nezam.proxy.management.repository.ProxyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProxyService {


  @Autowired
  ProxyRepository proxyRepository;



  public List<Proxy> getAllProxies() {return proxyRepository.findAll();}

}
