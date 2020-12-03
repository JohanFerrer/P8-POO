/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 *Esta es la clase abstracta Poligno del paquete claseAbstracta
 * @author johan
 */
public abstract class Poligono {
    /**
     * Métodos para el area y perimetro
     * @return 
     */
    public abstract float area();
    public abstract float perimetro();
    /**
     * toString de la clase asbtracta poligono
     * @return Es de tipo String
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
     
    
}
