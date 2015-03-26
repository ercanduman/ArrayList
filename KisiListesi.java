import java.util.Scanner;





public class KisiListesi {

	String [] liste;

	int elemanSayisi;

	int listeKapasitesi;

	

	public KisiListesi(int kapasite){

		listeKapasitesi = kapasite;

		elemanSayisi = 0;

		liste = new String[kapasite];

	}

	

	public void listeyeEkle(String eklenecekOge) {

		//String eklenecekOge;

		if(elemanSayisi < listeKapasitesi){

		liste[elemanSayisi] = eklenecekOge;

		elemanSayisi++;

		}

		else System.out.println("Liste dolu!");

	}

	

	public void listeyiGoster(){

		

		String cikis = "İsim Listesi \t";

		for(int i = 0; i < liste.length; i++) {

			 if(liste[i] != null)

				 cikis += "\n"+i+" -> "+liste[i];

				 }

		System.out.println(cikis);

		

	}

	

	public void ekle(int index, String eklenecekİsim){

		

		if (index <= elemanSayisi && index >=0) {

			for (int i = elemanSayisi - 1; i >= index; i--) {

				liste[i+1] = liste[i];

			}

			liste[index] = eklenecekİsim;

			elemanSayisi++;

			

		}

		else System.out.println("Yanlış index girdiniz!");

		listeyiGoster();

	}

	

	public void listedenSil(int index){

		if (index <= elemanSayisi-1 && index >=0 && elemanSayisi > 0) {

			for (int i = index; i < elemanSayisi; i++) {

				liste[i] = liste[i+1];

			}

			elemanSayisi--;

		}else System.out.println("Hata!");

	

		listeyiGoster();

	}



	

}

