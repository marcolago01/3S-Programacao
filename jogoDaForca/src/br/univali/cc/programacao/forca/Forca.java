package br.univali.cc.programacao.forca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5586658
 */

public class Forca {
    
    private String[] palavras;
    private String palavra;
    private String asterisco;
    private int contador=0;
    
    public Forca(){
        this.palavras = new String[5];
        String[] words= {"terminator", "banana", "computer", "cow", "rain", "water" };
        System.arraycopy(words, 0, this.palavras, 0, this.palavras.length);
        this.palavra = palavras[(int) (Math.random() * palavras.length)];
        this.asterisco = new String(new char[palavra.length()]).replace("\0", "*");    
    }
    
    public Forca(String[] palavras){
        this.palavras=palavras;
        this.palavra = palavras[(int) (Math.random() * palavras.length)];
        this.asterisco = new String(new char[palavra.length()]).replace("\0", "*");
    }
    
    public String getAsterisco(){
        return this.asterisco;
    }
    
    public String getPalavra(){
        return this.palavra;
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
     
    public void validarNovoAsterisco(String novoAsterisco){
        if(this.asterisco.endsWith(novoAsterisco)){
            this.contador++;
            renderizarForca();
        }else{
            this.asterisco=novoAsterisco;
        }
    }
    private void renderizarForca(){
        if (contador == 1) {
                System.out.println("Palpite errado, tente de novo!");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("___|___");
                System.out.println();
        }
        if (contador == 2) {
                System.out.println("Palpite errado, tente de novo!");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
        }
        if (contador == 3) {
                System.out.println("Palpite errado, tente de novo!");
                System.out.println("   ____________");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   | ");
                System.out.println("___|___");
        }
        if (contador == 4) {
                System.out.println("Palpite errado, tente de novo!");
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
        }
        if (contador == 5) {
                System.out.println("Palpite errado, tente de novo!");
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |");
                System.out.println("___|___");
        }
        if (contador == 6) {
                System.out.println("Palpite errado, tente de novo!");
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
        }
        if (contador == 7) {
                System.out.println("GAME OVER!");
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |          _|_");
                System.out.println("   |         / | \\");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
                System.out.println("GAME OVER! A palavra era: " + palavra);
        }
    }
    
    public boolean palavraIgual(){
        return this.asterisco.equals(this.palavra);
    }
    
}

        