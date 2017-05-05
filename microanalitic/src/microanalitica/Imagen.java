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
public class Imagen {
    
//Declaro la matriz de pixels
    Pixel mipixel[][];

    public Imagen(int n, int m) {
        
        mipixel=new Pixel[n][m];
        
        for(int i=0;i<n;i++){
            for(int k=0;k<m;k++){
                
                mipixel[i][k]=new Pixel();
            }
        }
        
        
    }
    
    
    
    
    
}
