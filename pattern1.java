public class pattern1{
  public static void printPattern(int n){
    int i,j;
    for(i=1;i<=n;i++){
      for(j=1;j<=i;j++){
        System.out.print("*");
      }
      for(j=1;j<=n-1;j++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void mai(String args[]){
    int n=6;
    printPattern(n);
  }
}
