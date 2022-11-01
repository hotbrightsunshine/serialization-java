package it.parisio;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Classe {
    int numero;
    String sezione;
    String aula;
    ArrayList<Alunno> alunni;

    public Classe(
        @JsonProperty("numero") int n,
        @JsonProperty("sezione") String s,
        @JsonProperty("aula") String a,
        @JsonProperty("alunni") ArrayList<Alunno> al)
        {
        numero = n;
        sezione = s;
        aula = a;
        alunni = al;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getAlunni() {
        return alunni;
    }

    public void setAlunni(ArrayList<Alunno> alunni) {
        this.alunni = alunni;
    }

    @Override
    public String toString() {
        return "Classe [numero=" + numero + ", sezione=" + sezione + ", aula=" + aula + ", alunni=" + alunni + "]";
    }

    
}
