object CepTelefonu {

    private var kisiListesi: ArrayList<Kisi> = ArrayList()

    fun kisiListele() {

        if (kisiListesi.size == 0) println("Kişi listeniz boş!!!")
        else {
            for (i in kisiListesi.indices) {
                println("${i + 1}-->Ad : ${kisiListesi.get(i).isim} No: ${kisiListesi.get(i).telNo}")
            }
        }
    }

    fun kisiEkle(eklenecekKisi: Kisi) {

        if (!kisiListesi.contains(eklenecekKisi))
        {
            kisiListesi.add(eklenecekKisi)
            println("kişi eklendi")
        }
        else{
            println("kişi zaten var")
        }
    }

    fun kisiGuncelle(guncellenecekKisiId: Int?, yeniKisi: Kisi) {

        kisiListesi.set((guncellenecekKisiId!! - 1), yeniKisi)
        println("kişi güncellendi")
    }

    fun kisiSil(silinecekKisiId: Int?) {
        kisiListesi.removeAt(silinecekKisiId!! - 1)
        println("kişi silindi")
    }
}