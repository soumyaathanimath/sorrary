/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortingarray;

/**
 *
 * @author dell1
 */
public class Sortingarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};
        
        java.util.Arrays.sort(arr);
        
        for(String x:arr)
            System.out.println(x);
    }
    
}
