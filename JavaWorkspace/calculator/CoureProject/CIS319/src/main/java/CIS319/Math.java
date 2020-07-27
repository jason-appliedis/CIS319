package CIS319;

import java.math.BigDecimal;

public class Math{

    public static BigDecimal calculateTotal(String valOne,String valTwo, String operator){
        System.out.println(valOne);
        System.out.println(valTwo);
        System.out.println(operator);
        if(!valOne.contains(".")){
            valOne = valOne + ".0";
        }
        if(!valOne.contains(".")){
            valTwo = valTwo + ".0";
        }
        BigDecimal valOneAsBd = new BigDecimal(valOne);
        BigDecimal valTwoAsBd = new BigDecimal(valTwo);
        BigDecimal result = new BigDecimal("0.00");
        switch(operator){
            case "multiply":
                result = multiplyValues(valOneAsBd,valTwoAsBd);
                break;
            case "divide":
                result = divideValues(valOneAsBd,valTwoAsBd);
                break;
            case "minus":
                result = subtractValues(valOneAsBd,valTwoAsBd);
                break;
            case "plus":
                result = addValues(valOneAsBd,valTwoAsBd);
                break;
            default : break;
        }
        return result;
    }


    private static BigDecimal addValues(BigDecimal valOne,BigDecimal valTwo){
        return valOne.add(valTwo);
    }
    private static BigDecimal subtractValues(BigDecimal valOne,BigDecimal valTwo){
        return valOne.subtract(valTwo);
    }
    private static BigDecimal multiplyValues(BigDecimal valOne,BigDecimal valTwo){
        return valOne.multiply(valTwo);
    }
    private static BigDecimal divideValues(BigDecimal valOne,BigDecimal valTwo){
        //check for zero
        return valOne.divide(valTwo);
    }

} 