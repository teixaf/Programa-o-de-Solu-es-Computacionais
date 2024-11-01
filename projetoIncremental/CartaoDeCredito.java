package projetoIncremental;

public class CartaoDeCredito {
    private int numero;
    private String nomeTitular;
    private String cpf;
    private double limite;
    private double totalFatura;
    private double cashback;

    public CartaoDeCredito(int numero, String nomeTitular, String cpf) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.limite = 100;
        this.totalFatura = 0;
        this.cashback = 0;
    }

    public CartaoDeCredito(int numero, String nomeTitular, double limite, double cashback, String cpf) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.limite = limite;  // agora utiliza o limite passado como parâmetro
        this.totalFatura = 0;
        this.cashback = cashback;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nome) {
        this.nomeTitular = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTotalFatura() {
        return this.totalFatura;
    }

    public void setTotalFatura(double total) {
        this.totalFatura = total;
    }

    public double consultarLimite() {
        return limite;
    }

    public double consultarTotalFatura() {
        return totalFatura;
    }

    public void realizarCompra(double valor, boolean aplicarCashback) {
        if (valor <= this.limite) {
            double valorCashback = aplicarCashback ? valor * this.cashback : 0;
            this.setLimite(this.limite - valor);
            this.setTotalFatura(this.totalFatura + valor - valorCashback);
            System.out.println("Compra realizada. Valor: " + valor + ", Cashback aplicado: " + valorCashback);
        } else {
            System.out.println("Você não possui limite necessário para essa compra.");
        }
    }
}
