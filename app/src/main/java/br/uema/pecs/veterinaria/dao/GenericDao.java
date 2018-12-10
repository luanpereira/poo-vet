package br.uema.pecs.veterinaria.dao;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class GenericDao<T extends Serializable> {

    /**
     * Entidade representativa da tabela do banco de dados.
     */
    private final Class<T> entityClass;

    @PersistenceContext(unitName = "veterinaria")
    private final EntityManager entityManager;
    //private final Class persistentClass;

//    public GenericDao() {
//        this.entityManager = EntityManagerUtil.getEntityManager();
//        this.persistentClass = (Class) ((ParameterizedType)
//                getClass().getGenericSuperclass()).getActualTypeArguments()[0];
//    }

    protected GenericDao(Class<T> entityClass){
        this.entityClass = entityClass;
        this.entityManager = EntityManagerUtil.getEntityManager();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    protected void save(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().persist(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    protected void update(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().merge(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }

    }

    protected void delete(T entity) {
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().remove(entity);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {
            close();
        }
    }

    public List findAll() throws Exception {
        Session session = (Session) getEntityManager().getDelegate();
        return session.createCriteria(entityClass).list();
    }

    public T findByName(String nome) {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(entityClass)
                .add(Restrictions.eq("nome", nome).ignoreCase()).uniqueResult();
    }

    public T findById(long id) {
        Session session = (Session) getEntityManager().getDelegate();
        return (T) session.createCriteria(entityClass)
                .add(Restrictions.eq("id", id)).uniqueResult();
    }

    private void close() {
        if (getEntityManager().isOpen()) {
            getEntityManager().close();
        }
        shutdown();
    }

    private void shutdown() {
        EntityManager em = EntityManagerUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.createNativeQuery("SHUTDOWN").executeUpdate();
        em.close();
    }
}
