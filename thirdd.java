public class thirdd{
  public static main printPattern(int n){
    int i,j;
    for(i=1; i<=n; i++){
      for(j=1;j<=n-1; j++){
        System.out.print("*");
      }
      for(j=1;j<=i;j++){
        System.out.print(" ");
      }
      System.out.println();
    }
  } 
  pubic static void main(String args[]){
    int n=6;
    printPattern(n);
  }
}
