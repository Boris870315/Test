package Language;

public class Language {
protected String name= "Language";
protected Integer numSpeakers= 5656;
protected String regionsSpoken= "region";
protected String wordOrder= "don't know";

public void getInfo(){
	System.out.println(name +" is spoken by " +numSpeakers +" people mainly in " +regionsSpoken+". The language follows the word order: "+wordOrder+".");
}
  public static void main(String[] args) {
	  Language L= new Language(); 
	  L.getInfo();
	  Mayan M = new Mayan();
	  M.getInfo();
	  
	  
  }
}