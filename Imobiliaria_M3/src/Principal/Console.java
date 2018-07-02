/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author marco
 */
public abstract class Console {
    
    public static void exibirMenuPrincipal(){
        System.out.println
        ("Escolha uma Operação: \n"+
                "1 - Adicionar Imovel\n"+
                "2 - Adicionar Venda\n"+
                "3 - Adicionar Locacao\n"+
                "4 - Vender Imovel\n"+
                "5 - Locar Imovel\n"+
                "6 - Exibir Imoveis\n"+
                "7 - Historico Locacao de um imovel\n"+
                "8 - Historico Venda de um imovel\n"+
                "9 - Cancelar Venda\n"+
                "10 - Cancelar Locacao\n"+
                "11 - Excluir Imovel\n"+
                "0 - Sair\n");
    }
    
    public static void exibirValorIncorreto(){
        System.out.println
        ("Valor incorreto!\n"+
            "Insira novamente o valor\n");
    }
    
    public static void limparTela(){
        for (int i = 0; i < 50; ++i) System.out.println();
    }
    
    public static void exibirAdicionarImovel(){
        System.out.println
        ("Cadastro de Imovel\n\n"+
                "1 - Adicionar Casa\n"+
                "2 - Adicionar Apartamento\n"+
                "3 - Adicionar Terreno\n"+
                "4 - Adicionar Sala Comercial\n"+
                "0 - Voltar\n");
    }
    
    public static void exibirSolicitarMatricula(){
        System.out.println
        ("Insira a matricula: ");
    }
    public static void exibirSolicitarEGeminado(){
        System.out.println
        ("É geminado? (Sim ou Nao)");
    }
    public static void exibirSolicitarAndar(){
        System.out.println
        ("Andar: ");
    }
    public static void exibirSolicitarTemMato(){
        System.out.println
        ("Possui Mato? (Sim ou Nao) ");
    }
    public static void exibirSolicitarTemFachada(){
        System.out.println
        ("Possui fachada? (Sim ou Nao) ");
    }
    public static void exibirSolicitarValor(){
        System.out.println
        ("Valor: ");
    }
    public static void exibirImovelNaoEncontrado(){
        System.out.println
        ("Imovel não encontrado!\n ");
    }
    public static void exibirVendaAtivaNaoEncontrada(){
        System.out.println
        ("Nao foi encontrado venda para esse imovel em aberto!\n ");
    }
    public static void exibirLocacaoAtivaNaoEncontrada(){
        System.out.println
        ("Nao foi encontrado locação para esse imovel em aberto!\n ");
    }
    public static void exibirSolicitarNomePessoa(){
        System.out.println
        ("Insira o nome do cliente: ");
    }
    public static void exibirSolicitarCPFPessoa(){
        System.out.println
        ("Insira o CPF do cliente: ");
    }
    public static void naoEPossivelCancelarVenda(){
        System.out.println
        ("Não é possivel cancelar venda, pois nenhuma venda está em aberto \n");
    }
    public static void naoEPossivelCancelarLocacao(){
        System.out.println
        ("Não é possivel cancelar venda, pois nenhuma locacao está em aberto \n");
    }
    
}
