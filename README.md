# ArrayList
Burada bir array isim listesi oluşturup, veritabanı işlemlerini yapmaya çalışmıştım :)

Liste yaratırken eklediğim isimler, önceden sistemde kayıtlı olan kullanıcılar olarak düşünülebilir. 

Yaptığım işlemler temel olarak;
- Var olan kayıtlardan index numarasına göre silme 	- listedenSil(int index) metodu. 
- Var olan kayıtları listeleme 				- listeyiGoster() metodu
- Var olan kayıtlara yeni kayıtlar ekleme 	        - ekle(int index, String eklenecekİsim) metodu

Bildiğiniz gibi herhangi bir array dizisine kayıt eklendiğinde genellikle dizinin sonuna ekleniyor ama oluşturduğum ekle(int,string) metodu ile listenin herhangi bir yerine kayıt eklemek mümkün.

Bu yüzden verileri tutabileceğim bir array dizisi oluşturdum. Ama bu dizi sabit olmayıp, index numarasına göre isim silip,
eklenebildiği için dinamik bir dizidir diye düşünüyorum. 

Scanner class’ının nextInt() metoduyla kullanıcıdan bir index numarası istenmektedir, bu index numarasına göre isim silmek daha kullanışlıdır. 

Bu yöntem, "delete * From Musteriler where MusteriNo = ? " kodu ile müşteri tablosundan, girilen müşteri numarasına göre müşteriyi silme mantığıyla aynıdır.


Ercan Duman
Computer Engineer
ercanduman30@gmail.com
