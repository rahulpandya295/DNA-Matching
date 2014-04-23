
public class GeneMatcher{
	
	
	public int C(char a, char b){
		if(a!=' ' && b!=' '){
			if(a==b)
				return 5;
			else
				return -3;
		}
		else
			return -4;
	}
	public void Traceback(int i, int j, int Cost[][], String DNA1, String DNA2){
		
		int MatchCost=Cost[i][j];
		String dna1 = "", dna2 = "";
		while(i>0 && j>0){
			if(Cost[i-1][j-1]==Cost[i][j]-C(DNA1.charAt(i-1),DNA2.charAt(j-1))){
				
				dna1 = dna1+ DNA1.charAt(i-1);
				dna2 = dna2+ DNA2.charAt(j-1);
				i--; j--;
			}
			else if(Cost[i-1][j]==Cost[i][j]-C(DNA1.charAt(i-1),' ')){

				dna1 = dna1+ DNA1.charAt(i-1);
				dna2 = dna2+ '_';
				i--;
			}
			else if(Cost[i][j-1]==Cost[i][j]-C(' ',DNA2.charAt(j-1))){

				dna1 = dna1+ '_';
				dna2 = dna2+ DNA2.charAt(j-1);
				j--;
			}
		}
		if(i>0){
			while(i>0){
				dna1 = dna1+ DNA1.charAt(i-1);
				dna2 = dna2+ '_';
				i--;
			}
		}
		else if(j>0){
			while(j>0){
				dna1 = dna1+ '_';
				dna2 = dna2+ DNA2.charAt(j-1);
				j--;
			}
		}
		dna1=new StringBuilder(dna1).reverse().toString();
		dna2=new StringBuilder(dna2).reverse().toString();
		System.out.println(dna1);
		System.out.println(dna2);
				
		RelationFinder relationfinder= new RelationFinder();
		relationfinder.Relations(MatchCost);
	}

}
