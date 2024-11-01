package projetoIncremental;

public class Cliente {
    private String nomeCliente;
    private int cpf;
    private int cnpj;
    private String email;
    private int telefone;

    /*  Cliente (String pNomeCliente, int pCpf, int pCnpj, String pEmail, int pTelefone){
        nomeCliente = pNomeCliente;
        cpf = pCpf;
        cnpj = pCnpj;
        email = pEmail;
        telefone = pTelefone;
    } */

        public String getNomeCliente() {
            return nomeCliente;
        }

        public void setNomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
        }

        public int getCpf(){
            return cpf;
        }

        public void setCpf(int cpf){
            this.cpf = cpf;
        }

        public int getCnpj(){
            return cnpj;
        }

        public void setCnpj(int cnpj){
            this.cnpj = cnpj;
        }

        public String getEmail(){
            return email;
        }

        public void setEmail(String email){
            this.email = email;
        }

        public int getTelefone(){
            return telefone;
        }

        public void setTelefone( int telefone){
            this.telefone = telefone;
        }
    
}
