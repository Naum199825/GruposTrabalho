/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package io.github.naum.grupostrabalho;

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
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana Luiza");
        
        Pessoa p2 = new Pessoa();
        p1.setNome("Beatriz Souza");
        persistenceService.salvar(p1);
        persistenceService.salvar(p2);
    }

    
}
