public class App{
	public static void main(String[] args)
	{
		Student st1 = new Student();
		st1.name = "Alexey";
		st1.age = 21;
		st1.course = 2;
		st1.smart = true;
		
		System.out.println(st1);
	}
}
	
class Student {
	public String name;
	public int age;
	public int course;
	public boolean smart;
	
	public String toString()
	{
		return this.name + " - " + this.age + " y.o, " 
	+ this.course + " course, " + this.smart;
	}
	
}





