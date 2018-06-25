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
public class Casa extends Imovel{

    private boolean geminado;

    public Casa(boolean geminado, String matricula) {
        super(matricula);
        this.geminado = geminado;
    }
    
    
    
}
