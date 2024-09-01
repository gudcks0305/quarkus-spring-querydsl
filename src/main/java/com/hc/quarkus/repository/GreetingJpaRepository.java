package com.hc.quarkus.repository;

import com.hc.quarkus.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingJpaRepository extends JpaRepository<MyEntity, Long> {

}
