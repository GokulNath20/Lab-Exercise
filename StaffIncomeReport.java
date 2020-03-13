import java.util.Scanner;
public class StaffIncomeReport{//class name
   
 public static void main (String[] args){
 
   Scanner gk = new Scanner(System.in);
   
   System.out.print("Please enter the name: ");
   String name = gk.next()+gk.nextLine();
   
   System.out.print("Please enter the ID: ");
   String ID = gk.next()+gk.nextLine();
   
   System.out.print("Please enter the income type: ");
   String income_type = gk.next()+gk.nextLine();
   
   System.out.print("Please enter the amount: ");
   double amount = gk.nextDouble();
   
   System.out.print("Please enter the tax: ");
   double tax_percentage = gk.nextDouble();
   
   Income mac = new Income(income_type,amount,tax_percentage);
   
   Staff staff = new Staff(name,ID,mac);
   
   System.out.println("------- STAFF DETAIL -------");
   staff.displayStaffInfo();
   System.out.println(" ");
   
   System.out.println("------- STAFF INCOME DETAIL -------");
   staff.displayIncomeInfo();
   System.out.println(" ");
   
   
   
   
   }
   
 }  
   
   