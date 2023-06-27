package DAO;

import java.util.ArrayList;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Cliente;
import model.bo.Endereco;
import model.bo.Fornecedor;
import model.bo.Funcionario;
import model.bo.Produto;

public class ClasseDados {

    private static ClasseDados instance;
    public static ArrayList<Bairro> listaBairro;
    public static ArrayList<Cidade> listaCidade;
    public static ArrayList<Cliente> listaCliente;
    public static ArrayList<Endereco> listaEndereco;
    public static ArrayList<Fornecedor> listaFornecedor;
    public static ArrayList<Funcionario> listaFuncionario;
    public static ArrayList<Produto> listaProduto;
    

    public static synchronized ClasseDados getInstance() {

        if (instance == null) {
            instance = new ClasseDados();
        }
        return instance;
    }

    private ClasseDados() {
        listaBairro = new ArrayList<>();
        
        Bairro bairro1 = new Bairro(1, "Centro");
        Bairro bairro2 = new Bairro(2, "Santa Barbara");
        Bairro bairro3 = new Bairro(3, "Humaitá");
        
        listaBairro.add(bairro1);
        listaBairro.add(bairro2);
        listaBairro.add(bairro3);
        
        listaCidade = new ArrayList<>();
        
        Cidade cidade1 = new Cidade(1, "São Paulo", "SP");
        Cidade cidade2 = new Cidade(2, "Rio de Janeiro", "RJ");
        Cidade cidade3 = new Cidade(3, "Belo Horizonte", "MG");

        listaCidade.add(cidade1);
        listaCidade.add(cidade2);
        listaCidade.add(cidade3);
        
         listaCliente = new ArrayList<>();
        
        Endereco endereco1 = new Endereco(1, "12345678", "Rua A", 'A', cidade1, bairro1);
        Endereco endereco2 = new Endereco(2, "87654321", "Rua B", 'A', cidade2, bairro2);
        Endereco endereco3 = new Endereco(3, "45678912", "Rua C", 'A', cidade3, bairro3);
        
        Cliente cliente1 = new Cliente("123456789", "987654321", "M001", "01/01/2000", 1, "Fulano", "999999999", "888888888", "fulano@example.com", 'A', "Complemento", endereco1);
        Cliente cliente2 = new Cliente("987654321", "123456789", "M002", "02/02/2000", 2, "Ciclano", "111111111", "222222222", "ciclano@example.com", 'A', "Complemento", endereco2);
        Cliente cliente3 = new Cliente("456789123", "321654987", "M003", "03/03/2000", 3, "Beltrano", "333333333", "444444444", "beltrano@example.com", 'A', "Complemento", endereco3);
        
        listaCliente.add(cliente1);
        listaCliente.add(cliente2);
        listaCliente.add(cliente3);
        
        listaEndereco = new ArrayList<>();
        listaEndereco.add(endereco1);
        listaEndereco.add(endereco2);
        listaEndereco.add(endereco3);
        
        listaFornecedor = new ArrayList<>();

        Fornecedor fornecedor1 = new Fornecedor("12345678901234", "12345678", "Razão Social 1", 1, "Fornecedor 1", "111111111", "222222222", "fornecedor1@example.com", 'A', "Complemento", endereco1);
        Fornecedor fornecedor2 = new Fornecedor("98765432109876", "87654321", "Razão Social 2", 2, "Fornecedor 2", "333333333", "444444444", "fornecedor2@example.com", 'A', "Complemento", endereco2);
        Fornecedor fornecedor3 = new Fornecedor("45678912345678", "45678912", "Razão Social 3", 3, "Fornecedor 3", "555555555", "666666666", "fornecedor3@example.com", 'A', "Complemento", endereco3);

        listaFornecedor.add(fornecedor1);
        listaFornecedor.add(fornecedor2);
        listaFornecedor.add(fornecedor3);

        listaFuncionario = new ArrayList<>();

        Funcionario funcionario1 = new Funcionario("12345678901", "12345678", "usuario1", "senha1", "01/01/2000", 1, "Funcionário 1", "777777777", "888888888", "funcionario1@example.com", 'A', "Complemento", endereco1);
        Funcionario funcionario2 = new Funcionario("98765432109", "87654321", "usuario2", "senha2", "02/02/2000", 2, "Funcionário 2", "999999999", "000000000", "funcionario2@example.com", 'A', "Complemento", endereco2);
        Funcionario funcionario3 = new Funcionario("45678912345", "45678912", "usuario3", "senha3", "03/03/2000", 3, "Funcionário 3", "111111111", "222222222", "funcionario3@example.com", 'A', "Complemento", endereco3);

        listaFuncionario.add(funcionario1);
        listaFuncionario.add(funcionario2);
        listaFuncionario.add(funcionario3);

        listaProduto = new ArrayList<>();

        Produto produto1 = new Produto("Descrição 1", "123456789", 1, 'A');
        Produto produto2 = new Produto("Descrição 2", "987654321", 2, 'A');
        Produto produto3 = new Produto("Descrição 3", "456789123", 3, 'A');

        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
    }
}
