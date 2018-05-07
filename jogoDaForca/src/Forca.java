
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5586658
 */

public class Forca implements Interface {
    
    private String[] palavras;
    private String palavra;
    private String asterisco;
    private int contador=0;
    
    public Forca(){
        this.palavras = new String[5];
        String[] words= {"terminator", "banana", "computer", "cow", "rain", "water" };
        for (int i = 0; i < this.palavras.length; i++) {
            this.palavras[i]=words[i];
        }
        this.palavra = palavras[(int) (Math.random() * palavras.length)];
        this.asterisco = new String(new char[palavra.length()]).replace("\0", "*");    
    }
    
    public Forca(String[] palavras){
        this.palavras=palavras;
        this.palavra = palavras[(int) (Math.random() * palavras.length)];
        this.asterisco = new String(new char[palavra.length()]).replace("\0", "*");
    }
    
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
    
    @Override
    public void renderizarForca(int contador,String palavra){
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
    
    @Override
    public char capturarTecla(){
        Scanner sc = new Scanner(System.in);
        
        String tecla = sc.next();
    
        return tecla.charAt(0);
    }
    
}
