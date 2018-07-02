/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria.Dominio;
import Imobiliaria.Operacoes.*;
import Imobiliaria.*;
import Imobiliaria.Exceptions.*;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author marco
 */
public class Imobiliaria {
    private final Set<Imovel> imoveis;
    private final List<Venda> vendas;
    private final List<Locacao> locacoes;
    
    public Imobiliaria() {
        this.imoveis = new TreeSet<>();
        this.vendas = new LinkedList<>();
        this.locacoes = new LinkedList<>();
    }
    
    public void adicionarImovel (Imovel imovel) throws MatriculaExistenteException{
        if
            (0 != this.imoveis.stream()
            .filter(imo -> imo.getMatricula().equals(imovel.getMatricula()))
            .count())
        {
            throw new MatriculaExistenteException();
        }
        this.imoveis.add(imovel);
    }
    
    public Imovel obterImovel (String matricula){
        return (Imovel) this.imoveis.stream()
                .filter(imovel -> imovel.getMatricula().equals(matricula))
                .findFirst()
                .get();
    }
    
    //Venda
    
    private boolean podeVender(Imovel imovel) throws VendaAtivaExistenteException{
        boolean podeVender = this.vendas.stream()
                .filter(venda -> venda.imovel.equals(imovel) && venda.situacao == SituacaoVenda.aberto)
                .count() == 0;
        if(!podeVender){
            throw new VendaAtivaExistenteException();
        }
        return podeVender;
    }
    
    public void adicionarVenda(Imovel imovel, double valor) throws VendaAtivaExistenteException{
        if(podeVender(imovel)){
            this.vendas.add(new Venda(imovel,valor));
        }
    }
    
    public void vender(Imovel imovel, double valor, Pessoa comprador){
        this.vender(imovel.getMatricula(),valor,comprador);
    }
    
    public void vender(String matricula, double valor, Pessoa comprador){
        this.obterVenda(matricula, SituacaoVenda.aberto).vender(comprador, valor);
    }
            
    public Venda obterVenda(String matricula, SituacaoVenda situacao){
        return (Venda) this.vendas.stream()
                .filter(venda -> venda.imovel.getMatricula().equals(matricula) && venda.situacao == situacao)
                .findFirst()
                .get();
    }
    
    public void cancelarVenda(Imovel imovel){
        this.cancelarVenda(imovel.getMatricula());
    }
    
    public void cancelarVenda(String matricula){
        this.obterVenda(matricula,SituacaoVenda.aberto).cancelar();
    }
    
    
    public Venda[] historicoVenda(String matricula){
        List<Venda> vendasImovel= new ArrayList<>();
        this.vendas.stream()
                .filter(venda -> venda.imovel.getMatricula().equals(matricula))
                .forEach(venda -> vendasImovel.add(venda));
        
        return vendasImovel.toArray(new Venda[vendasImovel.size()]);
    }
    
    public Venda[] historicoVenda(Imovel imovel){
        return historicoVenda(imovel.getMatricula());
    }
    
    //Locação
    
    private boolean podeLocar(Imovel imovel) throws LocacaoAtivaExistenteException{
        boolean podeLocar =  this.locacoes.stream()
                .filter(locacao -> locacao.imovel.equals(imovel) && locacao.situacao == SituacaoLocacao.aberto)
                .count() == 0;
        if(!podeLocar){
            throw new LocacaoAtivaExistenteException();
        }
        return podeLocar;
    }
    
    public void adicionarLocacao(Imovel imovel,double valor) throws LocacaoAtivaExistenteException{
        if(podeLocar(imovel)){
            this.locacoes.add(new Locacao(imovel, valor));
        }
    }
    
    public void locar(Imovel imovel, Pessoa inquilino,double valor){
        this.locar(imovel.getMatricula(), inquilino, valor);
    }
    
    public void locar(String matricula, Pessoa inquilino,double valor){
        obterLocacao(matricula, SituacaoLocacao.aberto).locar(inquilino, valor);
    }
    
    public void cancelarLocacao(Imovel imovel){
        this.cancelarLocacao(imovel.getMatricula());
    }
    
    public void cancelarLocacao(String matricula){
        this.obterLocacao(matricula, SituacaoLocacao.aberto).cancelar();
    }
    
    public Locacao obterLocacao (String matricula,SituacaoLocacao situacao){
        return (Locacao) this.locacoes.stream()
                .filter(locacao->locacao.imovel.getMatricula().equals(matricula)&&locacao.situacao==situacao)
                .findFirst()
                .get();
    }
    
    public Locacao[] historicoLocacao(String matricula){
        List<Locacao> locacoesImovel= new ArrayList<>();
        this.locacoes.stream()
                .filter(locacao -> locacao.imovel.getMatricula().equals(matricula))
                .forEach(locacao -> locacoesImovel.add(locacao));
        
        return locacoesImovel.toArray(new Locacao[locacoesImovel.size()]);
    }
    
    
    public Locacao[] historicoLocacao(Imovel imovel){
        return historicoLocacao(imovel.getMatricula());
    }
    
    //Outros
    public Imovel[] getImoveis(){
        return this.imoveis.toArray(new Imovel[this.imoveis.size()]);
    }
    
    public void apagarImovel(String matricula) throws VendaAtreladaImovelException, LocacaoAtreladaImovelException{
        Imovel imovel = obterImovel(matricula);
        
        Locacao[] locacaoImovel = historicoLocacao(imovel);
        Venda[] vendaImovel = historicoVenda(imovel);
        
        for (Locacao locacao : locacaoImovel) {
            if(locacao.imovel.getMatricula().equals(matricula)){
                throw new LocacaoAtreladaImovelException();
            }
        }
        for (Venda venda : vendaImovel) {
            if(venda.imovel.getMatricula().equals(matricula)){
                throw new LocacaoAtreladaImovelException();
            }
        }
        
        this.imoveis.remove(imovel);
    }
    
    
}
