import java.util.*;
class Student1
{
	  String name;
	  int id,Atd,Tmarks;
	  Student1(String name,int id,int Atd,int Tmarks) 
	  {
		this.name = name;
		this.id = id;
	    this.Atd = Atd;
		this.Tmarks=Tmarks;
	  }
	@Override
	public String toString()
	  {
		return "Student1 [ name=" + name + ",id = "+ id +",Atd = "+Atd+ "Tmarks=" + Tmarks + "]";
	  }
	public void display() {
	    System.out.println("Name :" +name);
		System.out.println("id: "+id );
		System.out.println("Atd:"+Atd);
		System.out.println("Tmarks: "+Tmarks);
     if(Atd>=60){System.out.println("Your attendents is GOOD:"+Atd);}
	 else {System.out.println("You have POOR attendents:"+Atd);}  			
	  }
	 	public static void main(String...args)
	 {
		Student1 st=new Student1("Keerthivasan",4015,55,450);
		st.display();
	 }
	 
}

	
		
		
		
		
		