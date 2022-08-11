package Basic;

public class ForeTech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String[][] hello= {{"1","2","3"}, {"4","5","6"}, {"7","8","9"}};
			int i=0,j=0;
			
			for(String helloRow[]: hello) {
				for(String hi:helloRow){
					i++; 
					System.out.print(i);}
				System.out.println(" ");
			}
			
			System.err.println("°e°Ú");
			
			for(String helloCol[]: hello) {
					j++;
					System.out.print(j);
			}		
	}
}
