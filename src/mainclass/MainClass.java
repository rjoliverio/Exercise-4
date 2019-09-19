/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mainclass;

/**
 *
 * @author oliverioro_cis21035
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle R=new Rectangle();
        R.setLength(70);
        R.setWidth(10);
        System.out.print(R);
        System.out.printf("Perimeter=%.2f\nArea=%.2f\n\n",R.getPerimeter(),R.getArea());
        
        Circle C=new Circle(10.56);
        System.out.println(C);
        System.out.printf("Circumference=%.2f\nArea=%.2f\n",C.getCircumference(),C.getArea());
        
    }
    
}
