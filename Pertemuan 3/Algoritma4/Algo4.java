import java.util.*;

public class Algo4{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int x, y;

		System.out.print("Masukkan nilai x = ");
		x = sc.nextInt();
		System.out.print("Masukkan nilai x = ");
		y = sc.nextInt();

		if(x < y){
			System.out.print("Nilai " +x+ " lebih kecil dari " +y);
		} else if(x > y){
			System.out.print("Nilai " +x+ " lebih besar dari " +y);
		} else {
			System.out.print("Nilai " +x+ " sama dengan " +y);
		}

	}
}