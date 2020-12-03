/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *Esta es la interfaz InstrumentoMusical del paquete interfaz
 * @author johan
 */


public interface InstrumentoMusical {
    //Por defecto todos los métodos son public y abstract
    
    /**
     * Métodos de la interfaz en InstrumentoMusical
     */
    void tocar();
    void afinar();
    String tipoInstrumento();
}
