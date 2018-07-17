import java.io.*;  
public class SerializeP{  
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(12,"akshay");  
  
  FileOutputStream fout=new FileOutputStream("f.out");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}  

class Student implements Serializable{
	int id;
	String name;
	
	Student() {
	}
	
	Student(int id, String name) {
	this.id = id;
	this.name= name;
	}
	
	public String toString() {
		return "Student=" + id + " " + "name=" + name;
	}
}