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
 
class Income{

   private String IncomeType;
   private double amount;
   private double tax;
   private double totalTax;
   
   public Income(String IncomeType,double amount,double tax){
   
   this.IncomeType = IncomeType;
   this.amount = amount;
   this.tax = tax;
   
   }
   
   public String getIncomeType(){
          return IncomeType; 
   }

   
   public double getAmount(){
         return amount;
   }
   
   public double getTax(){
         return tax;
   }
   
   public double getTotalTax(){
   
   totalTax = (tax/100)*amount;
   return totalTax;
   }
   
}
   
class Staff{

   private String name;
   private String id;
   private Income income;
   double netIncome;
   
   
   public Staff(String name,String id,Income income){
   
   this.income=income;
   this.name=name;
   this.id=id;

   }
   
   public String getName(){
      return name;
   }
   
   public String getId(){
      return id;
   }
   
   double calculateNetIncome(){
      netIncome = income.getAmount() - income.getTotalTax();
      return netIncome;
   }
   
   public void displayStaffInfo(){
      System.out.println("Name: "+ name);
      System.out.println("ID: "+ id);
   }
   
     
   public void displayIncomeInfo(){
   
      System.out.println("Income type: "+ income.getIncomeType() );
      System.out.printf("Income amount:RM %.2f", income.getAmount() );
      System.out.println("\nTax: "+ income.getTax() );
      System.out.printf("Total tax:RM %.2f", income.getTotalTax() );
      System.out.printf("\nNet income:RM %.2f", calculateNetIncome() );
   
   }
 }  
   
      