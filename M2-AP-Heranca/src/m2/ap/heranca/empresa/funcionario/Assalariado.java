/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2.ap.heranca.empresa.funcionario;

/**
 *
 * @author 5586658
 */
public class Assalariado extends Funcionario{

    public Assalariado(double salario) {
        this.salario=salario;
    }
    
    
    @Override
    public double getSalario(){
        return salario;
    }
}
