/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microanalitica;

/**
 *
 * @author Estudiantes
 */
public class Microanalitica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Imagen miImagen=new Imagen(5,5);
        
        miImagen.mipixel[0][0].setTodos(0, 0, 0);
        miImagen.mipixel[0][1].setTodos(255, 0, 0);
        miImagen.mipixel[0][2].setTodos(255, 0, 0);
        miImagen.mipixel[0][3].setTodos(255, 0, 0);
        miImagen.mipixel[0][4].setTodos(255, 0, 0);
        miImagen.mipixel[1][0].setTodos(255, 0, 0);
        miImagen.mipixel[1][1].setTodos(0, 0, 0);
        miImagen.mipixel[1][2].setTodos(0, 0, 255);
        miImagen.mipixel[1][3].setTodos(25, 0, 1);
        miImagen.mipixel[1][4].setTodos(25, 0, 250);
        miImagen.mipixel[2][0].setTodos(8, 16, 32);
        miImagen.mipixel[2][1].setTodos(8, 24, 6);
        miImagen.mipixel[2][2].setTodos(0, 0, 0);
        miImagen.mipixel[2][3].setTodos(18,18, 0);
        miImagen.mipixel[2][4].setTodos(15, 24, 18);
        miImagen.mipixel[3][0].setTodos(9, 18, 32);
        miImagen.mipixel[3][1].setTodos(16, 32, 0);
        miImagen.mipixel[3][2].setTodos(10, 10, 10);
        miImagen.mipixel[3][3].setTodos(0, 0, 0);
        miImagen.mipixel[3][4].setTodos(32, 32, 0);
        miImagen.mipixel[4][0].setTodos(223, 8, 1);
        miImagen.mipixel[4][1].setTodos(214, 6, 3);
        miImagen.mipixel[4][2].setTodos(210, 9, 9);
        miImagen.mipixel[4][3].setTodos(210, 18, 32);
        miImagen.mipixel[4][4].setTodos(255, 0, 0);
        
        
        
    }
    
}
