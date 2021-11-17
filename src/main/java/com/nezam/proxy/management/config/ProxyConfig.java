package com.nezam.proxy.management.config;

import com.nezam.proxy.management.models.Proxy;
import com.nezam.proxy.management.repository.ProxyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProxyConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProxyRepository repository){
        return args -> {
            Proxy p1 = new Proxy(Long.valueOf(1),"a","a","a",444,"a","a",22,22, Proxy.ProxyStatus.Active);
            Proxy p2 = new Proxy(Long.valueOf(2),"a","a","a",444,"a","a",22,22, Proxy.ProxyStatus.Active);

            repository.save(p1);
            repository.save(p2);
        };
    }
}
