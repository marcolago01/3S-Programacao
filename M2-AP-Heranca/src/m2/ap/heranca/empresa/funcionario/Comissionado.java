/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2.ap.heranca.empresa.funcionario;

/**
 *
 * @author marco
 */
public class Comissionado extends Funcionario{
    private double salarioBase;
    private int producao;
    private int vendas;

    public Comissionado(double salarioBase, int producao, int vendas) {
        this.salarioBase = salarioBase;
        this.producao = producao;
        this.vendas = vendas;
    }
    
    @Override
    public double getSalario(){
        return salarioBase+(producao*vendas);
    }
    
    
}
