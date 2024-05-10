/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Children extends Book {
    private final double discountRate=0.15;
    
    //-------------------------------------
    public Children()
    {
        
    }
    //--------------------------------------


    public Children(String Tittle,double purchasesCost)
    {
        super(Tittle,purchasesCost);
    }
    //---------------------------------------
    //override getPurchasesCost as requested\
    @Override
    public double getPurchasesCost()
    {
      return super.getPurchasesCost() * (1-this.discountRate);
    }


//override toString()as requested
   @Override
    public String toString()
    {
        return String.format("Children Book Title:%s, purchase' Cost: %.2f, cost after discount= %.2f",super.getTittle(), super.getPurchasesCost(), this.getPurchasesCost());
    }
}
