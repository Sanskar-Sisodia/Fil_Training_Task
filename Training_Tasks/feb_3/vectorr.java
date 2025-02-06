import java.util.*;
public class vectorr {
    public static void main(String[] args) {
       // Vector v= new Vector();// deafult intitial capacity is 10 and so is step size
       // Vector v= new Vector(4);//4 is initial capacity+ increment steps
       Vector <Integer> v= new Vector<Integer>(4, 2);//size 0, capacity 4

       System.out.println(v.capacity());
    }
}
