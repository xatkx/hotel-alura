package com.hotely.alura.hotel.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hotely.alura.hotel.model.HuespedeEntity;

import java.util.List;

public class HuespedesDao {

    private EntityManager entityManager;

    public HuespedesDao() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mmg"); // Reemplaza con el nombre de tu unidad de persistencia
        entityManager = emf.createEntityManager();
    }

    public void agregarReserva(HuespedeEntity huespe) {
        entityManager.getTransaction().begin();
        entityManager.persist(huespe);
        entityManager.getTransaction().commit();
    }

    public HuespedeEntity obtenerHuespedeEntity(long id) {
        return entityManager.find(HuespedeEntity.class, id);
    }

    public List<HuespedeEntity> obtenerTodosLosHuespedeEntitys() {
        return entityManager.createQuery("SELECT p FROM HuespedeEntity p", HuespedeEntity.class).getResultList();
    }

    public void actualizarHuespedeEntity(HuespedeEntity huespe) {
        entityManager.getTransaction().begin();
        entityManager.merge(huespe);
        entityManager.getTransaction().commit();
    }

    public void eliminarHuespedeEntity(long id) {
        HuespedeEntity huespe = entityManager.find(HuespedeEntity.class, id);
        entityManager.getTransaction().begin();
        entityManager.remove(huespe);
        entityManager.getTransaction().commit();
    }
}

