import java.awt.KeyboardFocusManager;

import java.util.Scanner;





public class Activity_class {



	public static void main(String[] args) {

		KisiListesi listem = new KisiListesi(100);

		listem.listeyeEkle( "Hasan Ali");

		listem.listeyeEkle( "Mehmet");

		listem.listeyeEkle( "Sadık");

		listem.listeyeEkle( "Derya");

		listem.listeyeEkle( "Salim");

		listem.listeyeEkle( "Veli");

		listem.listeyeEkle( "Deniz");

		listem.listeyeEkle( "Sultan");

		listem.listeyiGoster();



		for (int i = 0; i < listem.elemanSayisi; i++) {

			Scanner scan = new Scanner(System.in);

			show();			

			int key = scan.nextInt();

			if (key == 1) {

				listem.listeyiGoster();

				

			}

			else if(key == 2) {

				System.out.print("Silmek istediğiniz elemanın index numarasını giriniz: ");

				int index = scan.nextInt();

				listem.listedenSil(index);



			}

			else if (key == 3) {

				System.out.print("Yeni kayıt için bir index numarası giriniz: ");

				int b = scan.nextInt();

				System.out.print("Yeni kayıt için bir isim giriniz: ");

				String str = scan.next();			

				

				listem.ekle(b,str);

				

			}

			else{

				System.out.println("Yanlış girdiniz! Program sonlandırıldı!");

				System.exit(0);

			}			

		}		

	}

	

	public static void show(){

		System.out.println("\nİlerlemek için yapacağınız işlemi seçin \n"

				+"Listeyi göstermek için    -> 1\n"

				+"Listeden isim silmek için -> 2\n"

				+"Yeni kayıt eklemek için   -> 3 " + "'e tıklayınız!");

	}



}

