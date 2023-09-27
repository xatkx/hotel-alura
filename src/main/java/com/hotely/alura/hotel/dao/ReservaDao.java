package com.hotely.alura.hotel.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hotely.alura.hotel.model.ReservaEntity;

import java.util.List;

public class ReservaDao {

    private EntityManager entityManager;

    public ReservaDao() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mmg");
        entityManager = emf.createEntityManager();
    }

    public int agregarReserva(ReservaEntity reserva) {
        long id;
    	entityManager.getTransaction().begin();
        entityManager.persist(reserva);
       ReservaEntity obj = entityManager.merge(reserva);
       id = obj.getId();
        entityManager.getTransaction().commit();
        
        return (int) id;
        
    }

    public ReservaEntity obtenerReservaEntity(long id) {
        return entityManager.find(ReservaEntity.class, id);
    }

    public List<ReservaEntity> obtenerTodosLosReservaEntitys() {
        return entityManager.createQuery("SELECT p FROM ReservaEntity p", ReservaEntity.class).getResultList();
    }

    public void actualizarReservaEntity(ReservaEntity reserva) {
        entityManager.getTransaction().begin();
        entityManager.merge(reserva);
        entityManager.getTransaction().commit();
    }

    public void eliminarReservaEntity(long id) {
        ReservaEntity reserva = entityManager.find(ReservaEntity.class, id);
        entityManager.getTransaction().begin();
        entityManager.remove(reserva);
        entityManager.getTransaction().commit();
    }
}

