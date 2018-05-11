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
public class Horista extends Funcionario{
    private float horas;
    private float valorHora;

    public Horista(float horas, float valorHora) {
        this.horas = horas;
        this.valorHora = valorHora;
    }
    
    @Override
    public double getSalario(){
        return horas*valorHora;
    }

            
}
