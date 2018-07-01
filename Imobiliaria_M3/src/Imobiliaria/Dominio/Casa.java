/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria.Dominio;

/**
 *
 * @author marco
 */
public class Casa extends Imovel{

    private boolean geminado;

    public Casa(boolean geminado, String matricula) {
        super(matricula);
        this.geminado = geminado;
    }

    @Override
    public String exibirDetalhes() {
        String isGeminado = (this.geminado)?"Sim":"Não";
        return
                "Tipo: Casa\n"+
                "Matricula: "+getMatricula()+"\n"
                +"Geminado: "+isGeminado+"\n";
    }
    
    
    
}
