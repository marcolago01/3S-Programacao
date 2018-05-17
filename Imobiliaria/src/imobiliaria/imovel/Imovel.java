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
abstract public class Imovel {
    
    protected int id;
    protected String status;
    protected double area;
    protected String descricao;

    public Imovel(String status, double area, String descricao,int id) {
        
        this.status=status;
        this.area = area;
        this.descricao = descricao;
        this.id=id;
        
    }
    
   public void setStatus(String status){
       this.status=status;
   }
   
   public String getStatus(){
       return this.status;
   }
   
   abstract public String exibirDetalhes();
        
   
   public int getID(){
       return this.id;
   }
    
   
}
