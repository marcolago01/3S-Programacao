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
public class Locacao {
    private double valorLocacao;
    private Imovel imovelLocado;
    private String inquilino;
    private String data;
    
    public void locarImovel(double valorLocacao, Imovel imovelLocado,String inquilino,String data){
        this.valorLocacao=valorLocacao;
        imovelLocado.setStatus("Locado");
        this.imovelLocado=imovelLocado;
        this.inquilino=inquilino;
        this.data=data;
    }
}
