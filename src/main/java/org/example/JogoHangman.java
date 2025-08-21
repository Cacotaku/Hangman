package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class JogoHangman
{
    private Hangman jogoAtual;
    private final Scanner scanner;
    private Status status;
    private Boneco boneco;
    private final List<RegistroPartida> historico;

    public JogoHangman()
    {
        this.historico = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Inicia uma nova partida:
     * 1. Lê a palavra secreta
     * 2. Cria Hangman e Boneco
     * 3. Sinaliza status como ONGOING e armazena no histórico
     * 4. Entra no loopDeJogo()
     */
    public void iniciarPartida()
    {
         // 1. Leitura da palavra escolhida
        System.out.print("Digite a palavra secreta: ");
        String palavra = scanner.nextLine().trim().toUpperCase();

        // 2. Configuração do modelo de jogo e do boneco
        this.jogoAtual  = new Hangman();
        this.jogoAtual.setPalavra(palavra);

        this.boneco = new Boneco("   ", "   ", "   ");

        // 3. Inicialização de status
        this.status    = Status.ONGOING;

        // 4. Inicia o loop de leitura de tentativas
        loopDeJogo();
    }

    public void loopDeJogo()
    {
        while (status == Status.ONGOING)
        {
            atualizarStatus();
            System.out.print("Digite uma letra: ");
            String tentativa = scanner.nextLine().trim().toUpperCase();

            if (tentativa.isEmpty())
            {
                System.out.println("Nenhuma letra informada. Tente novamente.");
                continue;
            }

            char letra = tentativa.charAt(0);
            boolean acertou = jogoAtual.tentar(letra);

            if (!acertou)
            {
                boneco.desenharProximaParte();
            }

            if (jogoAtual.isVencido())
            {
                status = Status.WON;

            } else if (jogoAtual.isPerdido())
            {
                status = Status.LOST;
            }
        }

        atualizarStatus();
        System.out.println(status == Status.WON ? "Você venceu!" : "Você perdeu!");
        registrarPartida();

    }

    /**
     * Exibe o estado atual da palavra e do boneco
     */
    private void atualizarStatus()
    {

        System.out.println("\nPalavra: " + jogoAtual.getEstado());
        System.out.println(boneco);
        System.out.println("Erros: " + jogoAtual.getErroCount() +
                           " / " + Boneco.MAX_ERROS);

    }


    private void registrarPartida()
    {
        boolean venceu = (status == Status.WON);
        int erros      = jogoAtual.getErroCount();
        String palavra = jogoAtual.getPalavra();

        RegistroPartida registro = new RegistroPartida(
            palavra,
            venceu,
            erros,
            LocalDateTime.now()
        );
        historico.add(registro);

    }

    public void fechar()
    {
        scanner.close();
    }

}