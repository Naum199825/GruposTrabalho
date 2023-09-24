/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package io.github.naum.grupostrabalho.pessoa;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author IFNMG
 */
@Local
public interface PessoaServiceLocal {

    void salvar(Pessoa pessoa);

    List<Pessoa> dadosPessoas();

    List<Pessoa> dadosPessoaTyped();

    List<Pessoa> dadosPessoaNamedQuery();

    public List<Pessoa> nomePessoas();

    public List<String> nomePessoasTyped();

    public List<String> nomePessoaNamedQuery();

    public List<Pessoa> nomePessoasEnderecos();

    public List<Object[]> nomePessoasEnderecosTypedQuery();

    public List<Object[]> nomePessoaEnderecosNamedQuery();

    public List<Pessoa> pessoasNMPraca();

    public List<Pessoa> nomePessoasTelefones();

    public List<Object[]> nomePessoaTelefonesNamedQuery();

    public List<Object[]> nomePessoastelefonesTypedQuery();
    
    public List<Pessoa> PessoasDataNasc();

    public List<Pessoa> PessoasDDDQuery();

    public List<Pessoa> PessoasSemTelefoneQuery();

    public List<Pessoa> PessoasQTDTelefonesQuery();

    public List<Pessoa> PessoasDDD2Query();

    public List<Pessoa> pessoasNMPracaNamedQuery();

    public List<Pessoa> pessoasNMPracaTypedQuery();

    public List<Pessoa> pessoasMAvenidas();

    public List<Pessoa> pessoasMAvenidaTypedQuery();

    public List<Pessoa> pessoaMAvenidaNamedQuery();

    public List<Pessoa> membrosDescQuery(String nomeGrupo);
    
}
