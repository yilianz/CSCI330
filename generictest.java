import java.util.*;

class genericStack<T> {    // T is the parameter type
    private ArrayList<T> mylist;

    public genericStack(){// constructor 
        mylist = new ArrayList<T>();        
    }

    public void push(T newelement){
        mylist.add(newelement);
    }

    public T top(){     //Return type of the top() is T
        if (mylist.isEmpty()){
            System.out.println("Empty Stack");
            return null;
        }else{
            return mylist.get(mylist.size()-1);
        }
    }   
// creat a new method   swap(i,j)  that it going to swap the i th element with jth element
// mylist.get(i)  --- i th element
//temp = i th  ,   i th = jth  , jth = temp
    public void swap(int i, int j){
        ??   temp = mylist.get(i);
        mylist.set(i,mylist.get(j));
        mylist.set(j, temp);
    }

}

public class generictest{
    public static void main (String[] args){
        genericStack<String>  stringlist = new genericStack<String>();
        genericStack<Double>  doublelist = new genericStack<Double>();
        // Create a genericStack of integer type

        stringlist.push("Great");stringlist.push("Bad"); stringlist.swap(0,1);
        doublelist.push(4.2); doublelist.push(5.2);
        System.out.println(stringlist.top());
        System.out.println(doublelist.top());
    }

}