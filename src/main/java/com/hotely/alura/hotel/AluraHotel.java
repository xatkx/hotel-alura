/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hotely.alura.hotel;

import com.hotely.alura.hotel.controllers.ReservaController;
import com.hotely.alura.hotel.views.Login;

/**
 *
 * @author kedwin
 */
public class AluraHotel {

    public static void main(String[] args) {
       // Login log = new Login();
        //log.setVisible(true);
        
        ReservaController repo = new ReservaController();
        
        repo.obtenerTodosLosReservaEntitys();
    }
}
