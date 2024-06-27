public class Main {
    public static void main(String[] args) {
        Aparelho iphone = new Aparelho();

        System.out.println("-------------------");
        System.out.println("Modulo de musica");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Lust for a Vampyr");

        System.out.println("-------------------");

        System.out.println("Modulo de telefone");
        iphone.atender();
        iphone.chamar(123456789);
        iphone.correioDeVoz();

        System.out.println("-------------------");

        System.out.println("Modulo de internet");
        iphone.abrirNovaAba();
        iphone.atualizar();
        iphone.pesquisar("gatos e carros");

    }
}