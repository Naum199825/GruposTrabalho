/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.naum.grupostrabalho;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Friedrich Naum
 */
@Entity
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Byte ddd;
    
    @Column(nullable = false)
    private Integer numero;
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
        public Long getId() {
           return id;
       }

       public void setId(Long id) {
           this.id = id;
       }

       public Byte getDdd() {
           return ddd;
       }

       public void setDdd(Byte ddd) {
           this.ddd = ddd;
       }

       public Integer getNumero() {
           return numero;
       }

       public void setNumero(Integer numero) {
           this.numero = numero;
       }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Equal/Hash/ToString">
        @Override
     public int hashCode() {
         int hash = 5;
         hash = 47 * hash + Objects.hashCode(this.id);
         return hash;
     }

     @Override
     public boolean equals(Object obj) {
         if (this == obj) {
             return true;
         }
         if (obj == null) {
             return false;
         }
         if (getClass() != obj.getClass()) {
             return false;
         }
         final Telefone other = (Telefone) obj;
         return Objects.equals(this.id, other.id);
     }

     @Override
     public String toString() {
         return "Telefone{" + "id=" + id 
                 + ", ddd=" + ddd 
                 + ", numero=" + numero 
                 + '}';
     }
    //</editor-fold>
    
    
}
