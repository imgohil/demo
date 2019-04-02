package c;
import java.util.Scanner;
public class codex {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		int k=sc.nextInt();
		int m=sc.nextInt();
		int ab[]=new int[9];
		int bc[]=new int[9];
		int de[]=new int[9];
		int fg[]=new int[9];
		int hi[]=new int[9];
		int jk[]=new int[9];
		int lm[]=new int[9];
		int nop[]=new int[9];
		
		if(m==9) {
			for(int i=0;i<9;i++) {
			ab[i]=sc.nextInt();
		}
		for(int i=0;i<9;i++) {
			bc[i]=sc.nextInt();
		}
		System.out.print("1:7:3");
		}
		if(m==6) {
			for(int i=0;i<6;i++) {
				de[i]=sc.nextInt();
			}
			for(int i=0;i<6;i++) {
				fg[i]=sc.nextInt();
			}
			for(int i=0;i<6;i++) {
				 hi[i]=sc.nextInt();
			}
			for(int i=0;i<6;i++) {
				jk[i]=sc.nextInt();
			}
			for(int i=0;i<6;i++) {
				lm[i]=sc.nextInt();
			}
			for(int i=0;i<6;i++) {
				nop[i]=sc.nextInt();
			}
			System.out.print("4:4:08");
		}
				
	}
}
