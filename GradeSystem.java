
import java.util.*;
public class GradeSystem 
{
  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
   System.out.println("Enter the number of subjects :- ");
   int nosub = sc.nextInt();

       int totalM = 0;
    
   for (int i=1; i<=nosub; i++) 
    {  System.out.println("Enter marks of Subject "+i+ " Out of 100 :- ");
       int marks = sc.nextInt();
       while (marks < 0 && marks >100) 
         { System.out.println("Invalid marks, Please enter marks between 0 and 100: ");
           System.out.println("Enter marks sor subject " + 1 + "out of 100:- ");
           marks = sc.nextInt();
         }
            totalM += marks;
    }
           System.out.println("Student Result :- ");
           System.out.println("Total marks obtained in all subjects:- " + totalM);

        int AvgPercent = totalM / nosub;
           System.out.println("Average Percentage = " + AvgPercent);
           
         if (AvgPercent >=90) 
            { System.out.println("Your grade is = A+");
             }
            else if (AvgPercent >= 80)
              { System.out.println("Your grade is = A");
                }    
       
            else if (AvgPercent >= 70)
               { System.out.println("Your grade is = B+");
                 }
            
                 else if (AvgPercent >= 60)
                 { System.out.println("Your grade is = B");}    
                    
            else if (AvgPercent >= 50)
             { System.out.println("Your grade is = C+");
               }    

            else if (AvgPercent >=40)
               { System.out.println("Your grade is = C");
                 }    
            else if (AvgPercent >=30)
               { System.out.println("Your grade is = D");
                 }    
            
            else
            { System.out.println("You are Fail");
              }    
               

    }
}

         
        
        
  
