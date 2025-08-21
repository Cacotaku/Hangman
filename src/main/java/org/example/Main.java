package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    private Scanner scanner;

    public static void main(String[] args)
    {
        string opcao = Yes;
        
        scanner = new Scanner(System.in);
        
        // cria o controlador do jogo
        JogoHangman jogo = new JogoHangman();
        
        while(opcao == No || opcao == não)
        {

            // inicia uma partida (lê palavra, loop de tentativas etc)
            jogo.iniciarPartida();

            System.out.println("Deseja continua? (1 - Sim | 2 - Não)");
            opcao = scanner.nextLine().toUpperCase();
            
            switch(opcao)
            {
                case 1: 
                    
                    break;
                case 2:
                    break;
            }
            
            
            
        }

        // fecha recursos ao final
        jogo.fechar();

    }
}
