
public class LoopsLearning {

	public static void main(String[] args) {
		
		LoopsLearning obj = new LoopsLearning(); 
		obj.MirrorRightAngledtriangle(4);
		System.out.println();
		obj.SymmetricTriangle(4);
		System.out.println();
		obj.InvertedTriangle(4);

	}

	public void MirrorRightAngledtriangle(int n) {
		
		for (int i=1;i<=n;i++)
		{
			for(int j=(n-i);j>=1;j--)
				System.out.print(" ");
			
			for(int k=i;k>=1;k--)
				System.out.print("*");
			
			System.out.println();		
		}	
	}
	
	
	public void SymmetricTriangle(int n) {
		
		for (int i=1;i<=n;i++)
		{
			for(int j=(n-i);j>=1;j--)
				System.out.print(" ");
			
			for(int k=i;k>=1;k--)
				System.out.print("* ");
			
			System.out.println();		
		}	
	}
	
	public void InvertedTriangle(int n) {
		
		for (int i=1;i<=n;i++)
		{
			for(int j=(2*n-1);j>=i;j--)
				System.out.print("*");
			
			for(int k=1;k<i;k++)
				System.out.print(" ");
			
			System.out.println();		
		}	
	}
	
}
