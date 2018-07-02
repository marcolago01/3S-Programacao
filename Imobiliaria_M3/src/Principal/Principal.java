/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Imobiliaria.Operacoes.*;
import Imobiliaria.Dominio.*;
import Imobiliaria.*;
import Imobiliaria.Exceptions.*;
        
import java.util.Scanner;

/**
 *
 * @author marco
 */

public class Principal {
    static private Scanner sc = new Scanner(System.in);
    
    static private int getValor() throws ValorIncorretoException{
        int opcao = sc.nextInt();
        if (opcao % 1 == 0){
            return opcao;
            
        }
        throw new ValorIncorretoException();
    }
    static private int pegarValor(){
        int valor = -1;
        try{
           valor=getValor();
        }catch (Exception ex){
            Console.exibirValorIncorreto();
            sc.nextLine();
            valor = pegarValor();
        }finally{
            return valor;
        }
    }
    static private double getValorReal() throws ValorIncorretoException{
        double opcao = sc.nextFloat();
        if (opcao % 1 == 0){
            return opcao;
            
        }
        throw new ValorIncorretoException();
    }
    static private double pegarValorReal(){
        double valor = -1;
        try{
           valor=getValor();
        }catch (Exception ex){
            Console.exibirValorIncorreto();
            sc.nextLine();
            valor = pegarValor();
        }finally{
            return valor;
        }
    }
    static private String getExpressao() throws ValorIncorretoException{
        String expressao = sc.next();
        if(expressao.isEmpty()){
            throw new ValorIncorretoException();
        }
        return expressao;
    }
    static private String pegarExpressao(){
        String expressao=null;
        try{
            expressao=getExpressao();
        }catch (Exception ex){
            Console.exibirValorIncorreto();
            sc.nextLine();
            expressao=null;
        }finally{
            sc.nextLine();
            return expressao;
        }
    }
    static private boolean getBoolean() throws ValorIncorretoException{
        String opcao = sc.next();
        opcao=opcao.toLowerCase();
        if(null == opcao){
            throw new ValorIncorretoException();
        }else switch (opcao) {
            case "sim":
                return true;
            case "nao":
                return false;
            default:
                throw new ValorIncorretoException();
        }
    }
    static private boolean pegarBoolean(){
        boolean opcao=false;
        try{
            opcao=getBoolean();
        }catch(Exception ex){
            Console.exibirValorIncorreto();
            opcao=pegarBoolean();
        }finally{
            sc.nextLine();
            return opcao;
        }
    }
    
    static private String pegarMatricula(Imobiliaria imobiliaria){
        Console.limparTela();
        Console.exibirSolicitarMatricula();
        String matricula = pegarExpressao();
        try{
           imobiliaria.obterImovel(matricula);
        }catch (Exception ex){
            Console.exibirImovelNaoEncontrado();
            return "";
        }
        return matricula;
        
    }
   
    static private void adicionarImovel(Imobiliaria imobiliaria){
        int operacao;
        boolean telaAdicionarImovel=true;
        
        do{
            Console.exibirAdicionarImovel();
            operacao = pegarValor();
            while(operacao < -1 && operacao > 4){
                Console.limparTela();
                Console.exibirValorIncorreto();
                Console.exibirAdicionarImovel();
                operacao = pegarValor();
            }
            
            String matricula;
            switch (operacao){
                case 1:
                    Console.limparTela();
                    Console.exibirSolicitarMatricula();
                    matricula = pegarExpressao();
                    Console.exibirSolicitarEGeminado();
                    boolean geminado = pegarBoolean();

                    Imovel casa = new Casa(geminado, matricula);
                    try{
                        imobiliaria.adicionarImovel(casa);
                    }catch (MatriculaExistenteException ex){
                        System.out.println(ex.getMessage());
                    }
                    
                    telaAdicionarImovel=false;
                    break;
                case 2:
                    Console.limparTela();
                    Console.exibirSolicitarMatricula();
                    matricula = pegarExpressao();
                    Console.exibirSolicitarAndar();
                    int andar = pegarValor();
                    
                    Imovel apartamento = new Apartamento(andar, matricula);
                    try{
                        imobiliaria.adicionarImovel(apartamento);
                    }catch (MatriculaExistenteException ex){
                        System.out.println(ex.getMessage());
                    }
                    
                    telaAdicionarImovel=false;
                    break;
                case 3:
                    Console.limparTela();
                    Console.exibirSolicitarMatricula();
                    matricula = pegarExpressao();
                    Console.exibirSolicitarTemMato();
                    boolean mato = pegarBoolean();
                    
                    Imovel terreno = new Terreno(mato, matricula);
                    try{
                        imobiliaria.adicionarImovel(terreno);
                    }catch (MatriculaExistenteException ex){
                        System.out.println(ex.getMessage());
                    }
                    
                    telaAdicionarImovel=false;
                    break;
                case 4: 
                    Console.limparTela();
                    Console.exibirSolicitarMatricula();
                    matricula = pegarExpressao();
                    Console.exibirSolicitarTemFachada();
                    boolean fachada = pegarBoolean();
                    
                    Imovel salaComercial = new SalaComercial(fachada, matricula);
                     try{
                       imobiliaria.adicionarImovel(salaComercial);
                    }catch (MatriculaExistenteException ex){
                        System.out.println(ex.getMessage());
                    }
    
                    telaAdicionarImovel=false;
                    break;
                case 0:
                    telaAdicionarImovel = false;
            }
        }while(telaAdicionarImovel);
    }  
    static private void adicionarVenda(Imobiliaria imobiliaria){
        Console.limparTela();
        Console.exibirSolicitarMatricula();
        String matricula = pegarExpressao();
        try{
           imobiliaria.obterImovel(matricula);
        }catch (Exception ex){
            Console.exibirImovelNaoEncontrado();
            return;
        }
        
        Console.exibirSolicitarValor();
        double valor = pegarValorReal();
           
        Imovel imovel = imobiliaria.obterImovel(matricula);
        try{
            imobiliaria.adicionarVenda(imovel, valor);
        }catch (VendaAtivaExistenteException ex){
            System.out.println(ex.getMessage());
        }
 
    }
    static private void adicionarLocacao(Imobiliaria imobiliaria){
        Console.limparTela();
        Console.exibirSolicitarMatricula();
        String matricula = pegarExpressao();
        try{
           imobiliaria.obterImovel(matricula);
        }catch (Exception ex){
            Console.exibirImovelNaoEncontrado();
            return;
        }
        
        Console.exibirSolicitarValor();
        double valor = pegarValorReal();
           
        Imovel imovel = imobiliaria.obterImovel(matricula);
        try{
            imobiliaria.adicionarLocacao(imovel, valor);
        }catch (LocacaoAtivaExistenteException ex){
            System.out.println(ex.getMessage());
        }
    }
    static private void venderImovel(Imobiliaria imobiliaria){
        String matricula = pegarMatricula(imobiliaria);
        try{
            imobiliaria.obterVenda(matricula, SituacaoVenda.aberto);
        }catch (Exception ex){
            Console.exibirVendaAtivaNaoEncontrada();
            return;
        }
        
        Console.exibirSolicitarNomePessoa();
        String nome = sc.nextLine();
        Console.exibirSolicitarCPFPessoa();
        String cpf = pegarExpressao();
        Console.exibirSolicitarValor();
        double valor = pegarValorReal();
        
        Pessoa cliente = new Pessoa(nome, cpf);
        imobiliaria.vender(matricula, valor, cliente);
    }
    static private void locarImovel(Imobiliaria imobiliaria){
        String matricula = pegarMatricula(imobiliaria);
        try{
            imobiliaria.obterLocacao(matricula, SituacaoLocacao.aberto);
        }catch (Exception ex){
            Console.exibirLocacaoAtivaNaoEncontrada();
            return;
        }
        
        Console.exibirSolicitarNomePessoa();
        String nome = sc.nextLine();
        Console.exibirSolicitarCPFPessoa();
        String cpf = pegarExpressao();
        Console.exibirSolicitarValor();
        double valor = pegarValorReal();
        
        Pessoa cliente = new Pessoa(nome, cpf);
        imobiliaria.locar(matricula, cliente, valor);
    }
    static private void exibirImoveis(Imobiliaria imobiliaria){
        Imovel[] imoveis = imobiliaria.getImoveis();
        
        Console.limparTela();
        for (Imovel imovel : imoveis) {
            System.out.println(imovel.exibirDetalhes());
        }
    }
    static private void exibirHistoricoLocacaoImovelEspecifico(Imobiliaria imobiliaria){
        String matricula = pegarMatricula(imobiliaria);
        Locacao[] locacaoImovel = imobiliaria.historicoLocacao(matricula);
        
        for (Locacao locacao : locacaoImovel) {
            System.out.println(locacao.exibirLocacao());
        }
    }
    static private void exibirHistoricoVendaImovelEspecifico(Imobiliaria imobiliaria){
        String matricula = pegarMatricula(imobiliaria);
        Venda[] vendaImovel = imobiliaria.historicoVenda(matricula);
        
        for (Venda venda : vendaImovel) {
            System.out.println(venda.exibirVenda());
        }
    }
    static private void cancelarVenda(Imobiliaria imobiliaria){
        String matricula = pegarMatricula(imobiliaria);
        if(matricula.isEmpty()){
            return;
        }
        
        try{
        imobiliaria.cancelarVenda(matricula);
        }catch (Exception ex){
            Console.naoEPossivelCancelarVenda();
        }
    }
    static private void cancelarLocacao(Imobiliaria imobiliaria){
        String matricula = pegarMatricula(imobiliaria);
        if(matricula.isEmpty()){
            return;
        }
        
        try{
        imobiliaria.cancelarLocacao(matricula);
        }catch (Exception ex){
            Console.naoEPossivelCancelarLocacao();
        }
    }
    static private void apagarImovel(Imobiliaria imobiliaria){
        String matricula = pegarMatricula(imobiliaria);
        try{
            imobiliaria.apagarImovel(matricula);
        }catch (VendaAtreladaImovelException | LocacaoAtreladaImovelException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Imobiliaria max = new Imobiliaria();
        
        boolean executando = true;
        int opcao;
          
        do{
            Console.exibirMenuPrincipal();
            opcao=pegarValor();
            switch (opcao){
                case 1:
                    adicionarImovel(max);
                    break;
                case 2:
                    adicionarVenda(max);
                    break;
                case 3:
                    adicionarLocacao(max);
                    break;
                case 4:
                    venderImovel(max);
                    break;
                case 5:
                    locarImovel(max);
                    break;
                case 6:
                    exibirImoveis(max);
                    break;
                case 7:
                    exibirHistoricoLocacaoImovelEspecifico(max);
                    break;
                case 8:
                    exibirHistoricoVendaImovelEspecifico(max);
                    break;
                case 9:
                    cancelarVenda(max);
                    break;
                case 10:
                    cancelarLocacao(max);
                    break;
                case 11:
                    apagarImovel(max);
                    break;
                case 0:
                    executando=false;
            }
  
       }while(executando);
    }
    
}
