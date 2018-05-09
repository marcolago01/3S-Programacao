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
public class Expressao implements Palavra{
    private String[] expressoes = new String[0];
    
    public Expressao(){}
    
    public Expressao(String...expressoes){
        for (String expressao : expressoes) {
            aumentarArray();
            inserirExpressao(expressao);
        }
    }
    
    private void aumentarArray(){
        int tamanho = this.expressoes.length;
        String[] temp = this.expressoes;
            
        this.expressoes= new String[tamanho+1];
        System.arraycopy(temp, 0, this.expressoes, 0, tamanho);
    }
    
    private void inserirExpressao(String expressao){
        aumentarArray();
        this.expressoes[this.expressoes.length-1]=expressao;
        
    }
    
    public void inserirExpressoes(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira quantas expressões deseja adicionar");
        int valor = sc.nextInt();
        
        for (int i = 0; i < valor; i++) {
            String expressao = sc.next();
            inserirExpressao(expressao);
        }
    }
    
    public String[] getExpressoes(){
        return this.expressoes;
    }
    
    @Override
    public boolean palindromo(String palavra){
        String inverso = "";
        String palavraTemp = palavra.replaceAll(" ", "");
        palavraTemp = palavraTemp.toLowerCase();
        
        int tamanho = palavraTemp.length();
        
        for (int i = 0; i < tamanho; i++) {
            int k = tamanho-1;
            inverso+=palavraTemp.charAt(k);
            k--;
        }
        
        return inverso==palavraTemp;
    }
    
}
