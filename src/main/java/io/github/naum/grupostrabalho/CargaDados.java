/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package io.github.naum.grupostrabalho;

import java.util.ArrayList;
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
        
        ArrayList teles1 = new ArrayList<>();
        teles1.set(0, t1);
         teles1.set(1, t2);
          teles1.set(2, t3);
          
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana Luiza");
        p1.setEmail("ana@mail.com");
        p1.setNascimento("01/01/2001");
        p1.setTelefone(teles1);
        
        Pessoa p2 = new Pessoa();
        p1.setNome("Beatriz Souza");
        p1.setEmail("beatriz@mail.com");
        p1.setNascimento("02/02/2002");
        
        Pessoa p3 = new Pessoa();
        p1.setNome("Cecilia Xerxes");
        p1.setEmail("cecilia@mail.com");
        p1.setNascimento("03/03/2003");
        
        Pessoa p4 = new Pessoa();
        p1.setNome("Debora Wendel");
        p1.setEmail("debora@mail.com");
        p1.setNascimento("04/04/2004");
        persistenceService.salvar(p1);
        persistenceService.salvar(p2);
        persistenceService.salvar(p3);
        persistenceService.salvar(p4);
        
        
    }

    
}
