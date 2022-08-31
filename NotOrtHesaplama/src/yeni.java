 
import java.util.Scanner;
public class yeni {

	public static void main(String[] args) {
		int mat, fiz, kim, tar;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		mat = input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		fiz = input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		kim = input.nextInt();
		
		System.out.print("Tarih notunuzu giriniz: ");
		tar = input.nextInt();
		
		double ort = (mat + fiz + kim + tar)/4;
		System.out.print("Not ortalamanýz: ");
		System.out.println(ort);
		boolean kosul = ort>=60;
		String str = kosul ? "Sýnýfý Geçti" : "Sýnýfta Kaldý";
		System.out.println(str);
		
		
		

	}

}
