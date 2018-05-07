import java.util.Scanner;

public class JogoDaForcaEstruturado {

//	private static String[] palavras = {"terminator", "banana", "computer", "cow", "rain", "water" };
//	private static String palavra = palavras[(int) (Math.random() * palavras.length)];
//	private static String asterisco = new String(new char[palavra.length()]).replace("\0", "*");
//	private static int contador = 0;
//
        
	public static void main(String[]  args) {
            Palavra teste = new Palavra();
            teste.inserirPalavras();
            
            /*
            Forca forca = new Forca();
            
            forca.renderizarForca(forca.getContador(),forca.getPalavra());
            
            while(forca.getContador() < 7 && forca.getAsterisco().contains("*")){
                System.out.println("Adivinhe qualquer letra na palavra");
                System.out.println(forca.getAsterisco());
                char tecla = forca.capturarTecla();
                
                String novoAsterisco = forca.novoAsterisco(tecla);
                
                if(forca.getAsterisco().endsWith(novoAsterisco)){
                    forca.incrementarContador();
                    forca.renderizarForca(forca.getContador(),forca.getPalavra());
                }else{
                    forca.setAsterisco(novoAsterisco);
                }
                
                if(forca.getAsterisco().equals(forca.getPalavra())){
                    System.out.println("Correto! Voce venceu! A palavra é " + forca.getPalavra());
                }
        }*/
        
//		Scanner sc = new Scanner(System.in);
//
//		while (contador < 7 && asterisco.contains("*")) {
//			System.out.println("Adivinhe qualquer letra na palavra");
//			System.out.println(asterisco);
//			String guess = sc.next();
//                        String newasterisk = "";
//                        for (int i = 0; i < palavra.length(); i++) {
//                                if (palavra.charAt(i) == guess.charAt(0)) {
//                                        newasterisk += guess.charAt(0);
//                                } else if (asterisco.charAt(i) != '*') {
//                                        newasterisk += palavra.charAt(i);
//                                } else {
//                                        newasterisk += "*";
//                                }
//                        }
//
//                        if (asterisco.equals(newasterisk)) {
//                                contador++;
//                                if (contador == 1) {
//                                        System.out.println("Palpite errado, tente de novo!");
//                                        System.out.println();
//                                        System.out.println();
//                                        System.out.println();
//                                        System.out.println();
//                                        System.out.println("___|___");
//                                        System.out.println();
//                                }
//                                if (contador == 2) {
//                                        System.out.println("Palpite errado, tente de novo!");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("___|___");
//                                }
//                                if (contador == 3) {
//                                        System.out.println("Palpite errado, tente de novo!");
//                                        System.out.println("   ____________");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   | ");
//                                        System.out.println("___|___");
//                                }
//                                if (contador == 4) {
//                                        System.out.println("Palpite errado, tente de novo!");
//                                        System.out.println("   ____________");
//                                        System.out.println("   |          _|_");
//                                        System.out.println("   |         /   \\");
//                                        System.out.println("   |        |     |");
//                                        System.out.println("   |         \\_ _/");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("   |");
//                                        System.out.println("___|___");
//                                }
//                                if (contador == 5) {
//                                        System.out.println("Palpite errado, tente de novo!");
//                                        System.out.println("   ____________");
//                                        System.out.println("   |          _|_");
//                                        System.out.println("   |         /   \\");
//                                        System.out.println("   |        |     |");
//                                        System.out.println("   |         \\_ _/");
//                                        System.out.println("   |           |");
//                                        System.out.println("   |           |");
//                                        System.out.println("   |");
//                                        System.out.println("___|___");
//                                }
//                                if (contador == 6) {
//                                        System.out.println("Palpite errado, tente de novo!");
//                                        System.out.println("   ____________");
//                                        System.out.println("   |          _|_");
//                                        System.out.println("   |         /   \\");
//                                        System.out.println("   |        |     |");
//                                        System.out.println("   |         \\_ _/");
//                                        System.out.println("   |           |");
//                                        System.out.println("   |           |");
//                                        System.out.println("   |          / \\ ");
//                                        System.out.println("___|___      /   \\");
//                                }
//                                if (contador == 7) {
//                                        System.out.println("GAME OVER!");
//                                        System.out.println("   ____________");
//                                        System.out.println("   |          _|_");
//                                        System.out.println("   |         /   \\");
//                                        System.out.println("   |        |     |");
//                                        System.out.println("   |         \\_ _/");
//                                        System.out.println("   |          _|_");
//                                        System.out.println("   |         / | \\");
//                                        System.out.println("   |          / \\ ");
//                                        System.out.println("___|___      /   \\");
//                                        System.out.println("GAME OVER! A palavra era: " + palavra);
//                                }
//
//                        } else {
//                                asterisco = newasterisk;
//                        }
//                        if (asterisco.equals(palavra)) {
//                                System.out.println("Correto! Voce venceu! A palavra é " + palavra);
//                        }
//
//		}
//		sc.close();
            
	}
}