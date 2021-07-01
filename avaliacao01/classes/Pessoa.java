package classes;
import java.util.InputMismatchException;
public class Pessoa {
    private String nome;
    private String cpf;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            throw new InputMismatchException("O CPF deve ter 11 dígitos");
        }

}
}