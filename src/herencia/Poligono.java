/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * Esta es la clase Poligono del paquete herencia
 * @author johan
 */
public class Poligono {

    /**
     * Constructor vacio de la clase Poligono
     */
    public Poligono() {
    }
    /**
     * Instanciamos area 
     * @return Es de tipo flotante
     */
    public float area(){
        return 0;
    } 
    /**
     * Instanciamos perimetro
     * @return  Es de tipo flotante
     */
    public float perimetro(){
        return 0;
    }
    /**
     * Utilizamos toString de la clase poligono
     * @return Es de tipo String
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
       
}
