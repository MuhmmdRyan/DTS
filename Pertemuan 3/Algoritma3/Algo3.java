import java.util.*;

public class Algo3{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		double phi = 3.14;
		double r;
		double luas, keliling;

		System.out.print("Masukkan Jari - jari = ");
		r = sc.nextDouble();

		luas = phi * (r * r);
		keliling = 2 * phi * r;

		System.out.println("Luas Lingkaran = " + luas);
		System.out.println("Luas Keliling = " + keliling);
	}
}