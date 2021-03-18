import java.util.*;

class genericStack<T> {
    private ArrayList<T> mylist;

    public genericStack(){// constructor 
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


}

public class generictest{
    public static void main (String[] args){
        genericStack<String>  stringlist = new genericStack<String>();
        genericStack<Double>  doublelist = new genericStack<Double>();
        stringlist.push("Great");stringlist.push("Bad"); 
        doublelist.push(4.2); doublelist.push(5.2);
        System.out.println(stringlist.top());
        System.out.println(doublelist.top());
    }

}