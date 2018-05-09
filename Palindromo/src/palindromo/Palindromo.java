/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author marco.lago
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expressao teste = new Expressao("aba");
        
        if(teste.palindromo("aba")){
            System.out.println("BLZ");
        }
        
        
    }
    
}
