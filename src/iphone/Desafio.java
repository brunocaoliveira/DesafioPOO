package iphone;

public class Desafio {
    public static void main(String[] args) {
        // Usando o Reprodutor Musical
        ReprodutorMusical reprodutor = new ReprodutorDeMusica();
        reprodutor.selecionarMusica();
        reprodutor.tocar();
        reprodutor.pausar();

        // Usando o Aparelho Telefônico
        AparelhoTelefonico telefone = new Telefone();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        // Usando o Navegador na Internet
        NavegadorInternet navegador = new Navegador();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}