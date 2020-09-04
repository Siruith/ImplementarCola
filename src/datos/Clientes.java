/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Developer4
 */
public class Clientes {

    private Integer edad;
    private Integer duracionTransaccion;
    private Integer tiempoEspera;

    public Clientes() {
    }

    public Clientes(Integer edad, Integer duracionTransaccion, Integer tiempoEspera) {
        this.edad = edad;
        this.duracionTransaccion = duracionTransaccion;
        this.tiempoEspera = tiempoEspera;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDuracionTransaccion() {
        return duracionTransaccion;
    }

    public void setDuracionTransaccion(Integer duracionTransaccion) {
        this.duracionTransaccion = duracionTransaccion;
    }

    public Integer getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(Integer tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    @Override
    public String toString() {
        return "Clientes{" + "edad=" + edad + ", duracionTransaccion=" + duracionTransaccion + ", tiempoEspera=" + tiempoEspera + '}';
    }

}
