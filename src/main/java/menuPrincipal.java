import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class menuPrincipal extends JFrame {
    JFrame f = new JFrame("teste");

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
    }

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/main/resources/print_summary_by_group(9).csv");
        ArrayList<String[]> csv =  new ArrayList<>();
        Planilha Planilha = new Planilha();
        csv = Planilha.lerCSV();
        Planilha.escreverXLSX(csv);

        JFrame f = new menuPrincipal("teste");
        f.setVisible(true);
    }
}


