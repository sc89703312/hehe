import java.io.*;
public class Test {
     public static void main(String[] args){
    	 Hehe a=new Hehe();
    	 System.out.println(a.getX()   +a.getY()    +a.getZ());
    	 
    	 
    	 
    	 
    	 
    	 try{
    		 FileOutputStream fos=new FileOutputStream("dg.ser");
    		 ObjectOutputStream oos=new ObjectOutputStream(fos);
    		 oos.writeObject(a);
    		 oos.close();
    		 FileInputStream fis=new FileInputStream("dg.ser");
    		 ObjectInputStream ois=new ObjectInputStream(fis);
    		 ois.close();
    		 
    		 
    		 
    		 a=(Hehe)  ois.readObject();
    		 
    	 }catch(Exception ex){ex.printStackTrace();}
    	 
    	 
    	 
    	 
    	 
    	 System.out.println(a.getX() +a.getY() +a.getZ());
     }
}
