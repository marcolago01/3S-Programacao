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
            System.arraycopy(this.palavras, 0, this.palavras, 0, palavras.length+1);
            this.palavras[i]=palavra[i];
        }
    }
    
    public void inserirPalavras() {
        String palavra=capturarPalavra();
        System.arraycopy(this.palavras, 0, this.palavras, 0, palavras.length+1);
        this.palavras[palavras.length-1]=palavra;
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
