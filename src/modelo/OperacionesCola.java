/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.OperacionesCola;
import datos.Clientes;
import core.Base;
import core.Cola;

/**
 * Operaciones de la clase Cola.
 * @author Jairo Vergara Portocarrero 2151714
 * @author Jorge Enrique Moreno Barragan 2175321
 * @author Juan David Mosquera Castro 2150186
 * @author Sebastián Bejarano Cuero 2190853
 * @date 16 Septiembre 2020
 * @version 1.0
 */
public class OperacionesCola<T extends Base> {

    public static <T extends Base> Cola<T> duplicar(Cola<T> colaOriginal) {

        Cola<T> colaDuplicada = new Cola<>();
        Cola<T> colaAux = new Cola<>();

        while (!colaOriginal.estaVacia()) {
            colaAux.encolar(colaOriginal.desencolar());

        }
        while (!colaAux.estaVacia()) {
            T x = colaAux.desencolar();
            T c = (T) x.copy();
            colaDuplicada.encolar(x);
            colaOriginal.encolar(c);
        }

        return colaDuplicada;

    }

}
