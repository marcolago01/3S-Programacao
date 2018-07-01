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
 * @author 5586658
 */
public class Locacao {
    public Imovel imovel;
    public Pessoa inquilino;
    public double mensalidade;
    public SituacaoLocacao situacao;
    
    public Locacao(Imovel imovel,double valor){
        this.imovel=imovel;
        this.inquilino=null;
        this.mensalidade=valor;
        this.situacao=SituacaoLocacao.aberto;
    }
    
    public void locar(Pessoa inquilino,double valor){
        this.inquilino=inquilino;
        this.situacao=SituacaoLocacao.finalizado;
        this.mensalidade=valor;
    }
    
    public void cancelar(){
        if(this.situacao==SituacaoLocacao.aberto){
            this.situacao=SituacaoLocacao.cancelado;
        }
    }
    
    public String exibirLocacao(){
        String inquilinoPrint = (this.inquilino == null)? "Não definido":this.inquilino.nome;
        
        return
                "Matricula: "+this.imovel.getMatricula()+"\n"+
                "Inquilino: "+inquilinoPrint+"\n"+
                "Mensalidade: "+this.mensalidade+"\n"+
                "Situação: "+this.situacao.name()+"\n";
    }
}
