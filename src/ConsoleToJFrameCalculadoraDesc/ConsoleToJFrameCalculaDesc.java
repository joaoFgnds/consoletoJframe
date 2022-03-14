/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
//Calculadora de desconto 
//
//jtextfield com o valor 
//comboBox com as opções de desconto 
//btn para calcular
//msgdialog para exibir o resultado 



package ConsoleToJFrameCalculadoraDesc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author faria
 */
public class ConsoleToJFrameCalculaDesc implements ActionListener {
    
    JFrame janela = new JFrame ();
    JPanel painel = new JPanel();
    JLabel jlValor = new JLabel("Digite o valor do produto:  ");
    JTextField  txtResultado = new JTextField(8);
    JComboBox cbDescontos = new JComboBox();
    JCheckBox chkdez = new JCheckBox("");
    JButton btnCalcular = new JButton("     Calcular     ");
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ConsoleToJFrameCalculaDesc();
  
    }

    
    private ConsoleToJFrameCalculaDesc(){   
        janela.setTitle("Janela principal"); // TITULO DA JANELA 
        janela.setSize(350, 150); // TAMANHO DA JANELA 
        janela.setLocation(50,50); // LOCALIZAÇÃO 
        //DEFINE A EXIBIÇÃO DO BOTÃO FECHAR 
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        //add label ao painel
        painel.add(jlValor);
        //add jtextFiel ao painel
        painel.add(txtResultado);
        //add comboBox ao painel
        painel.add(cbDescontos);
        //add botão ao painel
        painel.add(btnCalcular);
        //add o PAINEL na JANELA
        janela.add(painel);
        //define que o JFrame vai ser carregado
        janela.setVisible(true);
        
        btnCalcular.addActionListener(this);
        
      

        cbDescontos.addItem("Selecione Desc");
        cbDescontos.addItem("10%");
        cbDescontos.addItem("15%");
        cbDescontos.addItem("20%");
        cbDescontos.addItem("30%");
        cbDescontos.addItem("40%");
        cbDescontos.addItem("50%");
        cbDescontos.addItem("60%");
        cbDescontos.addItem("70%");
        cbDescontos.addItem("80%");
        cbDescontos.addItem("90%");
    

    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){//-----------INICIO----------------- 
        
        double valor,resultado;
        valor = Double.parseDouble(txtResultado.getText());
        if (e.getSource() == btnCalcular && cbDescontos.getSelectedItem().equals("10%")) {//Inicio
            resultado = valor * 0.9;
            JOptionPane.showMessageDialog(null,resultado);      
        }//fim do calculo 10%
        
        if(e.getSource() == btnCalcular && cbDescontos.getSelectedItem().equals("15%")){//inicio
             resultado = valor * 0.85;
            JOptionPane.showMessageDialog(null,resultado);
        } //fim od calculo 15%
        
        if (e.getSource() == btnCalcular && cbDescontos.getSelectedItem().equals("20%")) {//inicio
             resultado = valor * 0.8;
            JOptionPane.showMessageDialog(null,resultado);
        } // fim do calculo 20%
        
        if (e.getSource() == btnCalcular && cbDescontos.getSelectedItem().equals("30%")) {//inicio
             resultado = valor * 0.7;
            JOptionPane.showMessageDialog(null,resultado);
        } // fim do calculo 30%
        
        if (e.getSource() == btnCalcular && cbDescontos.getSelectedItem().equals("40%")) {//inicio
             resultado = valor * 0.6;
            JOptionPane.showMessageDialog(null,resultado);
        }//fim do calculo 40%
        
        if (e.getSource() == btnCalcular && cbDescontos.getSelectedItem().equals("50%")) {//inicio
             resultado = valor * 0.5;
            JOptionPane.showMessageDialog(null,resultado);
        }//fim do calculo 50%
        
        if (e.getSource() == btnCalcular && cbDescontos.getSelectedItem().equals("60%")) {//inicio
             resultado = valor * 0.4;
            JOptionPane.showMessageDialog(null,resultado);
        } //fim do calculo 60%
        
        if (e.getSource() == btnCalcular && cbDescontos.getSelectedItem().equals("70%")) {//inicio
             resultado = valor * 0.3;
            JOptionPane.showMessageDialog(null,resultado);
        } //fim / calculo 70%
        
        if (e.getSource() == btnCalcular && cbDescontos.getSelectedItem().equals("Selecione Desc")){//Inicio
             JOptionPane.showMessageDialog(null,
                     " Você Precisa Selecionar um desconto ou colocar o valor do produto " ,
                     "Erro",JOptionPane.ERROR_MESSAGE);  
        }//Fim if/erro se nao selecionar nenhum desconto       
    } //------------------------------FIM  
}
 
        
        
        
        
        

    


