public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroSerial;

    public iphone(String modelo, String numeroSerial) {
        this.modelo = modelo;
        this.numeroSerial = numeroSerial;
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Reproduzindo a música: " + musica);
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void acessarInternet(String url) {
        System.out.println("Acessando o site: " + url);
    }

    // Métodos getters e setters podem ser adicionados conforme necessário
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(String numeroSerial) {
        this.numeroSerial = numeroSerial;
    }
}