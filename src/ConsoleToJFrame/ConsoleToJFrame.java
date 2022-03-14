/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleToJFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame; //Import do JFrame
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import view.IMC;
import view.JFramePesquisa;
import view.jfCalcDiasVida;




//import javax.swing.*; // O * serve para importar tudo que esta dentro do swing

/**
 *
 * @author jairb
 */
public class ConsoleToJFrame implements ActionListener {

    JFrame janela = new JFrame();
    //criando Painel/Container para add os objetos
    JPanel painel = new JPanel();
    JLabel jlNome = new JLabel("Seu nome: ");
    //Vamos criar um input/JTField
    JTextField jtfsNome = new JTextField(5);
    JButton btnOk = new JButton("OK");
    JButton btnIMC = new JButton("Calc. IMC");
    JButton btnPesq = new JButton ("Form,  Pesq"); 
    JButton btnDVida = new JButton("Calc. Dias Vida");
    JComboBox cbLinguagens = new JComboBox();
    JCheckBox chkJava = new JCheckBox("Java");
    JCheckBox chkPHP = new JCheckBox("PHP");
    JCheckBox chkPy = new JCheckBox("Python");
    JCheckBox chkCobol = new JCheckBox("Cobol");
    JButton btnChk = new JButton("checks' s?");
    JLabel jlCheckBox = new JLabel("Qual Linguagem já programou?");
    JLabel jlRadioButton = new JLabel("Desconto");
    JRadioButton jrb10 = new JRadioButton("10%");
    JRadioButton jrb20 = new JRadioButton("20%");
    JRadioButton jrb30 = new JRadioButton("30%");
    JButton btnRadioButton = new JButton(" Exibe Desc. ");

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ConsoleToJFrame();
    }
    
    

    private ConsoleToJFrame() {
        janela.setTitle("Janela Principal");
        janela.setSize(750, 180); //450 , 250
        janela.setLocation(50, 50);
        //Define a exibição do botão fechar
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        //add label ao painel
        painel.add(jlNome);
        //add jtextField ao painel
        painel.add(jtfsNome);
        //add ComboBox ao painel
        painel.add(cbLinguagens);
        //add botão ao painel
        painel.add(btnOk);
        //add botão IMC ao painel
        painel.add(btnIMC);
        //add botão jfCalcVida ao painel
        painel.add(btnDVida);
        //add Label do check
        painel.add(jlCheckBox);
        //add checks ao painel
        painel.add(chkJava);
        painel.add(chkCobol);
        painel.add(chkPHP);
        painel.add(chkPy);
        //add btnChecks ao painel
        painel.add(btnChk);
        //add botao ao painel para abrir o form para pesquisa 
        painel.add(btnPesq);
        //add o Painel na janela
        janela.add(painel);
        //defini que o jFrame vai ser carregado
        janela.setVisible(true);
        //Registrando o botão no Listener
        btnOk.addActionListener(this);
        btnIMC.addActionListener(this);
        btnDVida.addActionListener(this);
        btnChk.addActionListener(this);
        btnPesq.addActionListener(this);

        
        //Add itens no combo
        cbLinguagens.addItem("Selecione...");
        cbLinguagens.addItem("Java");
        cbLinguagens.addItem("PHP");
        cbLinguagens.addItem("C#");
        cbLinguagens.addItem("C++");
        cbLinguagens.addItem("Ruby");
        cbLinguagens.addItem("Python");
        cbLinguagens.addItem("Pascal");
        cbLinguagens.addItem("Cobol");
        cbLinguagens.addItem("Fortran");
        cbLinguagens.addItem("Java Script");
        cbLinguagens.addItem("Delphi");
        cbLinguagens.addItem("Kotlin");
        cbLinguagens.addItem("Go");
    }
    
    
    

    @Override  //Implementação para verificar Linguagem selecionada 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            if (!jtfsNome.getText().isBlank()) {

                JOptionPane.showMessageDialog(null, " Você digitou: "
                        + jtfsNome.getText());
            } else if (cbLinguagens.getSelectedItem().equals(" Selecione... ")) {
                JOptionPane.showMessageDialog(null, " Linguagem de Programação "
                        + "selecionada foi : " + cbLinguagens.getSelectedItem());
            } else {
                JOptionPane.showMessageDialog(null, " Digitar nome ou Selecionar " + " linguagem !");
            }

        }

        if (e.getSource() == btnIMC) {
            IMC jfIMC = new IMC();  // cria o objeto JFrame
            jfIMC.setVisible(true); // voce esta setando este JFrame, esta visivel
            jfIMC.jtfSNome.setText(jtfsNome.getText());
            jfIMC.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if (e.getSource() == btnDVida) {
            jfCalcDiasVida jfCalcVida = new jfCalcDiasVida(); // cria o objeto JFrame
            jfCalcVida.setVisible(true); // voce esta setando este JFrame, esta visivel
            jfCalcVida.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// aqui eu estou ocultadndo a funçao de close para nao fechar o projeto inteiro 
        }
        

        if (e.getSource() == btnChk) {
            verChk(); //metodo para exibir o result na tela 
            limparChk(); // metodo para limpar tela 
        }
        
        
        if (e.getSource() == btnPesq) {
            JFramePesquisa janelaPesq = new JFramePesquisa(); // cria o objeto Jframe
            janelaPesq.setVisible(true); // agota voce esta setando este jframe, agora ele esta visivel
            janelaPesq.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //aqui eu estou ocultando a funçao de close 
        }
        
        
        
    }

    private void verChk() {
        String msg = "Linguagens: \n";
        int countChk = 0;
        if (chkCobol.isSelected()) {
            msg = msg + chkCobol.getText() + "\n";
            countChk++;
        }
        if (chkJava.isSelected()) {
            msg = msg + chkJava.getText() + "\n";
            countChk++;
        }
        if (chkJava.isSelected()) {
            msg = msg + chkPHP.getText() + "\n";
            countChk++;
        }
        if (chkJava.isSelected()) {
            msg = msg + chkPy.getText() + "\n";
            countChk++;
        }
        if (countChk > 0) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            JOptionPane.showMessageDialog(null,
                    " Nenhuma Linguagem Selecionada! ",
                    " Linguanes: ", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparChk() {
        chkCobol.setSelected(false);
        chkJava.setSelected(false);
        chkPHP.setSelected(false);
        chkPy.setSelected(false);
        
    }
}
