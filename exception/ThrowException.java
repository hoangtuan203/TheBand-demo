package exception;

public class ThrowException {
    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("chua du tuoi");
        }
        else{
            System.out.println("welcome !");
        }
    }
    static void validatel(int age){
        try {
            if(age < 18){
                throw new ArithmeticException("not valid");
            }
            else{
                System.out.println("welcome !");
            }
        } catch (ArithmeticException ex) {
            // TODO: handle exception
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String args[]){
        validatel(20);
        System.out.println("reat of the code ...");
    }
}
