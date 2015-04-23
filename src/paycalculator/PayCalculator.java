
package paycalculator;

import java.math.BigDecimal;

public abstract class PayCalculator {
    BigDecimal payRate;
    
    PayCalculator(BigDecimal payRate){
        this.payRate=payRate;
    }
    
    abstract BigDecimal computePay(double hour);
   
    BigDecimal computeDeduction(double deductRate){
        return (this.payRate.multiply(new BigDecimal(deductRate)));
    }

   
}
