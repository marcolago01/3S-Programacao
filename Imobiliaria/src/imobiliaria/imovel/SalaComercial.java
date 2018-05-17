/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria.imovel;

/**
 *
 * @author 5586658
 */
public class SalaComercial extends Imovel{    
    
    
    public SalaComercial(String status,double area, String descricao,int id) {
        super(status, area, descricao,id);
    }

    @Override
    public String exibirDetalhes(){
      return 
                "ID: "+id+" \nStatus: "+status+
                "\nArea: "+area+"\nDescricao: "+descricao;
    }
}