/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_4;

/**
 *
 * @author 5586658
 */
public class Circulo extends Figura{
    private double raio;
    
    public double area(){
        return Math.PI * this.raio * this.raio;
    }
}
