/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpertama;

/**
 *
 * @author Asus
 */
public class Factorial {
    public static void main(String[] args) {
        int hasil = rekursif(4);
        System.out.println(hasil);
    }
    
    public static Integer rekursif(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * rekursif(n-1);
        }
    }  
}
