/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bieuthuc_decorator;

/**
 *
 * @author ASUS
 */
public class BieuThuc_Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BieuThuc bt = new BieuThucDonGian(20);
        BieuThucDecorator d1 = new Cong(10, bt);
        BieuThucDecorator d2 = new Tru(5, d1);
        BieuThucDecorator d3 = new Nhan(2, d2);
        BieuThucDecorator d4 = new Chia(5, d3);
        
        System.out.println(d4.bieuThuc() + " = " + d4.giaTri());
    }
    
}
