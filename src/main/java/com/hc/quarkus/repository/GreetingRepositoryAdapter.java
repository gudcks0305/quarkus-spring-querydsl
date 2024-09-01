package com.hc.quarkus.repository;

import com.hc.quarkus.MyEntity;
import com.hc.quarkus.QMyEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class GreetingRepositoryAdapter {
    private final EntityManager em;
    private final JPAQueryFactory queryFactory;
    private final GreetingJpaRepository greetingJpaRepository;
    public List<MyEntity> findAll() {
        return queryFactory.select(QMyEntity.myEntity)
            .from(QMyEntity.myEntity)
            .fetch();
    }
    public MyEntity save(MyEntity myEntity) {
        return greetingJpaRepository.save(myEntity);
    }
}

