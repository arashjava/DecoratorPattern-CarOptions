/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydecoratorpattern;

/**
 *
 * @author arash
 */
abstract class Decoration implements GeneralInt{
    
    protected GeneralInt myCar;
    
    public Decoration(GeneralInt newCar){
        myCar= newCar;
    }
    
    public String getOptions(){
        return myCar.getOption();
    }
    
    public Double getPrice(){
        return myCar.getPrice();
    }
}
