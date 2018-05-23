/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Imobiliaria.Imobiliria;

/**
 *
 * @author 5586658
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imobiliria teste = new Imobiliria();
        
        teste.adicionarImovel(1, "legal", 25, "eae");
        teste.exibirImoveis();
        teste.colocarAVenda(1);
        teste.vendaImovel(1, "20/20/30", "Dorginhas", 1000);
        teste.exibirImoveis();
        teste.colocarAVenda(1);
        teste.exibirImoveis();
    }
    
}
