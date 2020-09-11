/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import core.Base;

/**
 *
 * @author Developer4
 */
public class Clientes extends Base {

    private Integer edad;
    private Integer tiempoTransaccion;

    public Clientes() {
    }

    public Clientes(Integer edad, Integer tiempoTransaccion) {
        this.edad = edad;
        this.tiempoTransaccion = tiempoTransaccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getTiempoTransaccion() {
        return tiempoTransaccion;
    }

    public void setTiempoTransaccion(Integer tiempoTransaccion) {
        this.tiempoTransaccion = tiempoTransaccion;
    }

    @Override
    public String toString() {
        return "Clientes{" + "edad=" + edad + ", tiempoTransaccion=" + tiempoTransaccion + '}';
    }

    @Override
    public Base copy() {
        return new Clientes(edad, tiempoTransaccion);
    }

}
