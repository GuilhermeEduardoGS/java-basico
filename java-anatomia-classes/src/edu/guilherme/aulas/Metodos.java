package edu.guilherme.aulas;

// Boas praticas:
// Nomear os metodos como verbos (somar, concluirProcessamento);
// Seguir o padrão camelCase

/*ATENÇÃO! Não existe em Java o conceito de métodos globais.
Todos os métodos devem SEMPRE ser definidos dentro de uma classe. */
public class Metodos {

    public double somar(int num1, int num2) {
        // LOGICA - FINALIDADE DO MÉTODO

        int resultadoSoma = num1 + num2;
        return resultadoSoma;
        // termina com return pois espera-se um retorno
    }

    public void imprimir(String texto) {
        // LOGICA - FINALIDADE DO MÉTODO
        // AQUI NÃO PRECISA DO RETURN
        // POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
    }

    public double dividir(int dividendo, int divisor) throws Exception {
        double resultadoDividir = dividendo / divisor;

        return resultadoDividir;
        // throws Exception : indica que o método ao ser utilizado
        // poderá gerar uma exceção
    }

    // este método não pode ser visto por outras classes no projeto
    /*
     * private void metodoPrivado() {
     * 
     * }
     */

    // alguns equívocos estruturais
    public void validar() {
        // este método deveria retornar algum valor
        // no caso boolean (true ou false)
    }

    public void calcularEnviar() {
        // um método deve representar uma única responsabilidade
    }

    public void gravarCliente(String nome, String cpf, Integer telefone) {
        // este método tem a finalidade de gravar
        // informações de um cliente, por que não criar
        // um objeto cliente e passar como parâmetro ?
        // veja abaixo

        /*
         * public void gravarCliente(Cliente cliente) {
         * }
         * 
         * // OU
         * 
         * public void gravar(Cliente cliente) {
         * }
         */

    }
}
