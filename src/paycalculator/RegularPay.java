
package paycalculator;

import java.math.BigDecimal; 
public class RegularPay extends PayCalculator{
   
    public RegularPay(BigDecimal payRate){
        super(payRate);
    }
    @Override
    BigDecimal computePay(double hour){
        return payRate.multiply(new BigDecimal(hour));
    }
}
