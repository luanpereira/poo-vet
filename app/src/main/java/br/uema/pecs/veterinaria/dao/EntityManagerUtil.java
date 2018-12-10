package br.uema.pecs.veterinaria.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

public class EntityManagerUtil {
    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        if (!Optional.ofNullable(emf).isPresent())
            emf = Persistence.createEntityManagerFactory("veterinaria");

        return emf.createEntityManager();
    }
}
