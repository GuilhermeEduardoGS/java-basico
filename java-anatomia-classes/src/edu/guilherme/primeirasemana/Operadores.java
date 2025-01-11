package edu.guilherme.primeirasemana;

public class Operadores {

    public static void main(String[] args) {

        /* Operadores Aritméticos */

        double soma = 10.5 + 15.7; // 26.2
        int subtração = 113 - 25; // 88
        int multiplicacao = 20 * 7; // 140
        int divisao = 15 / 3; // 5
        int modulo = 18 % 3; // 0
        double resultado = (10 * 7) + (20 / 4); // 75

        String concatResultados = soma + ", " + subtração + ", " + multiplicacao + ", " + divisao + ", " + modulo + ", "
                + resultado;

        System.out.println(concatResultados);

        /*
         * ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo
         * texto,
         * realizará a “concatenação de textos”.
         */

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao); // Resultado: 31

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao); // Resultado: 1111

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao); // Resultado: 1111

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao); // Resultado: 1111

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao); // Resultado: 13

        /* Operadores Unários */

        int numero = 5;

        numero = -numero; // tranformando o numero em negativo

        numero = numero * -1; // tranformando o numero em positivo

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo, CUIDADO COM A ORDEM DE PRECEDENCIA!!

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro); // Invertendo o valor da variavel para false no print

        verdadeiro = !verdadeiro; // reatribuindo o valor da variavel em false
        System.out.println(verdadeiro);

        /* Operador Ternário */

        // Básicamente um if (?) e else (:);
        // A sintaxe é: condição ? valor_se_verdadeiro : valor_se_falso;

        int a, b;
        a = 6;
        b = 6;

        String respostaString = a == b ? "Verdadeiro" : "Falso";
        // como foi declarado como String, o operador ternário retornará um texto.

        System.out.println(respostaString);

        int respostaInt = a == b ? 1 : 0;
        // como foi declarado como inteiro, o operador ternário retornará um valor
        // inteiro.

        System.out.println(respostaInt);

        /* Operadores Relacionais */

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.print("numero1 é igual ao numero2? " + simNao + "\n"); // false

        simNao = numero1 != numero2;
        System.out.print("numero1 é diferente de numero2? " + simNao + "\n"); // true

        simNao = numero1 > numero2;
        System.out.print("numero1 é maior que numero2? " + simNao + "\n"); // false

        simNao = numero1 >= numero2;
        System.out.print("numero1 é maior ou igual ao numero2? " + simNao + "\n"); // false

        simNao = numero1 < numero2;
        System.out.print("numero1 é menor que numero2? " + simNao + "\n"); // true

        simNao = numero1 <= numero2;
        System.out.print("numero1 é menor ou igual ao numero2? " + simNao + "\n"); // true

        /* Para comparar conteúdos como strings ou objetos usamos o equals */

        String nomeUm = "Guilherme";
        String nomeDois = new String("Guilherme");
        // String nomeDois = "Guilherme";

        System.out.println(nomeUm == nomeDois); // false
        // Se a linha 125 fosse comentada e a linha 126 descomentada,
        // o resultado de (nomeUm == nomeDois) seria true

        System.out.println(nomeUm.equals(nomeDois)); // true


        /* Operadores Lógicos */

        boolean condicao1 = true;
        boolean condicao2 = false;
        boolean condicao3 = true;

       if(condicao1 && condicao3) // Com o && (and) todas as condições tem que ser true
       System.out.println("As duas condições são verdadeiras");
       
       if(condicao1 && (10 > 9)) // tambem funciona com expressão relacional
       System.out.println("As duas condições são verdadeiras");

       if(condicao1 || condicao2) // com o || (or) apenas uma condição precisa ser verdadeira
       System.out.println("Uma das duas condições é verdadeiras");

    }

}
