package com.hotely.alura.hotel.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hotely.alura.hotel.model.ReservaEntity;

import java.util.List;

public class ReservaController {

    private EntityManager entityManager;

    public ReservaController() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mmg"); // Reemplaza con el nombre de tu unidad de persistencia
        entityManager = emf.createEntityManager();
    }

    public void agregarReserva(ReservaEntity reserva) {
        entityManager.getTransaction().begin();
        entityManager.persist(reserva);
        entityManager.getTransaction().commit();
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

