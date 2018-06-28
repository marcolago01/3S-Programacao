/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria;

import java.util.Date;

/**
 *
 * @author 5586658
 */
public class Locacao {
    Imovel imovel;
    Pessoa inquilino;
    Date data;
    Date ate;
    double mensalidade;
    SituacaoLocacao situacao;
    
    public Locacao(Imovel imovel,double valor){
        this.imovel=imovel;
        this.inquilino=null;
        this.data=null;
        this.mensalidade=valor;
        this.situacao=SituacaoLocacao.aberto;
    }
    
    public void locar(Pessoa inquilino,Date data,Date ate,double valor){
        this.inquilino=inquilino;
        this.data=data;
        this.ate=ate;
        this.situacao=SituacaoLocacao.finalizado;
        this.mensalidade=valor;
    }
    
    public void cancelar(){
        if(this.situacao==SituacaoLocacao.aberto){
            this.situacao=SituacaoLocacao.cancelado;
        }
    }
}
