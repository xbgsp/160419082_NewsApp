package com.ubaya.a160419082_newsapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.a160419082_newsapp.model.MyNews

class MyNewsViewModel:ViewModel() {
    val myNewsLD = MutableLiveData<List<MyNews>>()
    val loadingErrorLD = MutableLiveData<Boolean>()
    val loadingDoneLD = MutableLiveData<Boolean>()

    fun refresh(){
        val myNews1 = MyNews("Herliansyah Bagus",
                               "UBAYA adalah Kampus Nomor 1 di Indonesia!",
                          "Universitas Surabaya baru-baru ini memperoleh\npredikat sebagai kampus terbaik nomor 1 di\nIndonesia. Hal tersebut membuat para mahasiswa\nyang berkuliah di ubaya menjadi sangat bangga\natas didapatkannya predikat tersebut.",
                                "https://maukuliah.id/blog/wp-content/uploads/2021/06/ubaya-teknik.jpg")
        val myNews2 = MyNews("Herliansyah Bagus",
                               "Pasukan Keamanan Taliban Tangkap\n11 Militan Terkait ISIS",
                          "Pasukan keamanan Taliban dilaporkan menangkap\n11 militan terkait kelompok radikal Islamic State\nof Iraq and Syria (ISIS) di Afghanistan. Para militan\nitu ditangkap di wilayah ibu kota Kabul, yang kini\ndikuasai kelompok Taliban.",
                                "https://akcdn.detik.net.id/community/media/visual/2021/09/24/ancang-ancang-taliban-kembali-terapkan-hukuman-potong-tangan-kaki-3_169.jpeg?w=700&q=90")
        val myNews3 = MyNews("Herliansyah Bagus",
                               "WhatsApp Down, Signal Kedatangan Jutaan Pengguna Baru",
                          "Tumbangnya WhatsApp selama lebih berjam-jam membuat dua miliar penggunanya di seluruh dunia\nsulit berkomunikasi. Pengguna yang tidak sabar\nmenunggu layanan WhatsApp pulih langsung \nberpindah ke platform lain, salah satunya Signal.",
                                "https://akcdn.detik.net.id/community/media/visual/2021/01/12/aplikasi-signal_169.jpeg?w=700&q=90")

        myNewsLD.value = arrayListOf<MyNews>(myNews1,myNews2,myNews3)
        loadingErrorLD.value = false
        loadingDoneLD.value = true
    }
}