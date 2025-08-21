package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{

    public static void main(String[] args)
    {

         // cria o controlador do jogo
        JogoHangman jogo = new JogoHangman();

        // inicia uma partida (lê palavra, loop de tentativas etc)
        jogo.iniciarPartida();

        // fecha recursos ao final
        jogo.fechar();

    }
}