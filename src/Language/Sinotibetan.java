package Language;

public class Sinotibetan extends Language {

	String regionsSpoken= "Asia";
	String wordOrder= "subject-object-verb";
	String name = "";
	Integer numSpeakers = 2330000;
	
	
	public void getInfo(){
	System.out.println(name +" is spoken by " +numSpeakers +" people mainly in " +regionsSpoken+". The language follows the word order: "+wordOrder+".");
	}
}