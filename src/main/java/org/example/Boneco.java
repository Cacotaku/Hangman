package org.example;


public class Boneco
{
    public static final int MAX_ERROS = 6;
    private int erros;
    private final String head;
    private final String body;
    private final String legs;

    public Boneco(String head, String body, String legs) {
        this.head  = head;
        this.body  = body;
        this.legs  = legs;
        this.erros = 0;
    }

    public void desenharProximaParte() {
        erros++;
    }

    @Override
    public String toString()
    {
        // exemplo simples de desenho ASCII baseado no número de erros
        // line 1: head
        String line1 = erros >= 1 ? "  O  " : "     ";

        // line 2: torso + arms
        String line2;
        if (erros >= 4) {
            line2 = " /|\\ ";
        } else if (erros == 3) {
            line2 = " /|  ";
        } else if (erros == 2) {
            line2 = "  |  ";
        } else {
            line2 = "     ";
        }

        // line 3: legs
        String line3;
        if (erros >= 6) {
            line3 = " / \\ ";
        } else if (erros == 5) {
            line3 = " /   ";
        } else {
            line3 = "     ";
        }

        return line1 + "\n" + line2 + "\n" + line3;
    }
}