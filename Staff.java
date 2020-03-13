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
      System.out.printf("Income amount: %.2f", income.getAmount() );
      System.out.println("\nTax: "+ income.getTax() );
      System.out.printf("Total tax: %.2f", income.getTotalTax() );
      System.out.printf("\nNet income: RM %.2f", calculateNetIncome() );
   
   }
 }  
   
   