import java.io.*;
public class Desirialize {

public static void main(String [] args ) throws IOException ,ClassNotFoundException {


String filename = "f.out";
FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            Object object1 = (Object)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1);
            
}
}