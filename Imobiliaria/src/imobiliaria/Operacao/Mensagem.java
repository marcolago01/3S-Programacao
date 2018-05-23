/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imobiliaria.Operacao;

/**
 *
 * @author marco.lago
 */
abstract public class Mensagem {
    public static String menuInicial(){
        return 
                "\nPor favor escolha uma opção:\n"
                   + "1 - Cadastro de imovel\n"
                   + "2 - Colocar imovel para locação\n"
                   + "3 - Colocar imovel para venda\n"
                   + "4 - Vender imovel\n"
                   + "5 - Alugar Imovel\n"
                   + "6 - Listar Imoveis\n"
                   + "7 - Listar Imovel especifico\n"
                   + "8 - Lista ultimo Imovel inserido\n"
                   + "9 - Sair\n"
                ;
    }
    
    public static String caso1(int campo){
        switch (campo){
            case 1:
                return 
                        "\nInsira o tipo do imovel: \n"
                        + "1 - Casa\n"
                        + "2 - Apartamento\n"
                        + "3 - Terreno\n"
                        + "4 - Sala Comercial\n"
                ;
            case 2:
                return 
                        "\nInforme a área do imovel: "
                ;
            case 3:
                return
                        "\nDescreva o imovel: "
                ;
            case 4:
                return
                        "\nInforme o status do imovel: "
                ;
            default:
                return null;
        }
    }
    
    public static String caso2(int campo){
        switch (campo){
            case 1:
                return
                        "\nInforme o ID da casa ou digite 0 para sair: "
                ;
            default:
                return null;
        }
    }
    
    public static String caso3(int campo){
        switch (campo){
            case 1:
                return caso2(campo);

            case 2:
                return 
                        "\nInforme o comprador: "
                ;
            case 3:
                return
                        "\nInforme a data da compra: "
                ;
            case 4:
                return
                        "\nInforme o valor da compra: "
                ;
            case 5: 
                return
                        "\nInforme o inquilino: "
                ;
            case 6:
                return 
                        "\nInforme o valor da locação: "
                ;
            case 7:
                return
                        "\nInforme a data da locação:  "
                ;
            default:
                return null;
        }
    }
    public static String invalido(){
        return "\nInvalido!\n";
    }
    
    public static String valido(){
        return "\nSucesso\n";
    }
}
