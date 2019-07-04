import java.util.*;

public class Algo2{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int a;

		System.out.print("masukkan nilai sembarang = ");
		a = sc.nextInt();

		if((a % 2) == 0){
			System.out.println("Nilai " +a+ " Adalah genap");
		} else {
			System.out.println("Nilai " +a+ " Adalah ganjil");
		}
	}
}