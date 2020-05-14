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
public class Nhan extends BieuThucDecorator{
    float toanHang;

    public Nhan(float toanHang, BieuThuc bt) {
        super(bt);
        this.toanHang = toanHang;
    }
    
    @Override
    public float giaTri() {
        return bt.giaTri() * toanHang;
    }
    
    @Override
    public String bieuThuc() {
        return "(" + bt.bieuThuc() + ")" + " * " + toanHang;
    }
}
