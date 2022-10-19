/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author a gente
 */
public class ObjectDao<T>{
    
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;
    private Class<T> classe;

    public ObjectDao(Class<T> classe) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("hibernateJPA");
        entityManager = entityManagerFactory.createEntityManager();
        this.classe = classe;
    }

    public void insert(T object) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(object);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } 
    }

    public void update(T object) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(object);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
        }

    }

    public void delete(long id) {
        T object = null;
        try {
            entityManager.getTransaction().begin();
            object = entityManager.find(classe, id);
            entityManager.remove(object);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public T getById(long id) {
        T object = null;
        try {
            entityManager.getTransaction().begin();
            object = entityManager.find(classe, id);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } 
        return object;
    }

    public List<T> list(T object) {

        List<T> objects = null;

        try {
            objects = entityManager.createQuery("from " + classe.getName()).getResultList();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } 

        return objects;
    }

    public void closeConnection() {
        entityManager.close();
        entityManagerFactory.close();
    }

    public void openConnection(Class<T> classe) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("hibernateJPA");
        this.entityManager = entityManagerFactory.createEntityManager();
        this.classe = classe;
    }

}
