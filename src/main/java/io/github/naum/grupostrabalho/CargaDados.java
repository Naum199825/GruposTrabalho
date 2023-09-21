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
    private PessoaServiceLocal pS;
    
    @Inject
    private GrupoServiceLocal gS;
    
    @PostConstruct
    @Override
    public void popularBanco() {
        
        
        // Populando Ana Zaira (Pronto)
        Pessoa p = new Pessoa();
        p.setNome("Ana Zaira");
        p.setEmail("ana@mail.com");
        p.setNascimento(LocalDate.of(2001, 1, 1));
        
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
        
        p.setEndereco(end);
        
        
        // Populando Beatriz Yana(Pronto)
        Pessoa p2 = new Pessoa();
        p2.setNome("Beatriz Yana");
        p2.setEmail("batriz@mail.com");
        p2.setNascimento(LocalDate.of(2002, 2, 2));
        
        Endereco end2 = new Endereco();
        end2.setBairro("Bairro Doisberto");
        end2.setLogradouro("Avenida 2");
        end2.setNumero(2222);
        end2.setTipoLogradouro(Endereco.TipoLogradouro.AVENIDA);
        
        Telefone tel4 = new Telefone();
        tel4.setDdd((byte)22);
        tel4.setNumero(22222222);
        
        p2.getTelefone().add(tel4);
        p2.setEndereco(end2);
        
        pS.salvar(p2);
        
        // Populando Cecilia Xerxes(Pronto)
        Pessoa p3 = new Pessoa();
        p3.setNome("Cecilia Xerxes");
        p3.setEmail("cecilia@mail.com");
        p3.setNascimento(LocalDate.of(2003, 3, 3));
        
        Endereco end3 = new Endereco();
        end3.setBairro("Bairro Trêsberto");
        end3.setLogradouro("Avenida 3");
        end3.setNumero(3333);
        end3.setTipoLogradouro(Endereco.TipoLogradouro.AVENIDA);
        
        p3.setEndereco(end3);
        
        pS.salvar(p3);
        
        // Populando Débora Wendel(Pronto)
        Pessoa p4 = new Pessoa();
        p4.setNome("Débora Wendel");
        p4.setEmail("debora@mail.com");
        p4.setNascimento(LocalDate.of(2004, 4, 4));
        
        Endereco end4 = new Endereco();
        end4.setBairro("Bairro Quatroberto");
        end4.setLogradouro("PRACA 4");
        end4.setNumero(4444);
        end4.setTipoLogradouro(Endereco.TipoLogradouro.PRACA);
        
        Telefone tel5 = new Telefone();
        tel5.setDdd((byte)44);
        tel5.setNumero(44444444);
        
        Telefone tel6 = new Telefone();
        tel6.setDdd((byte)55);
        tel6.setNumero(55555555);
        
        p4.getTelefone().add(tel5);
        p4.getTelefone().add(tel6);
        p4.setEndereco(end4);
        
        pS.salvar(p4);
        
        
        
        // Populando Atuacões
        Atuacao at = new Atuacao();
        at.setInicio(LocalDate.of(2011, 1, 1));
        at.setTermino(LocalDate.of(2021, 11, 11));
        
          Atuacao at1 = new Atuacao();
          at1.setInicio(LocalDate.of(2012, 1, 1));
          at1.setTermino(LocalDate.of(2022, 11, 11));
            
          Atuacao at2 = new Atuacao();
          at2.setInicio(LocalDate.of(2012, 1, 2));
          at2.setTermino(LocalDate.of(2022, 11, 12));
          
          Atuacao at3 = new Atuacao();
          at3.setInicio(LocalDate.of(2013, 1, 3));
          at3.setTermino(LocalDate.of(2021, 1, 13));
          
          Atuacao at4 = new Atuacao();
          at4.setInicio(LocalDate.of(2014, 1, 4));
          at4.setTermino(LocalDate.of(2021, 1, 14));
          
          Atuacao at5 = new Atuacao();
          at5.setInicio(LocalDate.of(2012, 1, 2));
            
          Atuacao at6 = new Atuacao();
          at6.setInicio(LocalDate.of(2012, 01, 02));
          
          Atuacao at7 = new Atuacao();
          at7.setInicio(LocalDate.of(2012, 1, 2));
          at7.setTermino(LocalDate.of(2023, 1, 13));
          
          Atuacao at8 = new Atuacao();
          at8.setInicio(LocalDate.of(2012, 1, 3));
          at8.setTermino(LocalDate.of(2023, 1, 13));
          
          Atuacao at9 = new Atuacao();
          at9.setInicio(LocalDate.of(2012, 1, 4));
          at9.setTermino(LocalDate.of(2024, 1, 14));
          
          Atuacao at10 = new Atuacao();
          at10.setInicio(LocalDate.of(2012, 1, 4));
          at10.setTermino(LocalDate.of(2024, 1, 14));
          
          Atuacao at11 = new Atuacao();
          at11.setInicio(LocalDate.of(2012, 1, 4));
          at11.setTermino(LocalDate.of(2024, 1, 14));
              
        
          
       // Populando os Grupos
        
        Grupo gp = new Grupo();
        gp.setAtivo(false);
        gp.getAtores().add(at);
        gp.setLider(p);
        gp.setNome("Estudo I");
        
         Grupo gp1 = new Grupo();
        gp1.setAtivo(true);
        gp1.getAtores().add(at);
        gp1.setLider(p2);
        gp1.setNome("Estudo II");
        
        Grupo gp2 = new Grupo();
        gp2.setAtivo(false);
        gp2.getAtores().add(at);
        gp2.setLider(p3);
        gp2.setNome("Estudo III");
        
        Grupo gp3 = new Grupo();
        gp3.setAtivo(true);
        gp3.getAtores().add(at);
        gp3.setLider(p2);
        gp3.setNome("Estudo IV");
        
        
        //Salvando Grupos e Pessoas e terminando de adiconar elementos
        
        p.getGruposliderados().add(gp);
        p.getAtuacoes().add(at);
        p.getAtuacoes().add(at1);
        p.getAtuacoes().add(at2);
        p.getAtuacoes().add(at3);
        p.getAtuacoes().add(at4);
        
        pS.salvar(p);
        
        p2.getGruposliderados().add(gp1);
        p2.getGruposliderados().add(gp3);
        p2.getAtuacoes().add(at);
        p2.getAtuacoes().add(at1);
        p2.getAtuacoes().add(at2);
        p2.getAtuacoes().add(at3);
        p2.getAtuacoes().add(at4);
        
        pS.salvar(p2);
        
        p3.getGruposliderados().add(gp2);
        p3.getAtuacoes().add(at);
        p3.getAtuacoes().add(at1);
        p3.getAtuacoes().add(at2);
        p3.getAtuacoes().add(at3);
        p3.getAtuacoes().add(at4);
        p3.getAtuacoes().add(at9);
        p3.getAtuacoes().add(at10);
        p3.getAtuacoes().add(at11);
        
        pS.salvar(p3);
        
        p4.getAtuacoes().add(at);
        p4.getAtuacoes().add(at1);
        p4.getAtuacoes().add(at2);
        p4.getAtuacoes().add(at3);
        p4.getAtuacoes().add(at4);
        p4.getAtuacoes().add(at5);
        p4.getAtuacoes().add(at6);
        p4.getAtuacoes().add(at7);
        p4.getAtuacoes().add(at8);
        p4.getAtuacoes().add(at9);
        p4.getAtuacoes().add(at10);
        p4.getAtuacoes().add(at11);
        
        pS.salvar(p4);
        
        gp.getAtores().add(at);
        gp.getAtores().add(at1);
        gp.getAtores().add(at2);
        gp.getAtores().add(at3);
        gp.getAtores().add(at4);
        
        gS.salvar(gp);
        
        gp1.getAtores().add(at5);
        gp1.getAtores().add(at6);
        
        gS.salvar(gp1);
        
        gp2.getAtores().add(at7);
        gp2.getAtores().add(at8);
        
        gS.salvar(gp2);
        
        gp3.getAtores().add(at9);
        gp3.getAtores().add(at10);
        gp3.getAtores().add(at11);
        
        gS.salvar(gp3);
        
    }
    
}
