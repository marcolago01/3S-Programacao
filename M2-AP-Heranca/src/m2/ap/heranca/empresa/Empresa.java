/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2.ap.heranca.empresa;
import m2.ap.heranca.empresa.funcionarios.Funcionario;
import m2.ap.heranca.empresa.despesa.Despesa;

/**
 *
 * @author marco.lago
 */
public class Empresa implements Despesa{
    
    Despesa[] gasto= new Despesa[40];
    Funcionario[] funcionarios= new Funcionario[40];
    
    public void adicionarFuncionario(Funcionario funcionario){
        int tamanho=this.funcionarios.length;
        for (int i = 0; i < tamanho; i++) {
            if(this.funcionarios[i]==null){
                this.funcionarios[i]=funcionario;
                i=tamanho;
            }
        }
    }
    
    public double getTotalSalarios(){
        double total=0;
        for (Funcionario funcionario : funcionarios) {
            if(funcionario != null){
                total+=funcionario.getSalario();
            }
        }
        return total;
    }
        
}
