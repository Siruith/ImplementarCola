/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.LinkedList;


/*
 * Cola: Estructura de datos de tipo lista (LinkedList) que sigue un modelo en el cual
   el primer elemento en entrar es el primer elemento en salir.
 * @author Jairo Vergara Portocarrero 2151714
 * @author Jorge Enrique Moreno Barragan 2175321
 * @author Juan David Mosquera Castro 2150186
 * @author Sebastián Bejarano Cuero 2190853
 * @date 16 Septiembre 2020
 * @version 1.0
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
