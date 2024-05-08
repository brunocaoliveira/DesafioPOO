package iphone;

class ReprodutorDeMusica implements ReprodutorMusical {

    
    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando");
    }
}