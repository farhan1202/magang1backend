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

/**
 *
 * @author Darknove
 */
public class Maze2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            int n;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukkan Ukuran Maze : ");
            n = Integer.parseInt(br.readLine());
            maze(n);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Maze2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void maze(int n) {
        int a = 0;
            if (n < 0) {
                System.out.println("Input Harus Bilangan Positif");
            }else if(n % 2 == 0){
                System.out.println("Bilangan Harus Ganjil");
            }else{
                for (int i = 0; i < n/2+1; i++) {
                for (int j = 0; j < n; j++) {
                    if (i%2!=0) {
                        if (j%2!=0) {
                            System.out.print(" ");
                        }else if(j>(i+2) && j<=(n-(i+1))){
                            System.out.print(" ");
                        }else{
                            System.out.print("@");
                        }
                    }else{
                        if(j%2!=0 && j < 1+(i+2)||j%2!=0 && j>=n-i){
                            System.out.print(" ");
                        }else{
                            System.out.print("@");
                        }
                    }
                }
                
                System.out.println("");
                
            }
            
            for (int i = n/2; i > 0; i--) {
                for (int j = n; j > 0; j--) {
                    if (i%2!=0) {
                        if (j%2==0 && j<=1+i || j%2==0 && j>n-i) {
                            System.out.print(" ");
                        }else{
                            System.out.print("@");
                        }
                    }else{
                        if (j%2==0) {
                            System.out.print(" ");
                        }else if(j>(i+2) && j<=(n-i)){
                            System.out.print(" ");
                        }else{
                            System.out.print("@");
                        }
                    }
                }System.out.println("");
            }
            }
    }
    
}
