package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Cliente;
import model.bo.Endereco;
import model.bo.Fornecedor;
import model.bo.Funcionario;
import model.bo.Produto;
import view.Busca;

public class ControllerBusca implements ActionListener {

    Busca telaBusca;
    Integer codigo;

    public ControllerBusca(Busca telaBusca) {

        this.telaBusca = telaBusca;
        this.telaBusca.getjButtonCarregar().addActionListener(this);
        this.telaBusca.getjButtonFiltrar().addActionListener(this);
        this.telaBusca.getjButtonSair().addActionListener(this);
        setTipeTable();

    }

    private void setTipeTable() {
        Object[][] dados = {};
        if (this.telaBusca.getTipoDados().equals("bairro")) {
            this.telaBusca.setjLabelTitulo("Bairros");           
            String[] colunas = {"id", "Descrição"};
            setColumns(dados, colunas);         
            TableColumnModel columnModel = this.telaBusca.getjTableDados().getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20); 
            columnModel.getColumn(1).setPreferredWidth(200);
        } else if (this.telaBusca.getTipoDados().equals("cidade")) {
            this.telaBusca.setjLabelTitulo("Cidades");    
            String[] colunas = {"id", "Descrição", "Uf"};
            setColumns(dados, colunas);  
            TableColumnModel columnModel = this.telaBusca.getjTableDados().getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20); 
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(20);
        } else if (this.telaBusca.getTipoDados().equals("cliente")) {
            this.telaBusca.setjLabelTitulo("Clientes");
            String[] colunas = {"id", "Nome", "Cpf"};
            setColumns(dados, colunas); 
            TableColumnModel columnModel = this.telaBusca.getjTableDados().getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20); 
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(2).setPreferredWidth(60);
        } else if (this.telaBusca.getTipoDados().equals("endereco")) {
            this.telaBusca.setjLabelTitulo("Endereços");
            String[] colunas = {"id", "Logradouro", "Bairro", "Cidade"};
            setColumns(dados, colunas); 
            TableColumnModel columnModel = this.telaBusca.getjTableDados().getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20); 
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(2).setPreferredWidth(60);
            columnModel.getColumn(2).setPreferredWidth(60); 
        }else if (this.telaBusca.getTipoDados().equals("fornecedor")) {
            this.telaBusca.setjLabelTitulo("Fornecedores");
            String[] colunas = {"id", "Razão Social", "Cnpj"};
            setColumns(dados, colunas); 
            TableColumnModel columnModel = this.telaBusca.getjTableDados().getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20); 
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(60); 
        }else if (this.telaBusca.getTipoDados().equals("funcionario")) {
            this.telaBusca.setjLabelTitulo("Funcionários");
            String[] colunas = {"id", "Nome", "Cpf"};
            setColumns(dados, colunas); 
            TableColumnModel columnModel = this.telaBusca.getjTableDados().getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20); 
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(2).setPreferredWidth(60); 
        }else if (this.telaBusca.getTipoDados().equals("produto")) {
            this.telaBusca.setjLabelTitulo("Produtos");
            String[] colunas = {"id", "Nome", "Código"};
            setColumns(dados, colunas); 
            TableColumnModel columnModel = this.telaBusca.getjTableDados().getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(20); 
            columnModel.getColumn(1).setPreferredWidth(100);
            columnModel.getColumn(2).setPreferredWidth(60);
        }
        
        
    }
    
    private void setColumns(Object[][] data, String[] colunas){
        DefaultTableModel tabelaModelo = new DefaultTableModel(data, colunas);
        this.telaBusca.getjTableDados().setModel(tabelaModelo);
    }

    private Integer getCod() {
        return (Integer) this.telaBusca.
                getjTableDados().
                getValueAt(this.telaBusca.getjTableDados().getSelectedRow(), 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBusca.getjButtonCarregar()) {

            if (this.telaBusca.getTipoDados().equals("bairro")) {
                controller.cadastros.ControllerCadastroBairro.codigo = getCod();
            } else if (this.telaBusca.getTipoDados().equals("cidade")) {
                controller.cadastros.ControllerCadastroCidade.codigo = getCod();
            } else if (this.telaBusca.getTipoDados().equals("cliente")) {
                controller.cadastros.ControllerCadastroCliente.codigo = getCod();
            }else if (this.telaBusca.getTipoDados().equals("endereco")) {
                controller.cadastros.ControllerCadastroEndereco.codigo = getCod();
            }else if (this.telaBusca.getTipoDados().equals("fornecedor")) {
                controller.cadastros.ControllerCadastroFornecedor.codigo = getCod();
            }else if (this.telaBusca.getTipoDados().equals("funcionario")) {
                controller.cadastros.ControllerCadastroFuncionario.codigo = getCod();
            }else if (this.telaBusca.getTipoDados().equals("produto")) {
                controller.cadastros.ControllerCadastroProduto.codigo = getCod();
            }
            
            this.telaBusca.dispose();
        } else if (e.getSource() == this.telaBusca.getjButtonFiltrar() && this.telaBusca.getTipoDados().equals("bairro")) {
            DAO.ClasseDados.getInstance();
            DefaultTableModel tabela = (DefaultTableModel) this.telaBusca.getjTableDados().getModel();
            for (Bairro bairroAtual : DAO.ClasseDados.listaBairro) {
                tabela.addRow(new Object[]{bairroAtual.getId(),
                    bairroAtual.getDescricao()});
            }

        } else if (e.getSource() == this.telaBusca.getjButtonFiltrar() && this.telaBusca.getTipoDados().equals("cidade")) {
            DAO.ClasseDados.getInstance();
            DefaultTableModel tabela = (DefaultTableModel) this.telaBusca.getjTableDados().getModel();
            for (Cidade cidade : DAO.ClasseDados.listaCidade) {
                tabela.addRow(new Object[]{cidade.getId(),
                    cidade.getDescricao(), cidade.getUf()});
            }

        } else if (e.getSource() == this.telaBusca.getjButtonFiltrar() && this.telaBusca.getTipoDados().equals("cliente")) {
            DAO.ClasseDados.getInstance();
            DefaultTableModel tabela = (DefaultTableModel) this.telaBusca.getjTableDados().getModel();
            for (Cliente cliente : DAO.ClasseDados.listaCliente) {
                tabela.addRow(new Object[]{cliente.getId(),
                    cliente.getNome(), cliente.getCpf()});
            }
        }else if (e.getSource() == this.telaBusca.getjButtonFiltrar() && this.telaBusca.getTipoDados().equals("endereco")) {
            DAO.ClasseDados.getInstance();
            DefaultTableModel tabela = (DefaultTableModel) this.telaBusca.getjTableDados().getModel();
            for (Endereco endereco : DAO.ClasseDados.listaEndereco) {
                tabela.addRow(new Object[]{endereco.getId(),
                    endereco.getLogradouro(), endereco.getBairro().getDescricao(), endereco.getCidade().getDescricao()});
            }
        }else if (e.getSource() == this.telaBusca.getjButtonFiltrar() && this.telaBusca.getTipoDados().equals("fornecedor")) {
            DAO.ClasseDados.getInstance();
            DefaultTableModel tabela = (DefaultTableModel) this.telaBusca.getjTableDados().getModel();
            for (Fornecedor fornecedor : DAO.ClasseDados.listaFornecedor) {
                tabela.addRow(new Object[]{fornecedor.getId(),
                    fornecedor.getRazaoSocial(), fornecedor.getCnpj()});
            }
        }else if (e.getSource() == this.telaBusca.getjButtonFiltrar() && this.telaBusca.getTipoDados().equals("funcionario")) {
            DAO.ClasseDados.getInstance();
            DefaultTableModel tabela = (DefaultTableModel) this.telaBusca.getjTableDados().getModel();
            for (Funcionario funcionario : DAO.ClasseDados.listaFuncionario) {
                tabela.addRow(new Object[]{funcionario.getId(),
                    funcionario.getNome(), funcionario.getCpf()});
            }
        }else if (e.getSource() == this.telaBusca.getjButtonFiltrar() && this.telaBusca.getTipoDados().equals("produto")) {
            DAO.ClasseDados.getInstance();
            DefaultTableModel tabela = (DefaultTableModel) this.telaBusca.getjTableDados().getModel();
            for (Produto produto : DAO.ClasseDados.listaProduto) {
                tabela.addRow(new Object[]{produto.getId(),
                    produto.getDescricao(), produto.getCodigoBarra()});
            }
        } else if (e.getSource() == this.telaBusca.getjButtonSair()) {
            this.telaBusca.dispose();
        }
    }
}
