/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 *
 * @author johan
 */
public class POOP82 {
    public static void main(String[] args){
        System.out.println("3*************");
        
        //Poligono poligono = new Poligono();
        Poligono poligono;
        
        poligono = new Triangulo();//Se comporta como triangulo
        System.out.println(poligono);
        
        poligono = new Cuadrilatero();//Se comporta como cuadrilatero
        System.out.println(poligono);
    }
}
