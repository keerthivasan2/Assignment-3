interface Addable
{
	int add(int a,int b);
}
class lambda
{
   public static void main(String...args)
   {
	   Addable ad1=(a,b)->(a+b);
	   System.out.println("The addition value is:"+ad1.add(10,25));
	   Addable ad2=(a,b)->(a-b);
	   System.out.println("The subration value is:"+ad2.add(50,25));
	    Addable ad3=(a,b)->(a*b);
	   System.out.println("The multiplication value is:"+ad3.add(10,10));
	   Addable ad4=(a,b)->(a/b);
	   System.out.println("The division value is:"+ad4.add(500,25));
  }
}

    	   


 