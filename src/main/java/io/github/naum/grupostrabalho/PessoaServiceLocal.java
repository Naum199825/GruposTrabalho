/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package io.github.naum.grupostrabalho;

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

    public List<Pessoa> nomePessoasTyped();

    public List<Pessoa> nomePessoaNamedQuery();
    
}
