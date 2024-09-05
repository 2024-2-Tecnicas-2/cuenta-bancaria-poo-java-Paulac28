/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuenta.bancaria.poo;


/**
 *
 * @author NECSOFT
 */
public class CuentaBancariaTest {
    public void testSetTipoInteresValido() {
        // Prueba con un tipo de interés válido (5%)
        CuentaBancaria.setTipoInteres(5.0);
        assertEquals(5.0, CuentaBancaria.getTipoInteres(), "El tipo de interés debería ser 5.0%");
    }

 
    public void testSetTipoInteresInvalidoNegativo() {
        // Prueba con un tipo de interés negativo (-2%)
        CuentaBancaria.setTipoInteres(-2.0);
        assertEquals(1.5, CuentaBancaria.getTipoInteres(), "El tipo de interés no debería cambiar de 1.5% al intentar establecer un valor negativo.");
    }
    
    }
    
}
