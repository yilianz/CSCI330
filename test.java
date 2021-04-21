import java.util.Scanner;


public class test
{
    public static void main (String[] args) throws Exception {
        double a,b;
        a = 2/4/2.0; //2.0/4.0;//(2.0/4.0)/8.0;
        b=0;
        //b = 3 - a++;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        int k = 2;
        switch (k) {
            case 1:			System.out.print("one ");
            case 2:			System.out.print("too ");
            case 3:			System.out.println("many");
          default:         System.out.println("none");
    
            }

        String s="To be, or not to be. My two cents. Twwwoooo!!";
        System.out.println(s.replaceAll("[tT]w+o","2"));
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Hello world from Java! What is your name?");

        try{
            String name = in.next();
            if (name.length()>10) throw new RuntimeException("name is too long");
            System.out.println("Welcome "+name+" !");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        */
    }

}
