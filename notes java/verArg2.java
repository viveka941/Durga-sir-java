
public class verArg2 {
  public static void s(int    ...x){
    System.out.println("s");
  }
  
  public static void main(String[] args) {
    sum(10,20,30,40);
    s(45,34,6);
 
  }
  public static void sum(int... x){
    int total =0;
    for(int a: x){
      total +=a;
    }
    System.out.println("the sum "+total);
  }
}
