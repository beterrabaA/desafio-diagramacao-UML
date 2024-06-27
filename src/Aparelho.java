import device.internet.BrowserInterface;
import device.musica.MusicaInterface;
import device.telefone.TelefoneInterface;

public class Aparelho implements MusicaInterface, TelefoneInterface, BrowserInterface {

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova pagina no navegador");
    }

    @Override
    public void pesquisar(String textoDePesquis) {
        System.out.println("Pesquisando "+ textoDePesquis+" no navegador");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando pagina no navegador");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica no player de musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no player de musica");
    }

    @Override
    public void selecionarMusica(String name) {
        System.out.println("Selecionando "+name+" no player de musica");
    }

    @Override
    public void chamar(int phoneNumber) {
        System.out.println("Ligando para o numero" + phoneNumber+" no telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligacao no telefone");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Mandando mensagem para o correio de voz  no telefone");
    }
}
