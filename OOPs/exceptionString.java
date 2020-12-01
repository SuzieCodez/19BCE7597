import java.util.Scanner;

class exceptionString {
    public static void main(String[] args) {
        try{
            Str();
        }
        catch (ExceptionLineTooLong exception){
            System.out.println(exception);
        }
    }

    public static void Str()throws ExceptionLineTooLong{
        System.out.println("Enter a string");
        Scanner in=new Scanner(System.in);
        String s=in.next();
        if (s.length()>80)
        throw new ExceptionLineTooLong(": The string is too long");
    }
}

class ExceptionLineTooLong extends Exception{
    private String s;
    ExceptionLineTooLong(String s){
        this.s=s;
    }
    public String toString(){
        return "Exception"+s;
    }
}