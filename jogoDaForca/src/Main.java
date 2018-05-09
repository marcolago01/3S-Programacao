
import br.univali.cc.programacao.forca.Forca;
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
public class Main {
    public static void main(String[]  args) {  
            Scanner sc = new Scanner(System.in);
            
            Forca forca = new Forca();
            
            while(forca.getContador() < 7 && forca.getAsterisco().contains("*")){
                System.out.println("Adivinhe qualquer letra na palavra");
                System.out.println(forca.getAsterisco());
                
                String capturar = sc.next();
                char tecla = capturar.charAt(0);
                
                String novoAsterisco = forca.novoAsterisco(tecla);
                forca.validarNovoAsterisco(novoAsterisco);
                if(forca.palavraIgual()){
                    System.out.println("Correto! Voce venceu! A palavra é " + forca.getPalavra());
                }
        }
            sc.close();
    }
}
