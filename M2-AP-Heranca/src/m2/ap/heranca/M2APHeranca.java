/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2.ap.heranca;

import m2.ap.heranca.empresa.Empresa;
import m2.ap.heranca.empresa.despesa.ContaAgua;
import m2.ap.heranca.empresa.despesa.ContaLuz;
import m2.ap.heranca.empresa.despesa.ContaTelefone;
import m2.ap.heranca.empresa.despesa.Despesa;
import m2.ap.heranca.empresa.despesa.Pessoa;
import m2.ap.heranca.empresa.funcionario.Assalariado;
import m2.ap.heranca.empresa.funcionario.Comissionado;
import m2.ap.heranca.empresa.funcionario.Horista;

/**
 *
 * @author 5586658
 */
public class M2APHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assalariado eu = new Assalariado(1000);
        Horista tu = new Horista(10, 30);
        Comissionado ele = new Comissionado(500, 15, 20);
        
        Empresa univali = new Empresa();
        
        univali.adicionarFuncionario(eu);
        univali.adicionarFuncionario(tu);
        univali.adicionarFuncionario(ele);
        
        //System.out.print(univali.getTotalSalarios());
        
        Despesa gasto;
        gasto = new ContaAgua(100);
        univali.adicionarGasto(gasto);
        gasto=new ContaLuz(200);
        univali.adicionarGasto(gasto);
        gasto=new ContaTelefone(50);
        univali.adicionarGasto(gasto);
        gasto=new Empresa();
        
        ((Empresa)gasto).adicionarFuncionario(eu);
        ((Empresa)gasto).adicionarFuncionario(tu);
        ((Empresa)gasto).adicionarFuncionario(ele);
        univali.adicionarGasto(gasto);
        gasto=new Pessoa("ola", 600);
        univali.adicionarGasto(gasto);
        
        System.out.print(univali.getValores());
        
    }
    
}
