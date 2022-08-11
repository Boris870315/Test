package Playlist;
import java.util.ArrayList;
public class Playlist {


	public ArrayList<String> Swip(ArrayList<String> swip) {
		int a=0, b=1;
		String A=swip.get(a), B=swip.get(b);
	    String temp=A;
		A=B;
		B=temp;
		swip.set(a, A);
		swip.set(b, B);
		return swip;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
	    desertIslandPlaylist.add("Hello");
	    desertIslandPlaylist.add("Wow");
	    desertIslandPlaylist.add("int");
	    desertIslandPlaylist.add("string");
	    desertIslandPlaylist.add("Bye");
	    
	    
	    System.out.println(desertIslandPlaylist.size());
	    System.out.println(desertIslandPlaylist.toString());
	    
	    desertIslandPlaylist.remove(3);
	    System.out.println(desertIslandPlaylist.size());
	    
	    
	    Playlist P= new Playlist();
	    P.Swip(desertIslandPlaylist);
	    
	  
	    System.out.println(desertIslandPlaylist.toString());
	    
	    
	}

}
