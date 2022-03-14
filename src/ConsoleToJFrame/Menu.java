/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleToJFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import view.IMC;
import view.JFramePesquisa;
import view.jfCalcDiasVida;

/**
 *
 * @author faria
 */
public class Menu extends JFrame implements ActionListener {//METODO

    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, menuC, subMenu;
        JMenuItem menuItem;

        //Cria o menuBar 
        menuBar = new JMenuBar();

        //Construir MenuBar || cria menu formularios 
        menu = new JMenu("Formulários");
        //cria um atalho na letra F ||  Marca A letra para ser usado junto com a tecla alt + F
        menu.setMnemonic(KeyEvent.VK_F);
        //add o menu Formulario a barra de menus "menuBar"
        menuBar.add(menu);

        //Criar os intens  do menu Formulário 
        //Item calc.IMC
        menuItem = new JMenuItem("Calc. IMC", KeyEvent.VK_C);
        menuItem.setActionCommand("IMC");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Item Dias de Vidas
        menuItem = new JMenuItem("Dias de Vida", KeyEvent.VK_E);
        menuItem.setActionCommand("DiasVida");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Item Pesquisa
        menuItem = new JMenuItem("Pesquisa", KeyEvent.VK_P);
        menuItem.setActionCommand("Pesquisa");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //testes com outros menus
        menuC = new JMenu("Cadastros");
        menuC.setMnemonic(KeyEvent.VK_C);
        menuBar.add(menuC);

        subMenu = new JMenu("Clientes");
        subMenu.setMnemonic(KeyEvent.VK_C);
        menuC.add(subMenu);

        menuItem = new JMenuItem("Cadastro", KeyEvent.VK_C);
        menuItem.setActionCommand("cadClientes");
        menuItem.addActionListener(this);
        subMenu.add(menuItem);

        menuItem = new JMenuItem("Lista", KeyEvent.VK_C);
        menuItem.setActionCommand("ListaClientes");
        menuItem.addActionListener(this);
        subMenu.add(menuItem);

        menuItem = new JMenuItem("Gerenciar ", KeyEvent.VK_G);
        menuItem.setActionCommand("gerenciar");
        menuItem.addActionListener(this);
        menuC.add(menuItem);

        return menuBar;
    }

    public Container createContentPane() {
        //Cria painel para o jFrame
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);

        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;

    }

    private static void createAndShowGUI() {
        JFrame janela = new JFrame("Menu Principal");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Menu menu = new Menu();

        janela.setJMenuBar(menu.createMenuBar());
        janela.setContentPane(menu.createContentPane());

        janela.setSize(450, 260);
        janela.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        createAndShowGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Ação da barra de menus 
        if ("IMC".equals(e.getActionCommand())) {
            IMC jfIMC = new IMC();
            jfIMC.setVisible(true);
            jfIMC.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }

        if ("DiasVida".equals(e.getActionCommand())) {
            jfCalcDiasVida jfCalcVida = new jfCalcDiasVida();
            jfCalcVida.setVisible(true);
            jfCalcVida.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }

        if ("Pesquisa".equals(e.getActionCommand())) {
            JFramePesquisa janelaPesq = new JFramePesquisa();
            janelaPesq.setVisible(true);
            janelaPesq.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }

        if ("cadClientes".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(this, "Cadastro de Clientes!!!");

        }
        if ("ListaClientes".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(this, "Cadastro de Clientes!!!");

        }
        if ("gerenciar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(this, "teste de gerenciar");
        }
    }
}
