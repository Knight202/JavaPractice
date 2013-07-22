package com.tutorials;

public class IntegerDemo {
 
  public static void main(String[] args) {
 
 System.out.println("------------------------------------------");
 System.out.println("Integer's Max Value : " + Integer.MAX_VALUE);
 System.out.println("Integer's Min Value : " + Integer.MIN_VALUE);
 System.out.println("Integer's Size : " + Integer.SIZE);
 System.out.println("Integer's Type : " + Integer.TYPE);
 System.out.println("------------------------------------------");
 
 Integer integer1 = new Integer(10);
 Integer integer2 = new Integer("9");
 
 System.out.println(integer1);
 System.out.println(integer2);
 System.out.println("------------------------------------------");
 System.out.println("Method *primitiveValue() Testing : ");
 
 Integer integer = new Integer(145367);
 byte b   = integer.byteValue();
 short s  = integer.shortValue();
 int i    = integer.intValue();
 long l   = integer.longValue();
 float f  = integer.floatValue();
 double d = integer.doubleValue();
 
 System.out.println("byte : " + b );
 System.out.println("short : " + s);
 System.out.println("int : " + i);
 System.out.println("long : " + l);
 System.out.println("float : " + f);
 System.out.println("double : " + d);
 
 System.out.println("------------------------------------------");
 System.out.println("Method compareTo Testing : ");
 
 integer1 = new Integer(1);
 integer2 = new Integer(2);
 Integer integer3 = new Integer(1);
 
 System.out.println(integer1.compareTo(integer3));
 System.out.println(integer1.compareTo(integer2));
 System.out.println(integer2.compareTo(integer3));
 
 System.out.println("------------------------------------------");
 System.out.println("Method equals() Testing : ");
 
 System.out.println(integer1.equals(integer3));
 System.out.println(integer1.equals(integer2));
 
 System.out.println("------------------------------------------");
 
 System.out.println("Method decode() Testing : ");
 String decoder = "0x11";
 System.out.println(Integer.decode(decoder));
 
 decoder = "011";
 System.out.println(Integer.decode(decoder));
 
 System.out.println("------------------------------------------");
 
 System.out.println("Method parseInt() Testing : ");
 System.out.println(Integer.parseInt(decoder));
 System.out.println(Integer.parseInt(decoder, 8));
 
 System.out.println("------------------------------------------");
 System.out.println("Method valueOf() Testing : ");
 
 System.out.println(Integer.valueOf(10));
 System.out.println(Integer.valueOf("3"));
 System.out.println(Integer.valueOf("100", 2));
 
 System.out.println("------------------------------------------");
 System.out.println("Method toString() Testing : ");
 
 System.out.println(integer.toString());
 System.out.println(Integer.toString(10));
 System.out.println(Integer.toString(10 , 16));
 
 System.out.println("------------------------------------------");
 System.out.println("Method reverse() and rotate() Testing : ");
 
 System.out.println(Integer.reverse(10));
 System.out.println(Integer.reverseBytes(10));
 System.out.println(Integer.rotateLeft(100, 2));
 System.out.println(Integer.rotateRight(100, 2));
 
 System.out.println("------------------------------------------");
 System.out.println("Method bitCount() , highestOneBit() and " +
   "lowestOneBit() Testing : ");
 
 System.out.println(Integer.bitCount(3));
 System.out.println(Integer.highestOneBit(3));
 System.out.println(Integer.lowestOneBit(3));
 
 System.out.println("------------------------------------------");
 System.out.println("Method getInteger() Testing : ");
 
 System.setProperty("Key","10");
 System.out.println(Integer.getInteger("Key"));
 System.setProperty("Key","20");
 System.out.println(Integer.getInteger("Key",10));
 
 System.out.println("------------------------------------------");
 System.out.println("Method numberOfLeadingZeros(),numberOfTrailingZeros() Testing : ");
 
 System.out.println(Integer.numberOfLeadingZeros(5));
 System.out.println(Integer.numberOfTrailingZeros(30));
 
 System.out.println("------------------------------------------");
 System.out.println("Method signum() Testing : ");
 
 System.out.println(Integer.signum(9));
 System.out.println(Integer.signum(0));
 System.out.println(Integer.signum(-9));
 
 System.out.println("------------------------------------------");
 System.out.println("Method toBinaryString() , toHexString() and toOctalString() Testing : ");
 
 System.out.println(Integer.toBinaryString(15));
 System.out.println(Integer.toHexString(15));
 System.out.println(Integer.toOctalString(15));
 
 System.out.println("------------------------------------------");
   }
 
}