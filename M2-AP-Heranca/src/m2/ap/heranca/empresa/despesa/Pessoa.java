/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2.ap.heranca.empresa.despesa;

/**
 *
 * @author marco
 */
public class Pessoa implements Despesa{
    private String nome;
    private double valor;
    
    @Override
    public double getValores(){
        return this.valor;
    }

    public Pessoa(String nome,double valor) {
        this.nome = nome;
        this.valor=valor;
    }
    
}
