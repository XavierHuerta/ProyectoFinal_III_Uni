import java.awt.Color;
import java.awt.Graphics;

public class Laberito {
    
    private int fila=0;
    private int columna=0;
    private final int numeroFilas=13;
    private final int numeroColumnas=23;
    private final int altobloque=40;
    private final int anchobloque=40;
    
    public Laberito(){
        
    }
    
    //Construccion de la paredes, posibidad de pasarlo a una clase aparte
    public void paint (Graphics grafico, int level){
        int[][]laberito=obtieneLaberito(level);
        
        for(fila=0;fila<numeroFilas;fila++){//for que recorre las columnas
            for(columna=0;columna<numeroColumnas;columna++){//for que recorre las filas
                if (laberito[fila][columna]==1){//condicional que coloca paredes en la posicion asignada
                    grafico.setColor(Color.yellow);
                    grafico.fillRect(columna*40, fila*40, anchobloque, altobloque);
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchobloque, anchobloque);
                }
            }
        }
        
    }
    
    //Asignacion del laberito, los 1 son las parede y los 0 espacion vacios
    public int[][] obtieneLaberito(int level){
        int laberito[][]=new int[13][23];

        int [][] level1 =
        {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
         {1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
         {1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
         {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
         {1,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
         {1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
         {1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
         {1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
         {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
         {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
         {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
         {1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
        };


        if(level == 1){
            laberito = level1;
        }
        return laberito;
    }
}
