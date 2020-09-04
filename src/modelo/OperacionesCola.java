/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import core.Base;
import core.Cola;

/**
 *
 * @author Developer4
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
