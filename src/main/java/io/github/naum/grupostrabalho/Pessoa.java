/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.naum.grupostrabalho;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Friedrich Naum
 */
@Entity
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 65)
    private String nome;
    
    @Column(length = 250)
    private String email;
    
    private LocalDate nascimento;
    
    private Byte idade;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefone;
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "pessoa")
    private List<Atuacao> atuacao;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "lider")
    private List<Grupo> grupo;
    
    
    public Pessoa() {
         telefone = new ArrayList<>();
         atuacao = new ArrayList<>();
         grupo = new ArrayList<>();
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

        public LocalDate getNascimento() {
            return nascimento;
        }

        public void setNascimento(String nascimento) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ld = LocalDate.parse(nascimento,formatter);
            this.nascimento = ld;
            idade = (byte) ld.until(LocalDate.now(), ChronoUnit.YEARS);
        }

        public Byte getIdade() {
            return idade;
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

       public List<Atuacao> getAtuacao() {
           return atuacao;
       }

       public void setAtuacao(List<Atuacao> atuacao) {
           this.atuacao = atuacao;
       }

       public List<Grupo> getGrupo() {
           return grupo;
       }

       public void setGrupo(List<Grupo> grupo) {
           this.grupo = grupo;
       }

    //</editor-fold> 

    
}
