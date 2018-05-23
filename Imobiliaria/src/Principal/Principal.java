/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Imobiliaria.Imobiliria;
import imobiliaria.Operacao.Mensagem;
import java.util.Scanner;

/**
 *
 * @author 5586658
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Imobiliria imobiliaria = new Imobiliria();
        
       boolean executar = true;
       int opcao;
       int id;
       Scanner sc = new Scanner(System.in);
       
       do{
           System.out.print(Mensagem.menuInicial());
           opcao= sc.nextInt();
           
           switch (opcao){
               case 1:
                   
                   double dado = 0;
                   int tipo;
                   String descricao;
                   String status;
                   boolean tipoValido=true;
                   
                   System.out.print(Mensagem.caso1(1));
                   do{
                      tipo = sc.nextInt();
                       if (tipo < 1 && tipo > 5) {
                           tipoValido=false;
                           Mensagem.invalido();
                       }
                   }while(!tipoValido);
                   
                   System.out.print(Mensagem.caso1(2));
                   dado = sc.nextDouble();
                   
                   System.out.print(Mensagem.caso1(3));
                   descricao=sc.nextLine();
                   
                   System.out.print(Mensagem.caso1(4));
                   status=sc.nextLine();
                   
                   imobiliaria.adicionarImovel(tipo, status, dado, descricao);
                   System.out.print(Mensagem.valido());
                   break;
               case 2:
                   boolean locacao;
                   
                   do{
                        System.out.print(Mensagem.caso2(1));
                        id=sc.nextInt();
                        locacao=imobiliaria.colocarParaLocacao(id);
                   }while(!locacao);
                   System.out.print(Mensagem.valido());
                   break;
               case 3:
                   boolean aVenda;
                   
                   do{
                        System.out.print(Mensagem.caso2(1));
                        id=sc.nextInt();
                        aVenda=imobiliaria.colocarAVenda(id);
                   }while(!aVenda);
                   System.out.print(Mensagem.valido());
                   break;
               case 4:
                   boolean vendido;
                   String comprador;
                   String dataVenda;
                   double valorVenda;
                   
                   System.out.print(Mensagem.caso3(2));
                   comprador=sc.nextLine();
                   System.out.print(Mensagem.caso3(3));
                   dataVenda=sc.nextLine();
                   System.out.print(Mensagem.caso3(4));
                   valorVenda=sc.nextDouble();
                   
                   do{
                        System.out.print(Mensagem.caso3(1));
                        id=sc.nextInt();
                        vendido = imobiliaria.vendaImovel(id, dataVenda, comprador, valorVenda);
                   }while(!vendido);
                   System.out.print(Mensagem.valido());
                   break;
               case 5:
                   boolean locado;
                   String inquilino;
                   String dataLocacao;
                   double valorLocacao;
                   
                   System.out.print(Mensagem.caso3(5));
                   inquilino=sc.nextLine();
                   System.out.print(Mensagem.caso3(7));
                   dataLocacao=sc.nextLine();
                   System.out.print(Mensagem.caso3(6));
                   valorLocacao=sc.nextDouble();
                   
                   do{
                        System.out.print(Mensagem.caso3(1));
                        id=sc.nextInt();
                        locado = imobiliaria.locacaoImovel(id, dataLocacao, inquilino, valorLocacao);
                   }while(!locado);
                   System.out.print(Mensagem.valido());
                   break;
               case 6:
                   imobiliaria.exibirImoveis();
                   break;
               case 7:
                   break;
               case 8:
                   break;
               case 9:
                   executar=false;
           }
       }while(executar);
       sc.close();
    }
    
}
