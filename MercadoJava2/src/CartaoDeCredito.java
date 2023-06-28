import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;
    //Atributos da clase Cartao de Credito

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
    //Getters necessarios para a leitura dos atributos privados

    public boolean comprar(Compra compra) {
        if(this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }

        return false;
    }
    //Metodo que irá realizar a compra, e retornara um boolean.

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }
    //Construtor do cartao
}
