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
public class Cong extends BieuThucDecorator{
    float toanHang;

    public Cong(float toanHang, BieuThuc bt) {
        super(bt);
        this.toanHang = toanHang;
    }
    
    @Override
    public float giaTri() {
        return bt.giaTri() + toanHang;
    }
    
    @Override
    public String bieuThuc() {
        return bt.bieuThuc() + " + " + toanHang;
    }
}
