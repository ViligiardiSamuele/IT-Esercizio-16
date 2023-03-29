package esercizio.pkg16;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form extends JFrame{
    private JTextField JTFcognome, JTFnome, JTFtelefono, JTFcittaPartenza, JTFcittaDestinazione, JTFdata;
    private JLabel JLcognome, JLnome, JLtelefono, JLcittaPartenza, JLcittaDestinazione, JLdata, JLinfo;
    private JButton JBconferma, JBannulla;
    public static ArrayList<Persona> persone = new ArrayList<>();
    public Form(String title) throws HeadlessException {
        super(title);
        //init component
        this.JTFcognome = new JTextField();
        this.JTFnome = new JTextField();
        this.JTFtelefono = new JTextField();
        this.JTFcittaPartenza = new JTextField();
        this.JTFcittaDestinazione = new JTextField();
        this.JTFdata = new JTextField();
        this.JLcognome = new JLabel("Cognome:");
        this.JLnome = new JLabel("Nome:");
        this.JLtelefono = new JLabel("Telefono:");
        this.JLcittaPartenza = new JLabel("Citta Partenza:");
        this.JLcittaDestinazione = new JLabel("Citta Destinazione");
        this.JLdata = new JLabel("Data: ");
        this.JBconferma = new JButton("Stampa");
        this.JBannulla = new JButton("Annulla");
        this.JLinfo = new JLabel("");
        
        //window sections with relative layout
        setLayout(new BorderLayout());
        JPanel body = new JPanel(new GridLayout(6,1));
        JPanel buttons = new JPanel(new GridLayout(2,2));
        
        //body
        body.add(JLcognome);
        body.add(JTFcognome);
        body.add(JLnome);
        body.add(JTFnome);
        body.add(JLtelefono);
        body.add(JTFtelefono);
        body.add(JLcittaPartenza);
        body.add(JTFcittaPartenza);
        body.add(JLcittaDestinazione);
        body.add(JTFcittaDestinazione);
        body.add(JLdata);
        body.add(JTFdata);
        
        
        //buttons bottom
        buttons.add(JBconferma);
        buttons.add(JBannulla);
        
        this.getContentPane().add(JLinfo, BorderLayout.NORTH);
        this.getContentPane().add(body, BorderLayout.CENTER);
        this.getContentPane().add(buttons, BorderLayout.SOUTH);
        
        //action listener for buttons
        JBconferma.addActionListener((ActionEvent e) -> {
            JLinfo.setText("");
            persone.add(new Persona(
                    JTFnome.getText(),
                    JTFcognome.getText(),
                    JTFtelefono.getText(),
                    JTFcittaPartenza.getText(),
                    JTFcittaDestinazione.getText(),
                    JTFdata.getText()
            ));
            System.out.println(persone.get(persone.size()-1));
        });
        JBannulla.addActionListener((ActionEvent e) -> {
            this.JLinfo.setText("Caselle svuotate");
            JTFnome.setText("");
            JTFcognome.setText("");
            JTFtelefono.setText("");
            JTFcittaPartenza.setText("");
            JTFcittaDestinazione.setText("");
            JTFdata.setText("");
        });
        
        //window settings
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        body.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        buttons.setBorder(BorderFactory.createEmptyBorder(5,10,10,10));
        setSize(300,300);
        setResizable(false);
        setVisible(true);
    }
    
}