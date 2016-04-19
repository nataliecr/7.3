import java.util.Scanner;

public class PrintDistinctNumbers {
  public static void main(String[] args){  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter ten numbers: ");
    
    int count1 = 0, count2 = 0;
    double[] distinct = new double[10]; // if distinct contains numbers i
    for (int i = 1; i < 10; i++){
      double num = input.nextDouble();
      
      for (count1 = 0; count1 <= count2; count1++){
        if (num == distinct[count1])
          break;
      } // for count1
      
      if (count1 - count2 == 1){
        distinct[count2] = num;
        count2++;
      }
    } // for i
    
    System.out.println("The number of distinct number is " + count2);
    System.out.print("The distinct numbers are: ");
    for (int i = 0; i < count2; i++)
      System.out.print((int)distinct[i] + " ");
    
    System.out.println();
  } // main        
}
