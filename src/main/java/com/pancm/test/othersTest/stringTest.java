package com.pancm.test.othersTest;

/**
* Title: test1
* Description: string相关问题
* Version:1.0.0  
* @author pancm
* @date 2017-7-21
 */
public class stringTest {
	  public static void main(String[] args) {
	   test1();
	   test3();
	  }
	  
	  private static void test1(){
		  String str="Hello World";
		     String str1="";
			 StringBuffer sbr=new StringBuffer(str); 
			 StringBuilder sbd=new StringBuilder(str); 
			 long start=System.currentTimeMillis();
		     for(int i=0;i<10000;i++){
		    	 str1+=str;
		     }
		     System.out.println("String累加用时:"+(System.currentTimeMillis()-start)+"ms");
		     long start2=System.currentTimeMillis();
		     for(int i=0;i<10000;i++){
		    	 sbr.append(str);
		     }
		     System.out.println("StringBuffer累加用时:"+(System.currentTimeMillis()-start2)+"ms");
		     long start3=System.currentTimeMillis();
		     for(int i=0;i<10000;i++){
		    	 sbd.append(str);
		     }
		     System.out.println("StringBuilder累加用时:"+(System.currentTimeMillis()-start3)+"ms");
			  
	  }
	  
	  
	  private  static void test3() {
		
		    String s1 = "Programming";
	        String s2 = new String("Programming");
	        String s3 = "Program";
	        String s4 = "ming";
	        String s5 = "Program" + "ming";
	        String s6 = s3 + s4;
	        String s7 = new String(s1);
	        // 引用地址不同  equals相同    
	        System.out.println(s1 == s2); //false
	        // s5 在编译之前就可以确认s5=Programming 因此相等
	        System.out.println(s1 == s5); //true
	        //字符串常量池的原则 这时 s6 的值是在运行时得到的，它会重新构造字符串对象 所以为false
	        System.out.println(s1 == s6); //false
	        System.out.println(s1 == s6.intern()); //true
	        System.out.println(s2 == s2.intern()); //false
	        System.out.println(s7==s1);       //false
	        System.out.println(s7.equals(s1)); //true
	        
	        
	        String ab="ab";
		    String c="c";
		    String ab_c=ab+c;
		    String ab_c1="ab"+"c";
		    String abc="abc";
		    /**
		     * 优先级问题
		     */
		    System.out.println(ab_c == abc + " : " + ab_c.equals(abc));//false
		    /**
		     *  字符串常量池的原则 这时 ab_c 的值是在运行时得到的，它会重新构造字符串对象 所以为false
		     */
		    System.out.println((ab_c == abc) + " : " + ab_c.equals(abc));//false : true
		    /**
		     * 这条语言在编译时，可以确定 ab_c1 = "abc"，因此它与 abc = "abc" 指向同一对象 所以为true
		     */
		    System.out.println((ab_c1 == abc) + " : " + ab_c1.equals(abc));//true : true

	}
	  
}
