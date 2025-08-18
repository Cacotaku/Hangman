package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Hangman
{
    private String estrutura;
    private String palavra;
    private int numeroDeErros;
    private Status status;
    private ArrayList<String> letrasEscolhidas;
    private ArrayList<String> posicaoDasLetras;
    private Scanner scanner;

    Hangman(String estrutura, String palavra, int numeroDeErros, Status status)
    {
        this.estrutura = estrutura;
        this.palavra = palavra;
        this.numeroDeErros = numeroDeErros;
        this.status = status;
        this.scanner = new Scanner(System.in);
        this.letrasEscolhidas = new ArrayList<>();
        this.posicaoDasLetras = new ArrayList<>();

    }

    Hangman()
    {

    }

    public ArrayList<String> getPosicaoDasLetras() {
        return posicaoDasLetras;
    }

    public void setPosicaoDasLetras(ArrayList<String> posicaoDasLetras) {
        this.posicaoDasLetras = posicaoDasLetras;
    }

    public ArrayList<String> getLetrasEscolhidas() {
        return letrasEscolhidas;
    }

    public void setLetrasEscolhidas(ArrayList<String> letrasEscolhidas) {
        this.letrasEscolhidas = letrasEscolhidas;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getNumeroDeErros() {
        return numeroDeErros;
    }

    public void setNumeroDeErros(int numeroDeErros) {
        this.numeroDeErros = numeroDeErros;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    @Override
    public String toString() {
        return "Hangman{" +
                "estrutura='" + estrutura + '\'' +
                ", palavra='" + palavra + '\'' +
                ", numeroDeErros=" + numeroDeErros +
                ", status=" + status +
                ", letrasEscolhidas=" + letrasEscolhidas +
                ", posicaoDasLetras=" + posicaoDasLetras +
                '}';
    }

    //Chamar desenho da estrutura;
    public String NovaEstrutura(Boneco boneco)
    {
        return " " + "\n" +
               " ------- " + "\n" +
               " |" + "\n" +
               " |    " + boneco.getHead() + "\n" +
               " |    " + boneco.getUpperBody() + "\n" +
               " |    " + boneco.getLowerBody() +"\n" +
               " |" + "\n" +
               " |\n" ;
    }






}
