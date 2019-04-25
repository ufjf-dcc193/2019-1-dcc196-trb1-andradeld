package com.example.dcc193.model;

public class Sede{

    private String nome;
    private String estado;
    private String cidade;
    private String bairro;
    private String telefone;
    private String endWEB;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the endWEB
     */
    public String getEndWEB() {
        return endWEB;
    }

    /**
     * @param endWEB the endWEB to set
     */
    public void setEndWEB(String endWEB) {
        this.endWEB = endWEB;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}