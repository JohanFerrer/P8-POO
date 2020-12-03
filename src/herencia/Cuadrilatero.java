/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *Esta es la clase Cuadrilatero del paquete herencia
 * @author johan
 */

/**
 * Atributos de la clase Cuadrilatero 
 * @author johan
 */
public class Cuadrilatero extends Poligono {
    private int alpha, beta;
    private float a, b, base, altura;

    /**
     * Constructor vacio de la clase Cuadrilatero 
     */
    public Cuadrilatero() {
    }

    /**
     * Contructor con los atributos, recibe seis parametros
     * @param alpha Ängulo del cuadrilatero, tipo entero
     * @param beta Ängulo del cuadrilatero, tipo entero
     * @param a Lado del cuadrilatero, tipo flotante
     * @param b Lado del cuadrilatero, tipo flotante
     * @param base Base del cuadrilatero, tipo flotante
     * @param altura Alruta del cuadrilatero, tipo flotante
     */
    public Cuadrilatero(int alpha, int beta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtenemos el ángulo alpha 
     * @return Es de tipo entero
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Asignamos el valor del ángulo Alpha
     * @param alpha Es de tipo entero
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * Obtenemos el valor del ángulo Beta
     * @return Es de tipo entero 
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Asignamos el valor del ángulo Beta
     * @param beta Es de tipo entero
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Obtenemos el valor de a
     * @return Es de tipo flotante
     */
    public float getA() {
        return a;
    }
    /**
     * Asignamos el valor de a
     * @param a Es de tipo flotante
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * Obtenemos el valor de b
     * @return Es de tipo flotante
     */
    public float getB() {
        return b;
    }
    /**
     * Asignamos el valor de b
     * @param b Es de tipo flotante
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * Obtenemos el valor de la Base
     * @return Es de tipo flotante
     */
    public float getBase() {
        return base;
    }
    /**
     * Asignamos el valor de la Base
     * @param base Es de tipo flotante
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Obtenemos el valor de la Altura
     * @return Es de tipo flotante
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Asginamos el valor de la Altura
     * @param altura es de tipo flotante
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Utilizamos el toString de la clase Cuadrilatero
     * @return Tipo String
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
}
