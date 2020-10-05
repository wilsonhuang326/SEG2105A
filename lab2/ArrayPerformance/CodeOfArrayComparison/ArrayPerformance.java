import java.lang.reflect.Array;
import java.util.*;

public class ArrayPerformance {
    public static void main(String [] args){
        long x=100000000 ;
        long x1=380000000;
        long time;

        /* Adding elements */
        long startTime=System.currentTimeMillis();
        LinkedList<Character> chars=linkedList(x);
        //char[] chars=array(x1);
        //ArrayList<Character> chars=arrayList(x1);
        long endTime=System.currentTimeMillis();
        time=endTime-startTime;
        System.out.println(time+"ms"+"    "+x+" chars");

        /* Measure the amount of time (in milliseconds) it takes to sum the elements */
        //long startTime=System.currentTimeMillis();
        //sumOfLinkedList(chars);
        //sumOfArray(chars);
        //sumOfArrayList(chars);
        //long endTime=System.currentTimeMillis();
        //System.out.println(time+"ms"+"    "+x+" chars");
    }
    public static ArrayList<Character> arrayList(long x){
        ArrayList<Character> chars= new ArrayList<Character>();
        for(int i=0;i<x;i++){
            char c=(char)('A'+Math.random()*('Z'-'A'+1));
            chars.add(c);
        }
        return chars;
    }

    public static LinkedList<Character>  linkedList(long x){
        LinkedList<Character> chars=new LinkedList<>();
        for(int i=0;i<x;i++){
            char c=(char)('A'+Math.random()*('Z'-'A'+1));
            chars.add(c);
        }
        return chars;
    }

    public static char[] array(long x){
        char[] chars;
        chars = new char[(int) x];
        for(int i=0;i<x;i++){
            char c=(char)('A'+Math.random()*('Z'-'A'+1));
            chars[i]=c;
        }
        return chars;
    }

    public static void sumOfArrayList(ArrayList<Character> chars){
        String sum = null;
        for(char x:chars){
            sum=sum+Character.toString(x);
        }
    }
    public static void sumOfArray(char[] chars){
        String sum = null;
        for (char x:chars) {
            sum=sum+Character.toString(x);
        }
    }
    public static void sumOfLinkedList(LinkedList<Character> chars){
        String sum = null;
        for(char x:chars){
            sum=sum+Character.toString(x);
        }
    }
}


