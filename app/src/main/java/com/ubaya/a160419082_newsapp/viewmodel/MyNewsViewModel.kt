package com.ubaya.a160419082_newsapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.a160419082_newsapp.model.MyNews

class MyNewsViewModel:ViewModel() {
    val myNewsLD = MutableLiveData<List<MyNews>>()
    val loadingErrorLD = MutableLiveData<Boolean>()
    val loadingDoneLD = MutableLiveData<Boolean>()

    fun refresh(){
        val myNews1 = MyNews("Herliansyah Bagus","UBAYA adalah Kampus Nomor 1 di Indonesia!","Universitas Surabaya baru-baru ini memperoleh predikat sebagai kampus terbaik nomor 1 di Indonesia. Hal tersebut membuat para mahasiswa yang berkuliah di ubaya menjadi sangat bangga atas didapatkannya predikat tersebut.","https://maukuliah.id/blog/wp-content/uploads/2021/06/ubaya-teknik.jpg")
        val myNews2 = MyNews("Herliansyah Bagus","Jakarta Catat Kasus Positif Covid-19 Tertinggi Hari Ini","Provinsi DKI Jakarta mencatat kasus positif Covid-19 tertinggi per Senin (4/10) hari ini, yakni 149 kasus.\nTotal kasus positif di DKI mencapai 858.347 kasus.","https://akcdn.detik.net.id/visual/2021/09/14/vaksinasi-warga-binaan-panti-sosial-5_169.jpeg?w=650")
        val myNews3 = MyNews("Herliansyah Bagus","Dihajar Corona, Jumlah Pasien ICU\ndi Singapura Naik Terus!","Jumlah pasien di unit perawatan intensif (ICU) di ru-\nmah sakit umum di Singapura tercatat mengalami kenaikan dari 26 persen menjadi 53 persen\ndalamtiga bulan terakhir. Kenaikan itu tercatat saat\njumlah kasus virus Corona (COVID-19) di Singapura mengalami 'lonjakan eksponensial'.","https://akcdn.detik.net.id/community/media/visual/2021/09/30/corona-menggila-kasus-harian-covid-19-singapura-melampaui-indonesia-4_169.jpeg?w=700&q=90")

        myNewsLD.value = arrayListOf<MyNews>(myNews1,myNews2,myNews3)
        loadingErrorLD.value = false
        loadingDoneLD.value = true
    }
}