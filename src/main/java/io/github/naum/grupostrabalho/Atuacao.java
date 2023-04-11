/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.naum.grupostrabalho;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

/**
 *
 * @author Friedrich Naum 
 */
@Entity
public class Atuacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate inicio;
    
    @Column(nullable = false)
    private LocalDate termino;
    
    @ManyToMany
    @JoinColumn(name = "pessoa_id")
    private List<Pessoa> pessoa;

    public Atuacao() {
        pessoa = new ArrayList<>();
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
       public Long getId() {
           return id;
       }

       public void setId(Long id) {
           this.id = id;
       }

       public LocalDate getInicio() {
           return inicio;
       }

       public void setInicio(String inicio) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ld = LocalDate.parse(inicio,formatter);
            this.inicio = ld;
       }

       public LocalDate getTermino() {
           return termino;
       }

       public void setTermino(String termino) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ld = LocalDate.parse(termino,formatter);
            this.termino = ld;
       }
       
        public List<Pessoa> getPessoa() {
            return pessoa;
        }

        public void setPessoa(List<Pessoa> pessoa) {
            this.pessoa = pessoa;
        }
    //</editor-fold>

}
