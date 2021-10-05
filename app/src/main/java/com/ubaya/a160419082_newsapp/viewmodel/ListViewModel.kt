package com.ubaya.a160419082_newsapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.a160419082_newsapp.model.News

class ListViewModel:ViewModel() {
    val newsLD = MutableLiveData<List<News>>()
    val loadingErrorLD = MutableLiveData<Boolean>()
    val loadingDoneLD = MutableLiveData<Boolean>()

    fun refresh(){
        val news1 = News("Herliansyah Bagus","El Clasico Barcelona VS Real Madrid Tanpa Messi dan Ramos!","El Clasico edisi pertama di La Liga musim ini terjadi pada jornada ke-10. Barcelona akan lebih dulu bertindak sebagai tuan rumah dengan menjamu Real Madrid di Camp Nou, 24 Oktober 2021.","https://cdn.timesmedia.co.id/images/2021/04/10/Duel-El-Clasico.jpg")
        val news2 = News("Alexander Calvin","Jakarta Catat Kasus Positif Covid-19 Tertinggi Hari Ini","Provinsi DKI Jakarta mencatat kasus positif Covid-19 tertinggi per Senin (4/10) hari ini, yakni 149 kasus.\nTotal kasus positif di DKI mencapai 858.347 kasus.","https://akcdn.detik.net.id/visual/2021/09/14/vaksinasi-warga-binaan-panti-sosial-5_169.jpeg?w=650")
        val news3 = News("Annisa Isna M","Dihajar Corona, Jumlah Pasien ICU\ndi Singapura Naik Terus!","Jumlah pasien di unit perawatan intensif (ICU) di ru-\nmah sakit umum di Singapura tercatat mengalami kenaikan dari 26 persen menjadi 53 persen\ndalamtiga bulan terakhir. Kenaikan itu tercatat saat\njumlah kasus virus Corona (COVID-19) di Singapura mengalami 'lonjakan eksponensial'.","https://akcdn.detik.net.id/community/media/visual/2021/09/30/corona-menggila-kasus-harian-covid-19-singapura-melampaui-indonesia-4_169.jpeg?w=700&q=90")
        val news4 = News("Risqi Wahyu Permana","Facebook, WhatsApp dan Instagram Sempat Tumbang, Apa Penyebabnya?","Layanan media sosial Facebook, WhatsApp, dan Instagram kembali berfungsi setelah sempat menga-\nlami gangguan hampir enam jam, kata Facebook.\nKetiga layanan tersebut dimiliki oleh Facebook\ndan tidak dapat diakses melalui web atau aplikasi smartphone.","https://static.independent.co.uk/2021/03/19/17/instagram%20down%20facebook%20whatsapp.jpg?width=1200&auto=webp&quality=75")

        newsLD.value = arrayListOf<News>(news1,news2,news3,news4)
        loadingErrorLD.value = false
        loadingDoneLD.value = true
    }
}