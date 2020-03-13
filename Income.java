import java.util.Scanner;
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