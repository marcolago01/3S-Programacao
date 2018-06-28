/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imobiliaria;

import java.util.Date;
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
    
    public void adicionarImovel (Imovel imovel){
        this.imoveis.add(imovel);
    }
    
    private boolean podeVender(Imovel imovel){
        return this.vendas.stream()
                .filter(venda -> venda.imovel.equals(imovel) && venda.situacao == SituacaoVenda.aberto)
                .count() == 0;
    }
    
    public void adicionarVenda(Imovel imovel, double valor){
        if(podeVender(imovel)){
            this.vendas.add(new Venda(imovel,valor));
        }
    }
    
    public void vender(Imovel imovel, Date data, double valor, Pessoa comprador){
        this.vender(imovel.getMatricula(),data,valor,comprador);
    }
    
    public void vender(String matricula, Date data, double valor, Pessoa comprador){
        this.obterVenda(matricula, SituacaoVenda.aberto).vender(comprador, data, valor);
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
    
    private boolean podeLocar(Imovel imovel){
        return this.locacoes.stream()
                .filter(locacao -> locacao.imovel.equals(imovel) && locacao.situacao == SituacaoLocacao.aberto)
                .count() == 0;
    }
    
    public void adicionarLocacao(Imovel imovel,double valor){
        if(podeLocar(imovel)){
            this.locacoes.add(new Locacao(imovel, valor));
        }
    }
    
    public void locar(Imovel imovel, Pessoa inquilino, Date data, Date ate,double valor){
        this.locar(imovel.getMatricula(), inquilino, data, ate, valor);
    }
    
    public void locar(String matricula, Pessoa inquilino, Date data,Date ate,double valor){
        obterLocacao(matricula, SituacaoLocacao.aberto).locar(inquilino, data, ate, valor);
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
    
    public Imovel[] getImoveis(){
        return (Imovel[]) this.imoveis.stream().toArray();
        //return this.imoveis.toArray(new Imovel[this.imoveis.size()]);
    }
}
