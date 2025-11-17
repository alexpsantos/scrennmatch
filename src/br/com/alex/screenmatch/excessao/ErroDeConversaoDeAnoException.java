package br.com.alex.screenmatch.excessao;

public class ErroDeConversaoDeAnoException extends RuntimeException {

    private String menssagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.menssagem = mensagem;
    }

    public String getMenssagem() {
        return this.menssagem;
    }
}
