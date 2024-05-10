/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Biographies extends Book {
    //-------------------------------------
    public Biographies()
    {
        
    }
    //--------------------------------------
    public Biographies(String Tittle,double purchasesCost)
    {
        super(Tittle,purchasesCost);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Biographies Book Tittle:%s , purchase' Cost:%.1f", this.getTittle(), this.getPurchasesCost());
    }
    
}
