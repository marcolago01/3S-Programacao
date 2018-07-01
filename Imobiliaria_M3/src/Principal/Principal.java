/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Imobiliaria.Operacoes.*;

import Imobiliaria.Dominio.*;
import Imobiliaria.*;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Imobiliaria max = new Imobiliaria();
        
        max.adicionarImovel(new Casa(true, "12"));
        max.adicionarImovel(new Apartamento(1, "1"));
        max.adicionarImovel(new Terreno(false, "23"));
        max.adicionarImovel(new SalaComercial(false, "2"));
        max.adicionarVenda(max.obterImovel("12"), 100);
        max.vender("12", 100, new Pessoa("teste", "123"));
        
        max.adicionarVenda(max.obterImovel("12"), 100);
        max.vender("12", 110, new Pessoa("teste1", "1233"));
        
        max.adicionarVenda(max.obterImovel("12"), 100);
        max.vender("12", 1020, new Pessoa("teste2", "1233"));

        max.adicionarVenda(max.obterImovel("12"), 100);
        max.cancelarVenda("12");
        
        max.adicionarVenda(max.obterImovel("12"), 125);
        
        for (Imovel arg : max.getImoveis()) {
            System.out.println(arg.exibirDetalhes());
        }
        
        Venda[] teste = max.historicoVenda("12");
        
        for(Venda locacao : teste) {
            JOptionPane.showMessageDialog(null, locacao.exibirLocacao());
        }
    }
    
}
