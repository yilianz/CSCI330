public class exceptiontest {

    public static void main (String[] args) {
        int result = 0;
        try{
            result = calc("A + 5");
            System.out.println(result + " ");
            result = calc(result + " / 0");
            System.out.println(result + " ");
            result = calc(result + " * three");
            System.out.println(result + " ");
        } catch(NumberFormatException e) {
            System.out.println("N");
        } catch(Exception e) {
            System.out.println("E");
        } finally{
            System.out.println(result);
        }
     }
 
     public static int calc(String expr) {
        String[] s = expr.split("\\s");
        System.out.println(s[0] + s[1] + s[2]);
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[2]);
        if(s[1].equals("+")) return (x + y);
        if(s[1].equals("-")) return (x - y);
        if(s[1].equals("*")) return (x * y);
        else return (x / y);
    }




    
}
