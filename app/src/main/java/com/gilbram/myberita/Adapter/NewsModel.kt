package com.gilbram.myberita.Adapter

import com.gilbram.myberita.R

data class news(var title:String, var desc:String,var isi:String, var photo:Int)

object NewsModel{
    val newslist = listOf<news>(

        news("Fakta soal Djoko Tjandra, Buron sejak 2009 hingga Memakai Surat Jalan Khusus",
            "KOMPAS | 12 juli 2020",
            "Buron sejak 2009 Dikutip Harian Kompas, (24/2/2000), Direktur PT Era Giat Prima itu dijerat dakwaan berlapis oleh Jaksa Penuntut Umum (JPU) Ridwan Moekiat. Di dakwaan primer, Djoko didakwa telah melakukan tindak pidana korupsi berkaitan dengan pencairan tagihan Bank Bali melalui cessie yang merugikan negara Rp 940 miliar. Mahkamah Agung menjatuhkan hukuman terhadap Djoko dan mantan Gubernur Bank Indonesia Syahril Sabirin, masing-masing dengan pidana penjara selama dua tahun pada 2009. Diberitakan Harian Kompas, (12/6/2009), mereka terbukti secara sah dan meyakinkan bersalah melakukan tindak pidana korupsi dalam perkara pengalihan hak tagih piutang (cessie) Bank Bali. Akan tetapi, Djoko kabur ke Papua Nugini sebelum dieksekusi. Dia menjadi warga negara Papua Nugini pada 2012.",
            R.drawable.imgno1),

        news("pasar ramai pengunjung",  //title
            "KOMPAS | 12 juli 2020",  //desc
            "JAKARTA - Jelang Lebaran, hampir seluruh pasar tradisional tetap ramai meski ada penerapan Pembatasan Sosial Berskala Besar (PSBB). Masyarakat ke pasar untuk berbelanja bahan pokok menyambut Lebaran.Namun, berbeda dengan pasar yang satu ini. Justru sebagian besar toko bahan pangan di Pasar Gondangdia tutup. Berdasarkan pantauan Okezone di lapangan, tutupnya sebagian besar toko bahan pangan di Gondangdia itu sudah berlangsung sejak beberapa minggu lalu",
            R.drawable.img_news1), //photo

        news("kapal nelayan menyalurkan bantuan",
            "KOMPAS | 12 juli 2020",
            "Bantuan Sarana Peralatan tangkap ikan dari Kementerian Kelautan dan Perikanan itu bertujuan untuk meningkatkan pendapatan kelompok\n" +
                    "usaha bersama nelayan di Kabupaten Biak Numfor untuk menunjang operasional sentra kelautan dan perikanan.\n" +
                    "Biak. Kementerian Kelautan dan Perikanan(KKP) Menyalurkan bantuan sarana alat tangkap berupa 50 Unit perahu beserta alat tangkap pancing ikan\n" +
                    "kepada nelayan di Kabupaten Biak Numfor, Papua.\n" +
                    "Bantuan secara Simbolis alat tangkap ikan itu diserahkan oleh kasubdit Kewirausahaan dan kelembagaan Direktorat Usaha dan Investasi Ditjen PDSPKP\n",
            R.drawable.img_news2),


        news("kepadatan Penduduk di Wilayah Dki Jakarta Mencapai Lebih Dari 10 Juta lebih Orang",
            "KOMPAS | 12 juli 2020",
            "Berdasarkan data Badan Pusat Statisik, jumlah penduduk DKI Jakartapada 2015 mencapai 10,18 juta jiwa. Kemudian meningkat menjadi 10,28 juta jiwa pada 2016, dan bertambah menjadi 10,37 juta jiwa pada 2017. Artinya, selama dua tahun terkahir jumlah penduduk di Ibu Kota bertambah 269 jiwa setiap hari atau 11 orang per jam. Adapun wilayah dengan populasi terbanyak adalah Jakarta Timur dengan jumlah penduduk mencapai 2,89 juta jiwa, diikuti Jakarta Barat (2,53 juta jiwa) dan Jakarta Selatan (2,23 juta jiwa). Lalu Jakarta Utara (1,78 juta jiwa), Jakarta Pusat (921 ribu jiwa), serta Kabupaten Kepulauan Seribu (24 ribu jiwa). Sementara rasio perbandingan penduduk laki-laki dan perempuan di Jakarta pada tahun lalu mencapai 100,61. Artinya jumlah penduduk laki-laki di Jakarta lebih banyak dibanding perempuan. Jumlah penduduk Jakarta tersebut berdasarkan proyeksi Sensus Penduduk 2010.",
            R.drawable.img_news3),

        news("Jalan di Tol Cikampek Macet Parah",
            "KOMPAS | 12 juli 2020u",
            "JAKARTA, KOMPAS.com - Arus lalu lintas di jalan Tol Jakarta-Cikampek mengarah ke Jakarta terpantau padat sejak pagi tadi. Arus kendaraan bahkan sesekali tidak bergerak. Corporate Communication & Community Development Group Head PT Jasa Marga (Persero) Dwimawan Heru mengatakan, potensi kemacetan akibat genangan terjadi di Km 24+000 arah Jakarta. Dalam upaya mengurainya, diberlakukan rekayasa lalu lintas contraflow Saat ini Jasa Marga atas diskresi Kepolisian memberlakukan contraflow mulai dari Cikarang Barat Km 29 s.d. Cibitung Km 23+800 arah Jakarta sejak pukul 08.15 WIB katanya melalui keterangan resmi, Jakarta, Kamis (2/1/2020)",
            R.drawable.img_news4),

        news("Dukung jakarta perangi covid,sampoerna donasi ventilator dan APD full aset",
            "KOMPAS | 12 juli 2020",
            "Jakarta - Sejumlah pemerintah daerah memberikan apresiasi atas bantuan PT HM Sampoerna Tbk. (Sampoerna) dalam membantu pemerintah untuk menekan laju penularan COVID-19, baik di tingkat nasional maupun daerah.\n" +
                    "Kali ini dengan menyerahkan donasi berupa 14 unit alat bantu pernapasan buatan atau ventilator, 45.000 masker, 4.000 baju hazmat, 600 set alat pelindung diri (APD), dan 900 unit pelindung wajah (face shield) kepada Pemerintah Provinsi Jawa Timur yang diwakili oleh Gubernur Khofifah Indar Parawansa, Pemerintah Kota Surabaya yang diwakili oleh Wali Kota Tri Rismaharini, dan Pemerintah Provinsi Jawa Barat yang diwakili oleh Gubernur Ridwan Kamil.\n" +
                    "Gubernur Jawa Timur Khofifah Indar Parawansa mengatakan, bantuan tersebut membantu penanganan COVID-19 di wilayahnya. Pada Kamis (21/5) lalu, Sampoerna memberikan tiga unit ventilator, 5.000 masker, 1.000 baju hazmat, 100 set APD, dan 100 unit pelindung wajah kepada Pemprov Jatim melalui Yayasan Rumah Kita.\n" +
                    "\n",
            R.drawable.img_news5),

        news("Corona Makin Ganas di AS, Bos FB Kecewa dengan Kinerja Donald Trump",
        "KOMPAS | 12 juli 2020",
        "Jakarta - CEO Facebook (FB), Mark Zuckerberg, mengungkapkan kekecewaannya terhadap penanganan wabah COVID-19 oleh Presiden Donald Trump. Hal ini ia akui saat melakukan percakapan video dengan ahli penyakit infeksi dan anggota gugus tugas COVID-19 Dr Anthony Fauci.\n" +
                "\"Saat ini, sudah jelas Amerika Serikat berada pada jalur yang lebih parah dibandingkan banyak negara lain. Administrasi pemerintahan ini kurang efektif menghadapi wabah,\" kata Zuckerberg seperti dikutip dari CNBC, Jumat (17/7/2020).",
             R.drawable.a)



    )
}
