package controller.cadastros;

import DAO.ClasseDados;
import static controller.cadastros.ControllerCadastroCliente.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Cliente;
import model.bo.Endereco;
import utilities.Utilities;
import view.Busca;
import view.CadastroEndereco;

public class ControllerCadastroEndereco implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroEndereco telaCadastroEndereco;
    public static Integer codigo;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroEndereco(CadastroEndereco telaCadastroEndereco) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroEndereco = telaCadastroEndereco;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        inicializeActionListener();

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getPanelButtons());
        Utilities.limpaComponentes(false, this.telaCadastroEndereco.getPanelCadastro());

        addCidadesEBairros(telaCadastroEndereco.getComboCidade(), telaCadastroEndereco.getComboBairro());
    }

    private void addCidadesEBairros(JComboBox<String> comboBox, JComboBox<String> comboBox2) {
        ClasseDados.getInstance();
        for (Cidade item : ClasseDados.listaCidade) {
            comboBox.addItem(item.getDescricao());
        }

        for (Bairro item : ClasseDados.listaBairro) {
            comboBox2.addItem(item.getDescricao());
        }
    }

    private void inicializeActionListener() {
        this.telaCadastroEndereco.getBtnNovo().addActionListener(this);
        this.telaCadastroEndereco.getBtnSair().addActionListener(this);
        this.telaCadastroEndereco.getBtnCancelar().addActionListener(this);
        this.telaCadastroEndereco.getBtnGravar().addActionListener(this);
        this.telaCadastroEndereco.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroEndereco.getBtnNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroEndereco.getPanelButtons());
            Utilities.limpaComponentes(true, this.telaCadastroEndereco.getPanelCadastro());
            this.telaCadastroEndereco.getTxtId().setEnabled(false);
        } else if (e.getSource() == this.telaCadastroEndereco.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroEndereco.getBtnGravar()) {
            Endereco endereco = new Endereco();
            ClasseDados.getInstance();
            endereco.setCep(this.telaCadastroEndereco.getTxtCEP().getText());
            endereco.setLogradouro(this.telaCadastroEndereco.getTxtLogradouro().getText());

            String bairroDescricao = (String) this.telaCadastroEndereco.getComboBairro().getSelectedItem();
            Bairro bairro = ClasseDados.listaBairro.stream()
                    .filter(b -> b.getDescricao().equals(bairroDescricao))
                    .findFirst()
                    .orElse(null);
            endereco.setBairro(bairro);

            String cidadeDescricao = (String) this.telaCadastroEndereco.getComboCidade().getSelectedItem();
            Cidade cidade = ClasseDados.listaCidade.stream()
                    .filter(c -> c.getDescricao().equals(cidadeDescricao))
                    .findFirst()
                    .orElse(null);
            endereco.setCidade(cidade);

            if (this.telaCadastroEndereco.getTxtId().getText().equalsIgnoreCase("")) {
                endereco.setId(ClasseDados.listaEndereco.size() + 1);
                ClasseDados.listaEndereco.add(endereco);
            } else {
                endereco.setId(Integer.parseInt(telaCadastroEndereco.getTxtId().getText()));
                ClasseDados.listaEndereco.remove(endereco.getId() - 1);
                ClasseDados.listaEndereco.add(endereco.getId() - 1, endereco);
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroEndereco.getBtnBuscar()) {
            Busca telaBuscaBairro = new Busca(null, true, "endereco");
            telaBuscaBairro.setVisible(true);
            if (codigo != 0) {
                Endereco endereco = new Endereco();
                endereco = DAO.ClasseDados.listaEndereco.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroEndereco.getPanelButtons());
                Utilities.limpaComponentes(true, this.telaCadastroEndereco.getPanelCadastro());

                this.telaCadastroEndereco.getTxtId().setText(endereco.getId() + "");
                this.telaCadastroEndereco.getTxtCEP().setText(endereco.getCep());
                this.telaCadastroEndereco.getTxtLogradouro().setText(endereco.getLogradouro());
                this.telaCadastroEndereco.getComboBairro().setSelectedItem(endereco.getBairro().getDescricao());
                this.telaCadastroEndereco.getComboCidade().setSelectedItem(endereco.getCidade().getDescricao());

                this.telaCadastroEndereco.getTxtId().setEnabled(false);

            }
        } else if (e.getSource() == this.telaCadastroEndereco.getBtnSair()) {
            this.telaCadastroEndereco.dispose();

        }

    }
}
