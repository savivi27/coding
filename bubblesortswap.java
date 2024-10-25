import java.util.Arrays;
public class bubblesortswap{
  public static void main(String []args){
    Integer[] a = new Integer[] {9,7,11,8,1};
    int x;

    System.out.println ("before swap this is the result");
   System.out.println (Arrays.deepToString (a)) ;

   x = a [4] ;
   a [4] = a[3];
   a [3] = x;

   System.out.println("after swap this is the result");
   System.out.println (Arrays.deepToString (a)) ;
  }
}



