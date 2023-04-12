/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package io.github.naum.grupostrabalho;

import java.util.ArrayList;
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
@Startup
public class CargaDados implements CargaDadosLocal {

    @Inject
    private PessoaServiceLocal persistenceService;
    
    @PostConstruct
    @Override
    public void popularBanco() {
        
        //Populando Ana Luiza
        Telefone t1 = new Telefone();
        t1.setDdd((byte)11);
        t1.setNumero(11111111);
                
        Telefone t2 = new Telefone();
        t2.setDdd((byte)12);
        t2.setNumero(12121212);
        
        Telefone t3 = new Telefone();
        t3.setDdd((byte)13);
        t3.setNumero(13131313);
        
        ArrayList<Telefone> teles1 = new ArrayList<>();
        teles1.add(t1);
        teles1.add(t2);
        teles1.add(t3);
        
        Endereco end1 = new Endereco();
        end1.setBairro("Bairro Humberto");
        end1.setLogradouro("1");
        end1.setNumero(1111);
        end1.setTipoLogradouro(Endereco.TipoLogradouro.RUA);
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana Luiza");
        p1.setEmail("ana@mail.com");
        p1.setNascimento("01/01/2001");
        p1.setTelefone(teles1);
        p1.setEndereco(end1);
        
        persistenceService.salvar(p1);
        
        // Populando Beatriz
        Telefone t4 = new Telefone();
        t4.setDdd((byte)22);
        t4.setNumero(22222222);
        
        ArrayList<Telefone> teles2 = new ArrayList<>();
        teles1.add(t4);
        
        Endereco end2 = new Endereco();
        end2.setBairro("Bairro Doisberto");
        end2.setLogradouro("2");
        end2.setNumero(2222);
        end2.setTipoLogradouro(Endereco.TipoLogradouro.AVENIDA);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Beatriz Souza");
        p2.setEmail("beatriz@mail.com");
        p2.setNascimento("02/02/2002");
        p2.setTelefone(teles2);
        p2.setEndereco(end2);
        
       persistenceService.salvar(p2);
       
       // Populando Cecilia
        Endereco end3 = new Endereco();
        end3.setBairro("Bairro Trêsberto");
        end3.setLogradouro("3");
        end3.setNumero(3333);
        end3.setTipoLogradouro(Endereco.TipoLogradouro.AVENIDA);
        
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Cecilia Xerxes");
        p3.setEmail("cecilia@mail.com");
        p3.setNascimento("03/03/2003");
        p3.setEndereco(end3);
        
        persistenceService.salvar(p3);
        
        //Populando Debora
        
        Telefone t5 = new Telefone();
        t5.setDdd((byte)44);
        t5.setNumero(44444444);
                
        Telefone t6 = new Telefone();
        t6.setDdd((byte)45);
        t6.setNumero(45454545);
        
        ArrayList<Telefone> teles3 = new ArrayList<>();
        teles1.add(t5);
        teles1.add(t6);
        
        Endereco end4 = new Endereco();
        end4.setBairro("Bairro Quatroberto");
        end4.setLogradouro("4");
        end4.setNumero(4444);
        end4.setTipoLogradouro(Endereco.TipoLogradouro.PRACA);
        
        Pessoa p4 = new Pessoa();
        p4.setNome("Debora Wendel");
        p4.setEmail("debora@mail.com");
        p4.setNascimento("04/04/2004");
        p4.setTelefone(teles3);
        p4.setEndereco(end4);
        persistenceService.salvar(p4);
        
        
        // Popular Grupo
        
        ArrayList<Pessoa> Pes1 = new ArrayList<>();
        Pes1.add(p1);
        Pes1.add(p2);
        Pes1.add(p3);
        Pes1.add(p4);
        
        Atuacao at1 = new Atuacao();
        at1.setInicio("01/01/2021");
        at1.setTermino("11/11/2021");
        at1.setPessoa(Pes1);
        at1.set
        
        Grupo g1 = new Grupo();
        g1.setNome("Estudo 1");
        g1.setAtivo(false);
        g1.s
    }

    
}
