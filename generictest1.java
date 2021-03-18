import java.util.*;

class Stack<T> {
    private ArrayList<T> mylist;

    public Stack(){// constructor 
        mylist = new ArrayList<T>();        
    }

    public void push(T newelement){
        mylist.add(newelement);
    }

    public T top(){
        if (mylist.isEmpty()){
            System.out.println("Empty Stack");
            return null;
        }else{
            return mylist.get(mylist.size()-1);
        }
    }   

    public void swap(int i, int j){ //swap the ith and jth elements
        T temp = mylist.get(i);
        mylist.set(i, mylist.get(j));
        mylist.set(j,temp);
    }
}

public class generictest1{

    public static double sumOfList(List<? extends Number> mylist){
        double s = 0.0;      
        for(Number n:mylist){
            s += n.doubleValue();
        }
        return s;
    }

    public static void main (String[] args){
        Stack<String>  stringlist = new Stack<String>();
        Stack<Double>  doublelist = new Stack<Double>();
        stringlist.push("Great");stringlist.push("Bad"); stringlist.swap(0,1);
        doublelist.push(4.2); doublelist.push(5.2);
        //System.out.println(stringlist.top());
        //System.out.println(doublelist.top());

        List<Integer> li = Arrays.asList(1,2,3);
        System.out.println("sum = "+ sumOfList(li));
        List<Double> ld = Arrays.asList(1.0,2.0,3.0);
        System.out.println("sum = "+ sumOfList(ld));
        List<Byte>  lb = Arrays.asList((byte)10,(byte)10,(byte)10);
        System.out.println("sum = "+ sumOfList(lb));

    }

}