
public class CostMatrix extends GeneMatcher{

	public void FillMatrix(String DNA1, String DNA2){
		int m, n;
		m=DNA1.length();
		n=DNA2.length();
		
		
		int[][] Cost=new int[m+1][n+1];
		for(int i=0;i<=m;i++){
			Cost[i][0]=-4*i;
		}
		for(int i=0;i<=n;i++){
			Cost[0][i]=-4*i;
		}
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				
				Cost[i][j]=Math.max(Math.max(Cost[i-1][j-1]+C(DNA1.charAt(i-1),DNA2.charAt(j-1)),Cost[i-1][j]+C(DNA1.charAt(i-1),' ')), Cost[i][j-1]+C(' ',DNA2.charAt(j-1)));
			
			}
		}
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				
				System.out.print(Cost[i][j]+"\t");
			}
			System.out.println("\n");
		}
		Traceback(m,n,Cost, DNA1, DNA2);
		System.out.println(m + " " + n + "\n");
	}
	
}
