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
public class Palindromo{
    private String[] expressoes = new String[0];
    
    public Palindromo(){}
    
    public Palindromo(String...expressoes){
        for (String expressao : expressoes) {
            inserirExpressao(expressao);
        }
    }
    
    private void aumentarArray(){
        int tamanho = this.expressoes.length;
        String[] temp = this.expressoes;
            
        this.expressoes= new String[tamanho+1];
        System.arraycopy(temp, 0, this.expressoes, 0, tamanho);
    }
    
    public void inserirExpressao(String expressao){
        aumentarArray();
        this.expressoes[this.expressoes.length-1]=expressao;
        
    }

    public boolean palindromo(String expressao){
        String inverso = "";
        String exprTemp = expressao;
        if(expressao.contains(" ")){
            exprTemp = expressao.replaceAll(" ", "");
        }
       
        exprTemp = exprTemp.toLowerCase();
        
        int tamanho = exprTemp.length();
        
        int k = tamanho-1;
        for (int i = 0; i < tamanho; i++) {     
            inverso+=exprTemp.charAt(k);
            k--;
        }     
        return inverso.equals(exprTemp);
    }
    
    public void imprimirPalindromos(){
        for(String expressao:expressoes){
            if(this.palindromo(expressao)){
                System.out.print(expressao);
            }
        }
    }
    
}
