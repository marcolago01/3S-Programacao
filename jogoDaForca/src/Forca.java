/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5586658
 */

public class Forca extends Interface {
    
    private String[] palavras= {"terminator", "banana", "computer", "cow", "rain", "water" };
    private String palavra = palavras[(int) (Math.random() * palavras.length)];
    private String asterisco = new String(new char[palavra.length()]).replace("\0", "*");
    private int contador=0;
    
    public void setAsterisco(String asterisco){
        this.asterisco=asterisco;
    }
    
    public String getAsterisco(){
        return this.asterisco;
    }
    
    public int getTamanhoPalavra(){
        return this.palavra.length();
    }
    public String getPalavra(){
        return this.palavra;
    }
    
    public void incrementarContador(){
        this.contador++;
    }
    
    public int getContador(){
        return this.contador;
    }

    public String novoAsterisco(char tecla){
        String novoAsterisco = "";
        for (int i = 0; i < this.palavra.length(); i++) {
            if (this.palavra.charAt(i) == tecla) {
                    novoAsterisco += tecla;
            } else if (this.asterisco.charAt(i) != '*') {
                    novoAsterisco += this.palavra.charAt(i);
            } else {
                    novoAsterisco += "*";
            }
        }
        return novoAsterisco;
    }

   public void inicializarForca(String[] palavras){
       
   }
}
