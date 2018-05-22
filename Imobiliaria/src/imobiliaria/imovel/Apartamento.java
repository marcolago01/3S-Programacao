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
public class Apartamento extends Imovel{
    
    int vagasGaragem;
    int banheiros;
    int quartos;
    String nomePredio;
    int andar;
    boolean sacada;
    
    public Apartamento(String status,double area, String descricao,int id) {
        super(status, area, descricao, id);
    }
    
    @Override
    public String exibirDetalhes(){
        return this.descricao+"/n"
         + "Possui"+this.area+" metros quadrados\n"+
                "Sitiana no predio "+nomePredio+" no"+andar+"\n"+
                "Possui "+this.banheiros+" banheiro\n"+
                "Possui "+this.quartos+" quartos\n"+
                 "Com "+this.vagasGaragem+" vagas na garagem\n";
    }

}
