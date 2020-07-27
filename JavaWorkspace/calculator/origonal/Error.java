public class Error {
    //constructor 
    public Error(){}

    public static Exception didError(Exception e){
        System.out.println(e);
        return e;
    }
}