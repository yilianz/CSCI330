import java.util.Scanner;


public class test
{
    public static void main (String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello world from Java! What is your name?");

        try{
            String name = in.next();
            if (name.length()>10) throw new RuntimeException("name is too long");
            System.out.println("Welcome "+name+" !");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

}
