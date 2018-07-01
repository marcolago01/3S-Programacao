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
public class Terreno extends Imovel{
    private boolean mato;

    public Terreno(boolean mato, String matricula) {
        super(matricula);
        this.mato = mato;
    }

    @Override
    public String exibirDetalhes() {
        String temMato = (mato)?"Sim":"Não";
        return
                "Tipo: Terreno\n"+
                "Matricula: "+getMatricula()+"\n"+
                "Possui mato: "+temMato+"\n";
    }
    
    
}
