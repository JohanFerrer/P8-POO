/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * 
 * @author johan
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1*************");
        // TODO code application logic here
        Poligono poligono = new Poligono();//Instanciamos Poligono
        System.out.println("Poligono " + poligono);
        /* Las clases Base pueden comportarse como sus subclase*/
        
        Object objeto = new Object();//Instanciamos un Object
        System.out.println("Object " + objeto);
        
        objeto = poligono;//Actualizamos la referencia, para ver que todas las subclases se puedennasignar a la clase Base
        System.out.println("Object como Poligono " + objeto);
        
        Object objeto2 = poligono; //Apunta a poligono
        System.out.println("Object2 "+ objeto2);
        
        Object objeto3 = new Poligono(); //Apunta a un nuevo poligono
        System.out.println("Object3 " + objeto3);
        
        System.out.println("2********");
        
        poligono = new Triangulo();
        System.out.println(poligono);//Imprimimos el toString del triangulo
        selectorPoligonos(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);//Se modificó al poligono y se comporta como cuadrilatero
        selectorPoligonos(poligono);
        
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
    }
    
    //Todos los métodos deben ser estaticos (Siempre estará en memoria)
    public static void selectorPoligonos(Poligono poligono){//Estatico simpre existe en memoria y final es constante
        if(poligono instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        }else if(poligono instanceof Cuadrilatero){
            System.out.println("El objeto es un cuadrilatero");
        }else if(poligono instanceof Poligono){
            System.out.println("EL objeto es un poligono");
        }else{
            System.out.println("El objeto es otra figura");
        }
    }
}
