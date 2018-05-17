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
public class Casa extends Imovel {

    int vagasGaragem;
    int banheiros;
    int quartos;
    
    public Casa(String status,double area, String descricao,int id) {
        super(status, area, descricao,id);
    }

    @Override
    public String exibirDetalhes(){
      return 
                "ID: "+id+" \nStatus: "+status+
                "\nArea: "+area+"\nDescricao: "+descricao+
              "\nVagas de Garagem: "+vagasGaragem+"\nBanheiros: "+banheiros+
              "\nQuarto: "+quartos;
   }
}
