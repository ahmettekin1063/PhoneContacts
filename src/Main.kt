fun main() {

    while (true){

        println("**************Hoşgeldiniz***************")
        println("1--> Tüm Kişileri Listele")
        println("2--> Yeni Kişi Ekle")
        println("3--> Kişi Güncelle")
        println("4--> Kişi Sil")
        println("5--> Çıkış")
        val secim = readLine()?.toInt()

        when(secim){

            1-> {
                CepTelefonu.kisiListele()
            }
            2->{
                print("eklenecek kişi adı: ")
                val kisiAdi= readLine()
                print("eklenecek kişi tel no: ")
                val kisiTel= readLine()?.toInt()
                val eklenecekKisi=Kisi(kisiTel, kisiAdi)
                CepTelefonu.kisiEkle(eklenecekKisi)
            }
            3->{
                println("Güncellenecek Kişiyi seçiniz")
                CepTelefonu.kisiListele()
                val guncellenecekKisiId= readLine()?.toInt()
                println("Yeni ad: ")
                val yeniKisiAd= readLine()
                println("Yeni Tel: ")
                val yeniKisiTel= readLine()?.toInt()
                val yeniKisi = Kisi(yeniKisiTel,yeniKisiAd)
                CepTelefonu.kisiGuncelle(guncellenecekKisiId, yeniKisi)
            }
            4-> {
                print("silinecek kişiyi seçiniz: ")
                CepTelefonu.kisiListele()
                val silinecekKisiId= readLine()?.toInt()
                CepTelefonu.kisiSil(silinecekKisiId)
            }
            5-> break
        }
    }
}