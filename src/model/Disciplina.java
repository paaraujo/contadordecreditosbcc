/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pauloaraujo
 */
public class Disciplina {
    
    private String  nome;
    private String  codigo;
    private String  categoria;
    private int     creditos;
    
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getCodigo() { return codigo; }
 
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public int getCreditos() { return creditos; }

    public void setCreditos(int creditos) { this.creditos = creditos; }

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) { this.categoria = categoria; }
    
}
