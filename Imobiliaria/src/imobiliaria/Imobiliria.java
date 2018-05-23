/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria;

import imobiliaria.Operacao.Locacao;
import imobiliaria.Operacao.Venda;
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
    
    private void aumentarArrayVenda(){
        this.vendas=Arrays.copyOf(vendas,vendas.length+1);
    }
    
    private void aumentarArrayLocacao(){
        this.locacoes=Arrays.copyOf(locacoes,locacoes.length+1);
    }
    
    
    /**
     *
     * @param id = identificador do imovel
     * @param status = 1 - Em Locação, 2 - Em venda, 3 - Para Locacao ou Venda, 4 - Vendido , 5 - Locado.
     * @return 
     */
    private boolean statusImovel(int id,int status){
       
       switch(status){
           case 1:
               return this.imoveis[id-1].getStatus().equals("Para Locacao");
           case 2:
               return this.imoveis[id-1].getStatus().equals("A Venda");
           case 3:
               return this.imoveis[id-1].getStatus().equals("Para Locacao ou Venda");
           case 4:
               return this.imoveis[id-1].getStatus().equals("Vendido");
           case 5:
               return this.imoveis[id-1].getStatus().equals("Locado");
           default:
               return false;
       }
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
     
    public boolean colocarAVenda(int id){
        if(imoveis[id-1]==null){
            return false;
        }
        
        if(!statusImovel(id, 4)&&!statusImovel(id, 5)){
             imoveis[id-1].setStatus("A Venda");
        }
        return false;
    }
        
    public boolean colocarParaLocacao(int id){
        if(imoveis[id-1]==null){
            return false;
        }
        
        if(!statusImovel(id, 4)&&!statusImovel(id, 5)){
             imoveis[id-1].setStatus("Para Locacao");
             return true;
        }
        
        return false;
    }
        
    public boolean colocarParaLocacaoEVenda(int id){
        if(imoveis[id-1]==null){
            return false;
        }
        
        if(!statusImovel(id, 4)&&!statusImovel(id, 5)){
             imoveis[id-1].setStatus("Para Locacao ou Venda");
        }
        
        return false;
    }
    
    public void exibirUltimoImovel(){
        int tamanho = imoveis.length;
        if(tamanho >0){
             System.out.print(imoveis[tamanho-1].exibirDetalhes());
        }
    }
    
    public void exibirImovelEspecifico(int id){
        for (Imovel imovel : imoveis) {
            if(imovel.getID() == id){
                System.out.print(imovel.exibirDetalhes());
                return;
            }  
        }
    }
   
    public void exibirImoveis(){
        for (Imovel imovel : imoveis) {
            System.out.print(imovel.exibirDetalhes());   
        }
    }
    
    public boolean locacaoImovel(int id,String inquilino,String data, double valor){
        if(imoveis[id-1]==null){
            return false;
        }
        
        if(statusImovel(id, 1)||statusImovel(id, 3)){
            aumentarArrayLocacao();
            int tamanho= this.locacoes.length;
            Imovel imovel = this.imoveis[id-1];
            this.locacoes[tamanho-1]=new Locacao();
            this.locacoes[tamanho-1].locarImovel(valor, imovel, inquilino, data);
            return true;
        }
        return false;
    }
    
    public boolean vendaImovel(int id,String data,String comprador,double valor){
        if(imoveis[id-1]==null){
            return false;
        }
        
        if(statusImovel(id, 2)||statusImovel(id, 3)){
            aumentarArrayVenda();
            int tamanho = this.vendas.length;
            Imovel imovel = this.imoveis[id-1];
            Venda venda = new Venda();

            venda.venderImovel(valor, imovel, comprador, data);
            this.vendas[tamanho-1]=venda;
            return true;
        }
        
        return false;
    }
}
