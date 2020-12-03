/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *Esta es la clase Flauta que extiende de InstrumentoViendo
 * @author johan
 */
public class Flauta extends InstrumentoViento{
    /**
     * Constructor vacio de la clase Flauta
     */
    public Flauta() {
    }
    /**
     * Sobreescribimmos el tipoInstrumento
     * @return Es de tipo String
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
    /**
     * Utilizamos toString para la clase Flauta
     * @return Es de tipo String
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
   
    
}
