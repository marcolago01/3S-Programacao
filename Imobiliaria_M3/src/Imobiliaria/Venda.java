/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria;

import java.util.Date;

/**
 *
 * @author marco
 */
public class Venda {
    Imovel imovel;
    Pessoa comprador;
    Date data;
    double valor;
    SituacaoLocacao situacao;

    public Venda(Imovel imovel, double valor) {
        this.imovel = imovel;
        this.comprador = null;
        this.data = null;
        this.valor = valor;
        this.situacao = SituacaoLocacao.aberto;
    }
    
    public void vender(Pessoa comprador, double valor){
        
    }
    
}
