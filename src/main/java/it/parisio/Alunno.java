package it.parisio;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Alunno {
    String nome;
    String cognome;
    Date dataNascita;

    public Alunno(
        @JsonProperty("nome") String nome,
        @JsonProperty("cognome") String cognome,
        @JsonProperty("dataNascita") Date dataNascita)
        {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Alunno [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + "]";
    }

    
}
