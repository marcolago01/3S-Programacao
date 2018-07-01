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
public abstract class Imovel implements Comparable<Imovel>{
    private String matricula;

    public Imovel(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Imovel imovelInformado){
        return this.matricula.compareTo(imovelInformado.matricula);
    }

    public String getMatricula() {
        return matricula;
    }
    
    public abstract String exibirDetalhes();
    
}
