class Test2{

 public static void main(String[] at){
 Byte b=100;
  byte b1=b.byteValue();
System.out.println("Byte to byte primitive =>"+b1);
//
Byte b3=Byte.MIN_VALUE;
System.out.println(b3.byteValue());
Byte b4=Byte.MAX_VALUE;
System.out.println(b4.byteValue());
byte b5=23;
//Byte b6=b5.byteValue();error::/byte cannot be dereferenced
// System.out.println(b6);
}
}  
 