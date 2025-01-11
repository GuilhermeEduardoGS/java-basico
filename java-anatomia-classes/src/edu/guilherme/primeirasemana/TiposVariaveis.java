package edu.guilherme.primeirasemana;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {

        /*TIPOS DE VARIÁVEIS */

        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído.
        
        idade = 23; // idade atribuida com o valor de 23. 
        System.out.println(idade);

        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        System.out.println(anoFabricacao);

        double salarioMinimo = 2500.50; //tipo "double", nome "salarioMinimo", valor 2.500,50.
        System.out.println(salarioMinimo);

        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo ou uma string.
        System.out.println(cep);

		long cpf = 98765432109L; /*  o tipo long tem que terminar em "L". 
        Se começar com zero, talvez tenha que ser outro tipo ou uma string.*/ 
        System.out.println(cpf);

		float pi = 3.14F; // o tipo float tem que terminar em "F".
        System.out.println(pi);
		
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        /*Por mais que temos ciência que valor de numeroNormal 
        cabe é um short, o Java não permite correr o risco.
        Então adicionamos um cast de short para ele.*/

        /*CONSTANTE*/

        // Por convenção, Constantes são sempre escritas em CAIXA ALTA.
        // Para fazer uma constante basta adicionar a keyword "final" antes do tipo da variável

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);

        // VALOR_DE_PI = 3.15; 
        // da erro pois VALOR_DE_PI é uma constante.

    }

}
