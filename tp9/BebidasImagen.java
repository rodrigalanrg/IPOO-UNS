package tp9;
// importar la clases usadas
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.border.*;

public class BebidasImagen extends JFrame {
    
    //Atributos de objetos graficos
    private JPanel panelSuperior, panelInferior;
    private JLabel etiquetaImagen;
    private JButton botonJugo, botonCafe;
    private int cantJugo, cantCafe;

    // Constructor
    public BebidasImagen(){
        super("Jugo y Cafe");

        // Inicializar atributos 
        cantCafe = 0;
        cantJugo = 0;
    
        // establecer valores del jframe
        setLayout(new GridLayout(2,1));
        setSize(1920,1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        // Armar los paneles
        armarPanelSuperior();
        armarPanelInferior();

        getContentPane().add(panelSuperior);
        getContentPane().add(panelInferior);

    }

    // Serivicios privados del constructor
   
    public void armarPanelSuperior(){
        panelSuperior = new JPanel();
        etiquetaImagen = new JLabel();
        panelSuperior.add(etiquetaImagen);

    }

    public void armarPanelInferior(){
        panelInferior = new JPanel();
        
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


    // Clases internas

    private class OyenteBotonC implements ActionListener{
        public void actionPerformed(ActionEvent e){
            cantCafe++;
            etiquetaImagen.setText("Cafe " +cantCafe);
            etiquetaImagen.setIcon(new ImageIcon("Cafe.gif"));
            
            // CENTRA TODA LA ETIQUETA DENTRO ESPACIO
            etiquetaImagen.setHorizontalAlignment(JLabel.CENTER);

            // CENTRA TEXTO HORIZONTALMENTE RESPECTO A LA IMAGEN
            etiquetaImagen.setHorizontalTextPosition(JLabel.CENTER);

            // MANTIENE TEXTO ABAJO DE LA IMAGEN
            etiquetaImagen.setVerticalTextPosition(JLabel.TOP);
        }
    }

    private class OyenteBotonJ implements ActionListener {
        public void actionPerformed(ActionEvent e){
            cantJugo++;
            etiquetaImagen.setText("Jugo " +cantJugo);
            etiquetaImagen.setIcon(new ImageIcon("Jugo.gif"));

            // CENTRA TODA LA ETIQUETA DENTRO ESPACIO
            etiquetaImagen.setHorizontalAlignment(JLabel.CENTER);

            // CENTRA TEXTO HORIZONTALMENTE RESPECTO A LA IMAGEN
            etiquetaImagen.setHorizontalTextPosition(JLabel.CENTER);

            // MANTIENE TEXTO ABAJO DE LA IMAGEN
            etiquetaImagen.setVerticalTextPosition(JLabel.TOP);
        }
    }

    




}
