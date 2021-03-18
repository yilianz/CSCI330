public class exceptiontest2 {

    public static void main (String[] args) {
        try{
            System.out.println(checkAge(22));
            System.out.println(checkAge(3));
            System.out.println(checkAge(15));
         } catch(Exception e){
            System.out.println("exception");
            System.out.println(e.getMessage());
        }
    }
 
    public static int checkAge(int age) throws Exception {
        try{
            if( age < 14 ) throw new Exception("-2");
            else if( age < 18 ) return 0;
            else return 1;
        } catch(RuntimeException e) {
            System.out.println("error " + e.getMessage());
            return -1;
        }
    }



    
}
