/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author marco
 */
public class Imobiliaria {
    private final Set<Imovel> imoveis;
    
    public Imobiliaria() {
        imoveis = new TreeSet<>();
    }
    
    public void adicionarImovel (Imovel imovel){
        this.imoveis.add(imovel);
    }
    
    
}
