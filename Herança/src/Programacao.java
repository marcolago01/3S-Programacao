
import exercicio_1.Animal;
import exercicio_1.Cachorro;
import exercicio_1.Gato;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5586658
 */
public class Programacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal teste = new Animal();
        System.out.println(teste.caminhar());
        
        teste = new Gato();
        System.out.println(((Gato)teste).mia());
        
        teste = new Cachorro();
        System.out.println(((Cachorro)teste).late());
        
        System.out.println(((Animal)teste).caminhar());
    }
    
}
