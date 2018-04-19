/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

/**
 *
 * @author 5586658
 */
public class Supervisor extends Funcionario{
    private String departamento;
    
    public Supervisor(String nome,int cpf,int registro,String departamento){
        super(nome,cpf,registro);
        this.departamento=departamento;
    }
}
