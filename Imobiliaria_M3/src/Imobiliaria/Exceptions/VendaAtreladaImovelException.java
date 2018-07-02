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
public class VendaAtreladaImovelException extends Exception {
    public VendaAtreladaImovelException(){
        super
                ("Existe uma venda atrelada a esse imovel!\n");
    }
}
