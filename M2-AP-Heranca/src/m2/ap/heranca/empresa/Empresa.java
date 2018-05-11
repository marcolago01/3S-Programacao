/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2.ap.heranca.empresa;
import m2.ap.heranca.empresa.funcionario.Funcionario;
import m2.ap.heranca.empresa.despesa.Despesa;

/**
 *
 * @author marco.lago
 */
public class Empresa implements Despesa{
    
    private double valor=0;
    
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
    
    public void adicionarGasto(Despesa despesa){
        int tamanho=this.gasto.length;
        for (int i = 0; i < tamanho; i++) {
            if(this.gasto[i]==null){
                this.gasto[i]=despesa;
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
    
    private double getTotalGastos(){
        double total=0;
        for (Despesa despesa : gasto) {
            if(despesa !=null){
                total+=despesa.getValores();
            }
        }
        return total;
    }
    
    private void calcularTotalGastos(){
        this.valor+=getTotalSalarios()+getTotalGastos();
    }
    
    @Override
    public double getValores(){
        calcularTotalGastos();
        return this.valor;
    }
        
}
