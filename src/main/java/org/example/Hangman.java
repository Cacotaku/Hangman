package org.example;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Hangman
{

    private String palavra;
    private char[] estado;
    private int erroCount;


    public void setPalavra(String palavra)
    {
        this.palavra = palavra;
        this.estado = new char[palavra.length()];
        for (int i = 0; i < estado.length; i++)
        {
            estado[i] = '_';
        }
        this.erroCount = 0;
    }

    public boolean tentar(char letra)
    {
        boolean acerto = false;
        for (int i = 0; i < palavra.length(); i++)
        {
            if (palavra.charAt(i) == letra)
            {
                estado[i] = letra;
                acerto = true;
            }
        }
        if (!acerto) {
            erroCount++;
        }
        return acerto;
    }

    public String getEstado() {
        return new String(estado);
    }

    public String getPalavra() {
        return palavra;
    }

    public int getErroCount() {
        return erroCount;
    }

    public boolean isVencido() {
        for (char c : estado) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    public boolean isPerdido() {
        return erroCount >= Boneco.MAX_ERROS;
    }

}