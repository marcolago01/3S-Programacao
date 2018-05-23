/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria.Operacao;

import imobiliaria.imovel.*;

/**
 *
 * @author 5586658
 */
public class Venda {
    private double valorVenda;
    private Imovel imovelVendido;
    private String comprador;
    private String data;
    
    public void venderImovel(double valorVenda, Imovel imovelVendido,String comprador,String data){
        this.valorVenda=valorVenda;
        imovelVendido.setStatus("Vendido");
        this.imovelVendido=imovelVendido;
        this.comprador=comprador;
        this.data=data;
    }
}
