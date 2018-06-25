/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria;

/**
 *
 * @author marco
 */
public class SalaComercial extends Imovel{
    private boolean fachada;

    public SalaComercial(boolean fachada, String matricula) {
        super(matricula);
        this.fachada = fachada;
    }
    
}
