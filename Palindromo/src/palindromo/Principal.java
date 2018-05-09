/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author marco.lago
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Palindromo teste = new Palindromo("aba","asa","roma é amor","ola","cabeca");
       teste.imprimirPalindromos();
       
       Palindromo teste2 = new Palindromo();
       Scanner sc = new Scanner(System.in);
       System.out.println("Insira quantas expressões deseja adicionar");
       int valor = sc.nextInt();

        for (int i = 0; i < valor; i++) {
            String expressao = sc.next();
            teste2.inserirExpressao(expressao);
        }
        teste2.imprimirPalindromos();
       
        
        
    }
    
}
