import java.util.*;


public class anyarray<T> {
    private ArrayList<T> mylist;

    public anyarray(){// constructor 
        mylist = new ArrayList<T>();        
    }
    public void swap(int i, int j){ //swap the ith and jth elements
        T temp = mylist.get(i);
        mylist.set(i, mylist.get(j));
        mylist.set(j,temp);
    }
    
}
