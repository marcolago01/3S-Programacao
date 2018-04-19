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
public class Funcionario extends Pessoa{
    private int registro;
    
    public Funcionario(String nome,int cpf,int registro){
        super(nome,cpf);
        this.registro=registro; 
    }
}
