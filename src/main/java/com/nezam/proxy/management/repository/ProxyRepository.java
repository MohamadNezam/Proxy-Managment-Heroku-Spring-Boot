package com.nezam.proxy.management.repository;

import com.nezam.proxy.management.models.Proxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyRepository extends JpaRepository<Proxy,Long> {
}
