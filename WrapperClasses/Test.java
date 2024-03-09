class Test{
static int i=1;
public static void main(String[] args){
   Byte byte1=5;
   Byte byte2=67;
   //Compare the two specified byte values
   int val=Byte.compare(byte1,byte2);
  if(val>0){
    System.out.println(i++ +"."+byte1+"is greater than "+byte2);
   }else{
    System.out.println(i++ +"."+byte2+"is greater than"+ byte1);
    }
    //Hash code of byte value byte1
    int f1=byte1.hashCode();
   System.out.println(i++ +"."+"Hash code value of"+byte1+"is:"+f1);
    //returns the value of this byte as a float
    Float f2=byte2.floatValue();
    System.out.println(i++ +"."+"Float Value of "+byte2+"is:"+f2);
    //Return the value of this byte as a Integer
    Integer f3=byte2.intValue();
    System.out.println(i++ +"."+"Integer value of "+byte2+"is:"+f3);
    //Decodes a string into byte
    String str="123";
    Byte f4=Byte.decode(str);
 
    System.out.println(i++ +"."+"Decoded value of "+str+"is:"+f4);
}
}