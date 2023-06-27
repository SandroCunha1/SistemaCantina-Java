package model.bo;
/**
 *
 * @author Sandro
 */
public class Fornecedor extends Pessoa {
    private String cnpj, inscricaoEstadual, razaoSocial;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String inscricaoEstadual, String razaoSocial, int id, String nome, String fone1, String fone2, String email, char status, String complementoEndereco, Endereco endereco) {
        super(id, nome, fone1, fone2, email, status, complementoEndereco, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual + ", razaoSocial=" + razaoSocial + '}';
    }
    
    
}
