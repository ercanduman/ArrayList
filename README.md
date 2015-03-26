# Odev_Infonal
Infonal firmasının gönderdiği ödevdir.

Merhabalar,

Öncelikle Spring MVC ve MongoDb konularına aşina olmamam ve daha önce bu framework ve db ile uygulama geliştirmemiş olmam dolayısıyla
ödevdeki istediklerinizi tam anlamıyla gerçekleştiremedim. Kodlama bilgim dâhilinde ancak aşağıdaki şekilde bir yöntemle ödevi yapabildim.

Liste yaratırken eklediğim isimler, önceden sistemde kayıtlı olan kullanıcılar olarak düşünülebilir. 

Yaptığım işlemler temel olarak;
- Var olan kayıtlardan index numarasına göre silme 	- listedenSil(int index) metodu. 
- Var olan kayıtları listeleme 				- listeyiGoster() metodu
- Var olan kayıtlara yeni kayıtlar ekleme 	        - ekle(int index, String eklenecekİsim) metodu

Bildiğiniz gibi herhangi bir array dizisine kayıt eklendiğinde genellikle dizinin sonuna ekleniyor ama oluşturduğum ekle(int,string) metodu ile
listenin herhangi bir yerine kayıt eklemek mümkün.

MondoDb veri tabanı kullanamadım, bu yüzden verileri tutabileceğim bir array dizisi oluşturdum. Ama bu dizi sabit olmayıp, index numarasına göre isim silip,
eklenebildiği için dinamik bir dizidir. Scanner class’ının nextInt() metoduyla kullanıcıdan bir index numarası istenmektedir,
bu index numarasına göre isim silmek daha kullanışlı hale gelmiştir. 
Bu yöntem, " Delete * From Musteriler where MusteriNo = ? " kodu ile müşteri tablosundan, girilen müşteri numarasına göre müşteriyi silme mantığıyla aynıdır.

Saygılarımla,

Ercan Duman
