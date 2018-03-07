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
public class Prime implements GeneralInt{

    @Override
    public String getOption() {
        return "Primary options only.";
    }

    @Override
    public Double getPrice() {
        return 19980.00;
    }

    
    
}
