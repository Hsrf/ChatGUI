package P2P_GUI;

import javax.swing.*;
import java.awt.event.ActionListener;

public class GUI {

    private JTextField inputTextField;
    private JButton enviarButton;
    private JTextArea textArea1;
    private JPanel painel;

    public GUI() {
      JFrame janela = new JFrame();
      janela.setContentPane(painel);
      janela.setVisible(true);
      janela.pack();
      janela.setSize(640, 540);
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
