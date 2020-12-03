/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 *Esta es la clase triangulo del paquete claseAbstracta
 * @author johan
 */


/**
 *Atributos de la clase triangulo
 * 
 */
public class Triangulo extends Poligono{
    private float a, b, c, base, altura;
    private int alpha, beta, gamma;

    /**
     * Constructor vacio de la clase Triangulo
     */
    public Triangulo() {
    }
 
    /**
     * Constructor de la clase Triangulo, recibe 8 parametros 
     * @param a Es de tipo flotante
     * @param b Es de tipo flotante
     * @param c Es de tipo flotante
     * @param base Es de tipo flotante
     * @param altura Es de tipo flotante
     * @param alpha Es de tipo entero
     * @param beta Es de tipo entero
     * @param gamma Es de tipo entero
     */
    public Triangulo(float a, float b, float c, float base, float altura, int alpha, int beta, int gamma) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
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
     * Asignamos el valor de v
     * @param b Es de tipo flotante
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * Obtenemos el valor de c
     * @return Es de tipo flotante 
     */
    public float getC() {
        return c;
    }
    /**
     * Asignamos el valor de c
     * @param c Es de tipo flotante
     */
    public void setC(float c) {
        this.c = c;
    }
    /**
     * Obtenemos el valor de la base
     * @return Es de tipo flotante
     */
    public float getBase() {
        return base;
    }
    /**
    * Asignamos el valos de la base
    * @param base Es de tipo flotante
    */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Obtenemos el valor de la altura
     * @return Es de tipo flotante
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Asignamos el valor de la altura
     * @param altura Es de tipo flotante
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Obtenemos el valor de Alpha
     * @return Es de tipo entero
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * Asignamos el valor de Alpha
     * @param alpha Es de tipo entero
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * Obtenemos el valor de beta
     * @return Es de tipo entero
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Asignamos el valor de beta
     * @param beta Es de tipo entero
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Obtenemos el valor de Gamma
     * @return Es de tipo entero
     */
    public int getGamma() {
        return gamma;
    }
    /**
     * Asignamos el valor de Gamma
     * @param gamma Es de tipo entero
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    
    /**
     * Utilizamos el toString de la clase triangulo
     * @return Es de tipo entero
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + '}';
    }
    /**
     *  Sobreescribimos el método para obtener el area
     */
    @Override
    public float area(){
        return base*altura/2;
    }
    /**
     *  Sobreescribimos el método para obtener el perimetro
     */
    @Override
    public float perimetro(){
        return a + b + c;
    }
}
