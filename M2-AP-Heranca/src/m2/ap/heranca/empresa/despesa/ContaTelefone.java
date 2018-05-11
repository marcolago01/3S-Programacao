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
public class ContaTelefone implements Despesa{
    
    private double valor;
    
    @Override
    public double getValores(){
        return this.valor;
    }

    public ContaTelefone(double valor) {
        this.valor=valor;
    }
    
}
