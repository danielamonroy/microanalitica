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
public class Pixel {
    
    int rojo;
    int verde;
    int azul;

    public int getRojo() {
        return rojo;
    }

    public void setRojo(int rojo) {
        this.rojo = rojo;
    }

    public int getVerde() {
        return verde;
    }

    public void setVerde(int verde) {
        this.verde = verde;
    }

    public int getAzul() {
        return azul;
    }

    public void setAzul(int azul) {
        this.azul = azul;
    }

   public void setTodos(int rojo, int verde, int azul){
        this.rojo = rojo;
         this.azul = azul;
          this.verde = verde;
   }
    
}
