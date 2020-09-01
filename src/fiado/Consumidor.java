package fiado;

public class Consumidor {
    // Atributos
    private String nome;
    private int[] fiados;
    private int posicao = 0;

    // Construtor
    public Consumidor(String nome) {
        this.nome = nome;
        this.fiados = new int[10];
    }

    // Getter and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void registrarFiado(int valor) {
        this.fiados[posicao] = valor;
        posicao++;
    }

    public int getFiados() {
        int total = 0;
        for (int fiado : fiados) {
            total += fiado;
        }

        return total;
    }
}
