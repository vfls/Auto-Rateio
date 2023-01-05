import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
    private JLabel tela;
    private JPanel mainPanel;
    public JButton getExecutarButton;

    public menuPrincipal(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        executarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double v10 = (double) ((Double.parseDouble(tx10.getText())));
                Double v11 = (double) ((Double.parseDouble(tx11.getText())));
                Double v12 = (double) ((Double.parseDouble(tx12.getText())));
                Double v13 = (double) ((Double.parseDouble(tx13.getText())));
                Double v14 = (double) ((Double.parseDouble(tx14.getText())));
                Double v15 = (double) ((Double.parseDouble(tx15.getText())));
                Double v16 = (double) ((Double.parseDouble(tx16.getText())));
                Double v17 = (double) ((Double.parseDouble(tx17.getText())));
                Double v18 = (double) ((Double.parseDouble(tx18.getText())));
                Double v19 = (double) ((Double.parseDouble(tx19.getText())));
                lerPlanilha lerPlanilha = new lerPlanilha(v10, v11, v12, v13, v14, v15, v16, v17, v18, v19);
            }
        });

    }

    public static void main(String[] args) {
        JFrame f = new menuPrincipal("merda");
        f.setVisible(true);
    }
}
