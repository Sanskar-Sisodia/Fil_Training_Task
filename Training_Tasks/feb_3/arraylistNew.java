import java.util.*;
public class arraylistNew {
  public static void main(String []ar)
  {
    //Any generic <> does not support any primitive datatype(like int, float, double e.t.c.) and only use wrapper classes like Integer, String e.t.c.
    //ArrayList st=new ArrayList();//without aspecifying the type.
    ArrayList <String> st= new ArrayList<>();
    st.add("Ram");
    //st.add(23);
    st.add("Singh");
    System.out.println(st);
  }  
}
