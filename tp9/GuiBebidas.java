package tp9;

// Importar clases
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.border.*;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;


public class GuiBebidas extends JFrame {

    // Atributos
    private int cantCafe, cantJugo;
    private JPanel panelSuperior, panelInferior, panelCentral;
    private JButton botonCafe, botonJugo;
    private JLabel etiqueta, etiquetaCentral;

    // Constructor
    public GuiBebidas(){
        
        // Super clase padre
        super("Expendedor de Bebidas");

        // Inicializar atributos 
        cantCafe = 0;
        cantJugo = 0;

        // establecervalores del JFRAME
        setLayout(new GridLayout(3,1));
        setSize(getPreferredSize());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Armar los paneles 
        armarPanelSuperior();
        armarPanelCentral();
        armarPanelInferior();

        
        // Insertar los paneles en el FRAME
        getContentPane().add(panelSuperior);
        getContentPane().add(panelCentral);
        getContentPane().add(panelInferior);
    }

    // Servicios privados del constructor

    public void armarPanelSuperior(){
        
        panelSuperior = new JPanel();
        panelSuperior.setBackground(Color.GRAY);
        
        etiqueta = new JLabel();
        panelSuperior.add(etiqueta);
    }

    public void armarPanelCentral(){
        
        panelCentral = new JPanel();
        
        etiquetaCentral = new JLabel();
        panelCentral.add(etiquetaCentral);

    
    }

    public void armarPanelInferior(){
        
        panelInferior = new JPanel();
        panelInferior.setBackground(Color.GRAY);

        botonCafe = new JButton("Cafe");
        botonCafe.setBackground(Color.BLUE);

        botonJugo = new JButton("Jugo");
        botonJugo.setBackground(Color.BLUE);

        OyenteBotonC oyenteCafe = new OyenteBotonC();
        botonCafe.addActionListener(oyenteCafe); 
        
        OyenteBotonJ oyenteJugo = new OyenteBotonJ();
        botonJugo.addActionListener(oyenteJugo);
        
        panelInferior.add(botonCafe);
        panelInferior.add(botonJugo);
    }


    // Clases Internas

    private class OyenteBotonC implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            cantCafe++;

            etiquetaCentral.setText("Cafe " +cantCafe);
            
            // CENTRA TODA LA ETIQUETA DENTRO ESPACIO
            etiqueta.setHorizontalAlignment(JLabel.CENTER);

            // CENTRA TEXTO HORIZONTALMENTE RESPECTO A LA IMAGEN
            etiqueta.setHorizontalTextPosition(JLabel.CENTER);

            // MANTIENE TEXTO ABAJO DE LA IMAGEN
            etiqueta.setVerticalTextPosition(JLabel.TOP);

            etiqueta.setText("Cafe");
            etiqueta.setIcon(new ImageIcon("Cafe.gif"));
            
            // CENTRA TODA LA ETIQUETA DENTRO ESPACIO
            etiqueta.setHorizontalAlignment(JLabel.CENTER);

            // CENTRA TEXTO HORIZONTALMENTE RESPECTO A LA IMAGEN
            etiqueta.setHorizontalTextPosition(JLabel.CENTER);

            // MANTIENE TEXTO ABAJO DE LA IMAGEN
            etiqueta.setVerticalTextPosition(JLabel.TOP);
        }
    }

    private class OyenteBotonJ implements ActionListener {
        public void actionPerformed(ActionEvent e){
            
            cantJugo++;

            etiquetaCentral.setText("Jugo " +cantJugo);

            // CENTRA TODA LA ETIQUETA DENTRO ESPACIO
            etiqueta.setHorizontalAlignment(JLabel.CENTER);

            // CENTRA TEXTO HORIZONTALMENTE RESPECTO A LA IMAGEN
            etiqueta.setHorizontalTextPosition(JLabel.CENTER);

            // MANTIENE TEXTO ABAJO DE LA IMAGEN
            etiqueta.setVerticalTextPosition(JLabel.TOP);l
            
            etiqueta.setText("Jugo");
            etiqueta.setIcon(new ImageIcon("Jugo.gif"));

            // CENTRA TODA LA ETIQUETA DENTRO ESPACIO
            etiqueta.setHorizontalAlignment(JLabel.CENTER);

            // CENTRA TEXTO HORIZONTALMENTE RESPECTO A LA IMAGEN
            etiqueta.setHorizontalTextPosition(JLabel.CENTER);

            // MANTIENE TEXTO ABAJO DE LA IMAGEN
            etiqueta.setVerticalTextPosition(JLabel.TOP);
        }
    }
}
