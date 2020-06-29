public class Math{
    public static double addValues(double valOne,double valTwo){
        return valOne + valTwo;
    }
    public static double subtractValues(double valOne,double valTwo){
        return valOne - valTwo;
    }
    public static double multiplyValues(double valOne,double valTwo){
        return valOne * valTwo;
    }
    public static double divideValues(double valOne,double valTwo){
        //check for zero
        if (valTwo == 0){
            //send error message
            return 0;
        }else{
            return valOne / valTwo;
        }
    }

} 