package ProyectoGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIPincel extends JFrame{
    
    //Atributos de la aplicación
    private MatrizColor matriz;
    private ColorRGB nuevoColor;
    
    //Objetos Gráficos
    //BOTONES
    private JButton boton;   
    private JButton [][] botonMatriz;
    private JCheckBox  consultar;
    
    //ETIQUETAS
    private JLabel etiquetaRojo;
    private JLabel etiquetaVerde;
    private JLabel etiquetaAzul; 
    
    //CAMPOS DE TEXTO
    private JTextField rojo;
    private JTextField verde;
    private JTextField azul;
    
    //PANELES
    private JPanel panelMenu;
    private JPanel panelMatriz;   
    private JPanel panelContainerControlColor;
    private JPanel panelContainerBoton;
    private JPanel panelColores;
    private JPanel panelControlColor;
    
    public GUIPincel(MatrizColor c){
        super("Pincel de IPOO");
        
        matriz=c;
        nuevoColor= new ColorRGB(0,0,0);

        setSize(700, 600);
        
        getContentPane().setLayout(new BorderLayout()); 
        
        inicializarPanelMenu();
        inicializarPanelMatriz();

        //Agrego cada panel al panel de contenido
        getContentPane().add(panelMatriz, BorderLayout.NORTH);
        getContentPane().add(panelMenu, BorderLayout.SOUTH);
        
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    private void inicializarPanelMatriz(){

    }
    
    private void inicializarPanelMenu(){

    }
    
    
    private class OyenteMatriz implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }
    
    private class OyenteBotonPincel implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }
    
    private class OyenteBotonCheckBox implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }
    } 
}
