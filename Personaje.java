import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Personaje {
    
    Laberito lab=new Laberito();
    private int x=40;
    private int y=40;
    private final int ancho=40;
    private final int alto=40;
    private final int movimiento=40;
    JLabel player;
    
    public Personaje(){
        player = new JLabel();
    }
            
    //Construccion grafico del personaje
    public void paint(Graphics grafico){
        /*grafico.setColor(Color.BLUE);
        grafico.fillOval(x,y,ancho,alto);
        grafico.setColor(Color.BLACK);
        grafico.drawOval(x, y, alto, ancho);*/
        
        

        
    }
    
    //Asignacion de los movimientos del personaje
    //Idea, dar la posibilidad al usuario de cambiar las teclas por las que el desee
    public void teclaPresionada(KeyEvent evento, int level){//37,38,39,40 son el valor de teclado de la flechas
        int [][]laberito=lab.obtieneLaberito(level);
        if(evento.getKeyCode()==37){//flecha izquierda
            if(laberito[y/40][(x/40)-1]!=1){
                x=x-movimiento;
            }
        }
        
        if(evento.getKeyCode()==39){//flecha derecha
            if(laberito[y/40][(x/40)+1]!=1){
                x=x+movimiento;
            }
        }
        
        if(evento.getKeyCode()==40){//flecha abajo
            if(laberito[(y/40)+1][x/40]!=1){
                y=y+movimiento;
            }
        }
        
        if(evento.getKeyCode()==38){//flecha arriba
            if(laberito[(y/40)-1][x/40]!=1){
                y=y-movimiento;
            }
        }
        
    }
}
