/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package io.github.naum.grupostrabalho.grupo;

import java.time.LocalDate;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fried
 */
@Local
public interface GrupoServiceLocal {

    void salvar(Grupo grupo);

    public List<Grupo> GruposNAtivos();

    public List<Grupo> GruposLideres();

    public List<Object[]> MembrosDESC();

    public List<Grupo> gruposLiderados(String nomeLider);

    public List<Object[]> dataIniDatafimCecilia(String nomeMembro);

    public List<Grupo> gruposContemII(String str);

    public List<Object[]> gruposMembrosDistin();

    public List<Object[]> grupos3MaisMembros(long qtd);

    public List<Object[]> memebros2012(String nomeGrupo, LocalDate data);

    public List<Object[]> infoMemGrupo(LocalDate data);

    public List<Object[]> semTermino();

    public List<Object[]> questao22();
    
}
