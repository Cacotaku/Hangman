package org.example;

import java.time.LocalDateTime;

public class RegistroPartida
{

    private final String palavraSecreta;
    private final boolean venceu;
    private final int numErros;
    private final LocalDateTime dataHora;

    public RegistroPartida(String palavraSecreta,
                           boolean venceu,
                           int numErros,
                           LocalDateTime dataHora) {
        this.palavraSecreta = palavraSecreta;
        this.venceu         = venceu;
        this.numErros       = numErros;
        this.dataHora       = dataHora;
    }

    public String getPalavraSecreta() {
        return palavraSecreta;
    }

    public boolean isVenceu() {
        return venceu;
    }

    public int getNumErros() {
        return numErros;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return String.format(
            "[%s] Palavra: %s | Erros: %d | Resultado: %s",
            dataHora,
            palavraSecreta,
            numErros,
            venceu ? "VITÓRIA" : "DERROTA"
        );
    }



}
