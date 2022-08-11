package Language;

public class Mayan extends Language {

	String regionsSpoken= "Central America";
	String wordOrder= "verb-object-subject";
	String name = "Ki'che'";
	Integer numSpeakers = 2330000;
	
	
	public void getInfo(){
	System.out.println(name +" is spoken by " +numSpeakers +" people mainly in " +regionsSpoken+". The language follows the word order: "+wordOrder+".");
	}
}


  
