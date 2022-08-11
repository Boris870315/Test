package DNA;

public class DNA {
	 
	  public static void main(String[] args) {
	    String dna1="ATGCGATACGCTTGA", dna2="ATGCGATACGTGA", dna3="ATTAATATGTACTGA";
	    String[] dna= {dna1, dna2, dna3};
	    System.out.println(dna.length);
	    
	    
	  for (int i=0;i< dna.length;i++){
	      if (dna[i].indexOf("ATG")==0){
	        if(dna[i].indexOf("TGA")==dna[i].length()-3)  {
	        	if(dna.length%3==0)
	          System.out.println("DNA"+i+": is protein");
	        }

	    }
	      else 
	    	  System.err.println("DNA"+i+": is not protein");
	  }
	  }
	 
	}