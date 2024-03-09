class Test1{
static int i=1;

public static void main(String[] args){
   Byte byte1=5;
   Byte byte2=67;
   //It compares two Byte object numerically
   int val=byte1.compareTo(byte2);
   if(val>0){
     System.out.println(i++ +"."+"Is greater than"+ byte2);
   }
   else{
    System.out.println(i++ +"."+byte2+"is greater than "+byte1);
    }
   //it is used check whether both values are equal or not
   Boolean b1=byte1.equals(byte2);
   if(b1){
     System.out.println(i++ +"."+byte1+"and"+byte2+"are equal");
    }else{
      System.out.println(i++ +"."+byte1+"and "+byte2+"are not equal");
    }
    //returns the value of this Byte as long

    Long f3=byte2.longValue();
    System.out.println(i++ +"."+"Long value of "+byte2+"is:"+f3);
   //Return a string representation of the Bytes object
    String f4=byte2.toString();
    System.out.println(i++ +"."+"String value of "+byte2+"is :"+f4);
   //It returns a double value for this Byte Object
   Double f5=byte1.doubleValue();
   System.out.println(i++ +"."+"Double value of "+byte1+"is:"+f5);
}
}
  