import java.io.*;




public class Hehe  implements Serializable{
	
	public int x=4;
	transient long y=4;
	private short z=5;
	
	
	int getX(){
		return x;
	}
	
	
	long getY(){
		return y;
	}
	
	short getZ(){
		return z;
	}

}
