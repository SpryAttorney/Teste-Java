// Classe abstrata Veiculo (abstração)
abstract class Veiculo {
    private String marca;  // Encapsulamento
    private String modelo; // Encapsulamento

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método abstrato (abstração)
    public abstract void acelerar();
}

// Classe Carro que herda de Veiculo (herança)
class Carro extends Veiculo {
    private int portas; // Encapsulamento

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + getMarca() + " " + getModelo() + " está acelerando!");
    }
}

// Classe Moto que herda de Veiculo (herança)
class Moto extends Veiculo {
    private boolean temSidecar; // Encapsulamento

    public Moto(String marca, String modelo, boolean temSidecar) {
        super(marca, modelo);
        this.temSidecar = temSidecar;
    }

    public boolean isTemSidecar() {
        return temSidecar;
    }

    public void setTemSidecar(boolean temSidecar) {
        this.temSidecar = temSidecar;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto " + getMarca() + " " + getModelo() + " está acelerando!");
    }
}

// Classe principal para testar o código
public class Main {
    public static void main(String[] args) {
        // Polimorfismo
        Veiculo meuCarro = new Carro("Toyota", "Corolla", 4);
        Veiculo minhaMoto = new Moto("Honda", "CBR", false);

        // Usando métodos de Veiculo (encapsulamento)
        meuCarro.acelerar();
        minhaMoto.acelerar();

        // Demonstrando encapsulamento
        ((Carro) meuCarro).setPortas(2);
        System.out.println("O carro agora tem " + ((Carro) meuCarro).getPortas() + " portas.");
        
        ((Moto) minhaMoto).setTemSidecar(true);
        System.out.println("A moto tem sidecar: " + ((Moto) minhaMoto).isTemSidecar());
    }
}