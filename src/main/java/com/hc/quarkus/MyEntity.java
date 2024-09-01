package com.hc.quarkus;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Example JPA entity.
 * <p>
 * To use it, get access to a JPA EntityManager via injection.
 * <p>
 * {@code
 *
 * @Inject EntityManager em;
 * <p>
 * public void doSomething() { MyEntity entity1 = new MyEntity(); entity1.field = "field-1"; em.persist(entity1);
 * <p>
 * List<MyEntity> entities = em.createQuery("from MyEntity", MyEntity.class).getResultList(); } }
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class MyEntity  {
    @Id
    @GeneratedValue
    public Long id;

    public String field;

    public MyEntity(String field) {
        this.field = field;
    }

}
