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
public class Apartamento extends Imovel{
    private int andar;

    public Apartamento(int andar, String matricula) {
        super(matricula);
        this.andar = andar;
    }

    @Override
    public String exibirDetalhes() {
        return
                "Tipo: Apartamento\n"+
                "Matricula: "+getMatricula()+"\n"+
                "Andar: "+this.andar+"\n";
    }
    
    
}
