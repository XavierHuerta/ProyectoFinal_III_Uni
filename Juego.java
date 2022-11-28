import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Juego extends JPanel{
    int level = 2;
    
    //Instanciamiento de los objetos
    Laberito laberinto= new Laberito();
    Personaje personaje= new Personaje();
    //private final static Logger LOGGER=Logger.getLogger(Juego.class.getName());
    
    public Juego(){
        addKeyListener(new KeyListener(){
            
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e, level);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
            
        });
        setFocusable(true);
    }
    
    //Metodo paint del la clase graphics para la construccion grafica de nuestros objetos dentro del metodo main
    @Override
    public void paint(Graphics grafico){
        laberinto.paint(grafico,level);
        personaje.paint(grafico);
    }
    
    //Metodo main
    public static void main(String [] args) throws InterruptedException{
        JFrame miventana=new JFrame("Proyecto Laberito");
        Juego game= new Juego();
        miventana.add(game);
        
        //Construccion de la ventana
        miventana.setSize(937, 560);
        //miventana.setLocation(300, 200);
        miventana.setLocationRelativeTo(null);
        miventana.setVisible(true);
        
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        while(true){
            try{
                Thread.sleep(10);//retraso del movimiento y el personaje
            } catch(InterruptedException ex){
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, game);//Excepciones que claramente se que hacen
            }
            miventana.repaint();//repintado para mover la pelota a su nueva posicion y borrar la anterior
        }
        
    }
}
