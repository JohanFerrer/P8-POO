/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *Esta es la clase instrumentoViento que extiende de Object e implementa InstrumentoMusical
 * @author johan
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {

        /**
         * Constructor vacio de la clase Instrumento de viento 
         */
    public InstrumentoViento() {
    }
    
    /**
     * Sobreescritura del método tocar
     */
    @Override
    public void tocar(){
        System.out.println("EStoy tocando un instrumeto de viento");
    }
    /**
     * Sobrescritura del método afinar
     */
    @Override
     public void afinar(){
         System.out.println("Estoy afinando un instrumento de viento");
     }  
    /**
     * Sobresciruta de tipoInstrumenot
     * @return Es de tipo String
     */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
    /**
     * toString de InstrumentoViento
     * @return Es de tipo String
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
    }

