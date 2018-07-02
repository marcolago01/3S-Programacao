/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria.Exceptions;

/**
 *
 * @author marco
 */
public class ValorIncorretoException extends Exception{
    public ValorIncorretoException(){
        super("Valor incorreto!\n"+
            "Insira novamente o valor\n");
    }
}


