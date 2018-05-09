/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 5586658
 */
public class Palavra {
    private String[] palavras = new String[0];

    public Palavra(){}
    
    public Palavra(String...palavra){
        for (int i = 0; i < palavra.length; i++) {
            String[] temp = this.palavras; 
        
            this.palavras=new String[i+1];
            System.arraycopy(temp, 0, this.palavras, 0, i);
            this.palavras[i]=palavra[i];
        }
    }
    
    public void inserirPalavras() {
        String palavra=capturarPalavra();
        
        int tamanho = this.palavras.length;
        String[] temp = new String[tamanho];
        System.arraycopy(this.palavras, 0, temp, 0,tamanho);
        
        this.palavras=new String[tamanho+1];
        System.arraycopy(temp, 0, this.palavras, 0, tamanho);
        this.palavras[tamanho]=palavra;
    }

    private String capturarPalavra(){
        Scanner sc = new Scanner(System.in);
        
        String tecla = sc.next();
    
        return tecla;
    }
    
    public String[] getPalavras() {
        return this.palavras;
    }
    
    
    
}
