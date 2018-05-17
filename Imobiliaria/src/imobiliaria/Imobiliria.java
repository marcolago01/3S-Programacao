/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria;

import imobiliaria.Operacao.*;
import imobiliaria.imovel.*;
import java.util.Arrays;

/**
 *
 * @author 5586658
 */
public class Imobiliria {
    Imovel[] imoveis = new Imovel[0];
    Venda[] vendas = new Venda[0];
    Locacao[] locacoes = new Locacao[0];
    private int id=1;
    
    private void aumentarArrayImoveis(){
        this.imoveis=Arrays.copyOf(imoveis,imoveis.length+1);
    }
    
    private void aumentarArrayLocacao(){
        this.vendas=Arrays.copyOf(vendas,vendas.length+1);
    }
    
    private void aumentarArrayVenda(){
        this.locacoes=Arrays.copyOf(locacoes,locacoes.length+1);
    }
    
    /**
     * @param tipo (1=Casa, 2=Apartamento, 3=Terreno, 4=SalaComercial)
     * @param status
     * @param area
     * @param descricao
     */
    public void adicionarImovel(int tipo,String status,double area
                                , String descricao){
        Imovel novo;
        
        switch(tipo){
            case 1:
                novo = new Casa(status,area,descricao,this.id);
                break;
            case 2:
                novo = new Apartamento(status,area,descricao,this.id);
                break;
            case 3:
                novo = new Terreno(status,area,descricao,this.id);
                break;
            case 4:
                novo  = new SalaComercial(status,area,descricao,this.id);
                break;
            default:
                return;
        }
        this.id++;
        aumentarArrayImoveis();
        this.imoveis[imoveis.length-1]=novo;
        
    }
    
    
    public void colocarAVenda(int id){
        
        for (Imovel imovel : imoveis) {
            if(imovel.getID()==id){
                imovel.setStatus("A Venda");
            }
        }
    }
    
    public void colocarParaLocacao(int id){
        
        for (Imovel imovel: imoveis){
            if(imovel.getID()==id){
                imovel.setStatus("Para Locacao");
            }
        }
    }
    
    public void colocarParaLocacaoEVenda(int id){
        
        for (Imovel imovel: imoveis){
            if(imovel.getID()==id){
                imovel.setStatus("Para Locacao ou Venda");
            }
        }
    }
    
    public void exibirImoveis(){
        for (Imovel imovel : imoveis) {
            System.out.print(imovel.exibirDetalhes());   
        }
    }
    
    public void locacaoImovel(int id,String inquilino,String data){
        for (Imovel imovel : imoveis) {
            if(imovel.getID()==id && (!"Para Locacao".equals(imovel.getStatus()) || !"Para Locacao ou Venda".equals(imovel.getStatus()))){
                aumentarArrayLocacao();
                locacoes[locacoes.length-1]=new Locacao();
                locacoes[locacoes.length-1].locarImovel(id, imovel, inquilino, data);
            }
        }
    }
    
    public void vendaImovel(int id,String data,String comprador){
        for (Imovel imovel : imoveis) {
            if(imovel.getID()==id && (!"A Venda".equals(imovel.getStatus()) || !"Para Locacao ou Venda".equals(imovel.getStatus()))){
                aumentarArrayVenda();
                vendas[vendas.length-1]=new Venda();
                vendas[vendas.length-1].venderImovel(id, imovel, comprador, data);
            }
        }
    }
}
