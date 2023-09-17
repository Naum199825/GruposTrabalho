/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package io.github.naum.grupostrabalho;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author IFNMG
 */
@Singleton
@Startup // Ligou o servidor, ja carrega essa transacao para popular o banco
public class CargaDados implements CargaDadosLocal {

    @Inject
    private PessoaService pS;
    
    @PostConstruct

    @Override
    public void popularBanco() {
        Pessoa p = new Pessoa();
        p.setNome("Ana Zaira");
        p.setEmail("ana@mail.com");
        p.setNascimento(LocalDate.of(2001, 01, 01));
        
        Endereco end = new Endereco();
        end.setBairro("Bairro Humberto");
        end.setLogradouro("Rua 1");
        end.setNumero(1111);
        end.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        
        Telefone tel = new Telefone();
        tel.setDdd((byte)11);
        tel.setNumero(11111111);
        
        Telefone tel1 = new Telefone();
        tel1.setDdd((byte)12);
        tel1.setNumero(22222222);
        
        Telefone tel2 = new Telefone();
        tel2.setDdd((byte)13);
        tel2.setNumero(33333333);
        
        p.getTelefone().add(tel);
        p.getTelefone().add(tel1);
        p.getTelefone().add(tel2);
        
        
        
        Atuacao at = new Atuacao();
        at.setInicio(LocalDate.of(2023, 10, 15));
        at.setTermino(LocalDate.of(2023, 12, 10));
        
        Grupo gp = new Grupo();
        gp.setAtivo(true);
        gp.getAtores().add(at);
        gp.setLider(p);
        gp.setNome("Kaisen");
        
        p.getGruposliderados().add(gp);
        
    }
    
}
