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
public class BieuThucDecorator extends BieuThuc{
    protected BieuThuc bt;

    public BieuThucDecorator(BieuThuc bt) {
        this.bt = bt;
    }
    
    @Override
    public float giaTri() {
        return bt.giaTri();
    }

    @Override
    public String bieuThuc() {
        return bt.bieuThuc();
    }

    
}
