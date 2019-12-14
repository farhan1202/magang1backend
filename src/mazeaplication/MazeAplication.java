/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazeaplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Darknove
 */
public class MazeAplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            System.out.print("Masukkan Ukuran Maze : ");
            n = Integer.parseInt(br.readLine());
            maze(n);
        } catch (IOException ex) {
            Logger.getLogger(MazeAplication.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    private static void maze(int n) {
        int a=0;
            if (n < 0) {
                System.out.println("Input Harus Bilangan Positif");
            }else if(n % 2 == 0){
                System.out.println("Bilangan Harus Ganjil");
            }else{
                for (int i = 0; i < n; i++) {
                
                for (int j = 0; j < n; j++) {
                    if (i%2!=0 && i != 0) {
                        if (j==0 || j==n-1) {
                            System.out.print("@");
                        }else{
                            System.out.print(" ");
                        }
                    }else{
            
                        if (a % 2==0) {
                            if (j==1) {
                                System.out.print(" ");
                            }else{
                                System.out.print("@");
                            }
                        }else{
                            if (j == n-2) {
                                System.out.print(" ");
                            }else{
                                System.out.print("@");
                            }
                        }
                    }
                    
                }System.out.println("");
                if(i%2==0){
                    a++;
                }
                
            }
            }
    }
    
}
