package iphone;

public class Navegador implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo..");
    }

    @Override
    public void adicionarNovaAba() {
       System.out.println("Adicionando...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando");
    }
}
