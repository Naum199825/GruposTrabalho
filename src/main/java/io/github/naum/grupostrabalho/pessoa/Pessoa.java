/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.naum.grupostrabalho.pessoa;

import io.github.naum.grupostrabalho.atuacao.Atuacao;
import io.github.naum.grupostrabalho.endereco.Endereco;
import io.github.naum.grupostrabalho.grupo.Grupo;
import io.github.naum.grupostrabalho.Telefone;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

/**
 *
 * @author IFNMG
 */
@Entity
@NamedQueries({
    @NamedQuery(
            name = "Pessoa.findALL",
            query = "SELECT p FROM Pessoa p"
    ),
        @NamedQuery(
            name = "Pessoa.nomeALL",
            query = "SELECT p.nome FROM Pessoa p"
    ),
        @NamedQuery(
            name = "Pessoa.nomePessoasEnderecosALL",
            query = "SELECT p.nome, p.endereco FROM Pessoa p"
    ),
         @NamedQuery(
            name = "Pessoa.pessoasMAvenidaALL",
            query = "SELECT p from Pessoa p WHERE p.endereco.tipoLogradouro = 1"
    ),
         @NamedQuery(
            name = "Pessoa.pessoasNMPracaALL",
            query = "SELECT p from Pessoa p WHERE NOT p.endereco.tipoLogradouro = 2"
    ),
        @NamedQuery(
            name = "Pessoa.nomePessoasTelefonesALL",
            query = "SELECT p.nome, p.telefone FROM Pessoa p"
    )
})
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length=65)
    private String nome;
    
    @Column(length=250)
    private String email;
    
    private LocalDate nascimento;
    
    @Transient
    private Byte idade;

    //Unidirecional
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    
    @JsonbTransient
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private List<Telefone> telefone;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lider")
    private List<Grupo> gruposliderados;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private List<Atuacao> atuacoes;
    
    public Pessoa() {
        telefone = new ArrayList<>();
        gruposliderados = new ArrayList<>();
        atuacoes = new ArrayList<>();
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
        this.idade = (byte)this.nascimento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public Byte getIdade() {
        return (byte)this.nascimento.getYear();
    }
    
     public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }
    
      public List<Grupo> getGruposliderados() {
        return gruposliderados;
    }

    public void setGruposliderados(List<Grupo> gruposliderados) {
        this.gruposliderados = gruposliderados;
    }

    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    public void setAtuacoes(List<Atuacao> atuacoes) {
        this.atuacoes = atuacoes;
    }

//</editor-fold>
  
}
