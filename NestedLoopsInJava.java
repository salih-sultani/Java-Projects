/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nested.loops.injava;

/**
 *
 * @author BCS
 */
public class NestedLoopsInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for ( int j = 2; j <= 10; j++){
        
            for ( int i = 1; i <= 10; i++){
            
                System.out.println(i + "x" + j + "=" + (i *j));
            }
        
        }
    }
    
}
