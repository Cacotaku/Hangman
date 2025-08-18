package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class JogoHangman
{
    private ArrayList<Hangman> jogo;
    private Scanner scanner;
    private Status status;
    private ArrayList<String> boneco;

    public JogoHangman(ArrayList<Hangman> jogo)
    {
        this.jogo = jogo;
        this.scanner = new Scanner(System.in);
    }

    public void novoJogo()
    {
        System.out.println("Digite a nova palavra: \n");
        String palavra = scanner.nextLine();


    }

    public ArrayList<String> ArranjoDaPalavra(String palavra)
    {
        ArrayList<String> organizacao = new ArrayList<>();

        int tamanho = palavra.length();

        for(int i = 0; i < tamanho; i++)
        {
            organizacao.add(String.valueOf(palavra.charAt(i)));
        }
        return organizacao ;
    }

    public ArrayList<String> EstaInvisivel(String palavra)
    {
        ArrayList<String> organizacao = new ArrayList<>();

        int tamanho = palavra.length();

        for(int i = 0; i < tamanho; i++)
        {
            organizacao.add(String.valueOf(palavra.charAt(i)));
        }
        return organizacao ;
    }

    public String NovaEstrutura()
    {
        return " " + "\n" +
               " ======= " + "\n" +
               " |     |" + "\n" +
               " |    " + "\n" +
               " |    " + "\n" +
               " |    " + "\n" +
               " |" + "\n" +
               " |\n" ;
    }
}
