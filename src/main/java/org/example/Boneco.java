package org.example;

import java.util.Scanner;

public class Boneco
{


    private String head;
    private String upperBody;
    private String lowerBody;
    private Scanner scanner;

    public Boneco(String head, String upperBody, String lowerBody)
    {
        this.lowerBody = lowerBody;
        this.head = head;
        this.upperBody = upperBody;
        this.scanner = new Scanner(System.in);
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getUpperBody() {
        return upperBody;
    }

    public void setUpperBody(String upperBody) {
        this.upperBody = upperBody;
    }

    public String getLowerBody() {
        return lowerBody;
    }

    public void setLowerBody(String lowerBody) {
        this.lowerBody = lowerBody;
    }

    public Boneco NovoBoneco()
    {
        String head = "   ";
        String upperBody = "   ";
        String legs = "   ";

        return new Boneco (head, upperBody, legs);

    }





    public Boneco Desenho(int numeroDeErros)
    {
        Boneco boneco = new Boneco(head, upperBody, lowerBody);

        if(numeroDeErros == 0)
        {
            return boneco;
        }
        else if(numeroDeErros >= 1)
        {
            head = " o ";

            //Verificar parte de cima do corpo
            if(numeroDeErros >= 2)
            {
                upperBody = " | ";

            }else if(numeroDeErros == 3)
            {
                upperBody = "/| ";

            }else if(numeroDeErros == 4)
            {
                upperBody = "/|\\";
            }

            //Verificar parte de baixo do corpo
            if(numeroDeErros >= 5)
            {
                lowerBody = "/  ";

            }else if (numeroDeErros >= 6)
            {
                lowerBody = "/ \\";
            }

        }

        return new Boneco(head, upperBody, lowerBody);


    }
}
