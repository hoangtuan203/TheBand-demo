package exception;

public class MyException  extends Exception{
    public MyException(){

    }
    public MyException(String message)
    {
        super(message);
    }
    @Override
    public String toString (){
        return super.toString();
    }
    @Override
    public String getMessage(){
        return super.getMessage();
    }
    public String tuoi()
    {
        return "chua du tuoi di hoc";
    }
    public String dividebyzero(){
        return "can not devide by zero";
    }
    public MyException(Throwable cause){
        super(cause);
    }
}
