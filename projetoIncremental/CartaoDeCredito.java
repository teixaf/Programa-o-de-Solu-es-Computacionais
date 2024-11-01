package projetoIncremental;
public class CartaoDeCredito {
    private int numero;
    private String nomeTitular;
    private String cpf;
    private double limite;
    private double totalFatura;
    private double cashback;

    public CartaoDeCredito(int numero, String nomeTitular, String cpf){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.limite = 100;
        this.totalFatura = 0;
    }

    public CartaoDeCredito(int numero, String nomeTitular, double limite, double cashback, String cpf){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.limite = 100;
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

    public double consultarLimite(){
        return limite;
    }

    public double consultarTotalFatura(){
        return totalFatura;
    }

    public void realizarCompra(double valor, boolean cashback) {
        if (valor <= this.limite && cashback){
            double valorCashback = valor * this.cashback;
            double limiteAnterior = this.getLimite();
            this.setLimite(limiteAnterior - valor);
            double total = this.getTotalFatura();
            this.setTtotalFatura(total + valor;)
        } else {
            System.out.println("Você não possui limite necessario para essa compra");
        }
    }
}