/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.naum.grupostrabalho;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author IFNMG
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
    
    

  
    
}
