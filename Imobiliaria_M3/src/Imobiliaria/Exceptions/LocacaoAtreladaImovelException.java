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
public class LocacaoAtreladaImovelException extends Exception {
    public LocacaoAtreladaImovelException(){
        super
                ("Existe uma locacao atrelada a esse imovel!\n");
    }
}
