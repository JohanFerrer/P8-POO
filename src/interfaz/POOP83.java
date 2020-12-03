/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author johan
 */
public class POOP83 {
    public static void main(String[] args) {
        System.out.println("4***********");
       //No se puede instanciar
       // InstrumentoMusical instrumento new InstrumentoMusical;
       InstrumentoMusical instrumento;
       
       instrumento = new Flauta();
       instrumento.tocar();
       instrumento.afinar();
        System.out.println(instrumento.tipoInstrumento());
        System.out.println(instrumento);//Log
    }
}
