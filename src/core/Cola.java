/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.LinkedList;

/**
 *
 * @author Developer4
 */
public class Cola<T extends Base> {

    private LinkedList<T> elems;

    public Cola() {
        elems = new LinkedList<>();

    }

    public void encolar(T elemento) {
        elems.addLast(elemento);
    }

    public T desencolar() {
        return elems.removeFirst();
    }

    public boolean estaVacia() {
        return elems.isEmpty();
    }

    @Override
    public String toString() {
        String cad = "[";

        for (T e : elems) {
            cad += " " + e.toString();
        }

        return cad + "]";

    }

}
