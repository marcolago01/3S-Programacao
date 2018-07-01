/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria.Operacoes;

import Imobiliaria.Dominio.Imovel;
import Imobiliaria.Pessoa;

/**
 *
 * @author marco
 */
public class Venda {
    public Imovel imovel;
    public Pessoa comprador;;
    public double valor;
    public SituacaoVenda situacao;

    public Venda(Imovel imovel, double valor) {
        this.imovel = imovel;
        this.comprador = null;
        this.valor = valor;
        this.situacao = SituacaoVenda.aberto;
    }
    
    public void vender(Pessoa comprador,double valor){
        this.valor=valor;
        this.comprador=comprador;
        this.situacao=SituacaoVenda.finalizado;
    }
    
    public void cancelar(){
        if(this.situacao==SituacaoVenda.aberto){
            this.situacao=SituacaoVenda.cancelado;            
        }

    }
    
    public String exibirLocacao(){
        String compradorPrint = (this.comprador == null)? "Não definido":this.comprador.nome;
        
        return
                "Matricula: "+this.imovel.getMatricula()+"\n"+
                "Inquilino: "+compradorPrint+"\n"+
                "Mensalidade: "+this.valor+"\n"+
                "Situação: "+this.situacao.name()+"\n";
    }
}
