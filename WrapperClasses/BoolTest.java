class BoolTest{

  public static void main(String[] args){
   Boolean b1=true;
   boolean b2=false;
//assigning boolean value of b1 to b3
   Boolean b3=b1.booleanValue();
   String s1="Value of boolean object "+b1+"is"+b3+".";
   //compare b1,b2
   int val1=Boolean.compare(b1,b2);
   if(val1>0){
   System.out.println("b1 is true");
   }else{
    System.out.println("b2 is true");
   }
   //LogicalAnd() with return the same result as AND operator
   Boolean val2=Boolean.logicalAnd(b1,b2);
   System.out.println("Logical And Will return "+val2);
}}