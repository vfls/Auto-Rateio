import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class menuPrincipal extends JFrame {
    JFrame f = new JFrame("Bosta");

    String v;
    private JTextField tx15;
    private JTextField tx19;
    private JTextField tx18;
    private JTextField tx16;
    private JTextField tx17;
    private JTextField tx14;
    private JTextField tx10;
    private JTextField tx13;
    private JTextField tx12;
    private JTextField tx11;
    private JButton executarButton;

    private JButton lerPlanilhaButton;
    private JPanel mainPanel;
    private JList mostrarArray;
    private JTextField textField1;
    public JButton getExecutarButton;

    public menuPrincipal(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        executarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


            }
        });

        lerPlanilhaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }
    public static void main(String[] args) throws FileNotFoundException {
        Planilha Planilha = new Planilha();
        Planilha.lerCSV();
        JFrame f = new menuPrincipal("merda");
        f.setVisible(true);

    }
}


