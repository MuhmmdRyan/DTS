import java.util.*;

public class Algo1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int x = 1;
		int y = 1;
		
		System.out.print("Masukkan Nilai a = ");
		
		a = sc.nextInt();
		while(y != a){
			x++;
			y= x * x;

		}
		System.out.print("Nilai akar =" + x);
	}
	

}