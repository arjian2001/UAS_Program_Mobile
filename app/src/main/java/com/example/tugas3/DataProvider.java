package com.example.tugas3;
import android.content.Context;

import com.example.tugas3.model.Kambing;
import com.example.tugas3.model.Ayam;
import com.example.tugas3.model.Kuda;
import com.example.tugas3.model.Hewan;
import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    public static List initDataKuda(Context ctx) {
        List<Kuda> kudas = new ArrayList<>();
        kudas.add(new Kuda("Kuda Arab", "Arab",
                "Kuda arab adalah salah satu jenis ras kuda yang berasal dari daerah Arab, dipelihara orang untuk berbagai keperluan", R.drawable.kudaarab));
        kudas.add(new Kuda("Kuda Mustang", "Amerika Utara",
                "Mustang adalah kuda berkeliaran bebas di Amerika Serikat bagian Barat, diturunkan dari kuda yang dibawa ke Amerika oleh Spanyol.", R.drawable.kudamustang));
        kudas.add(new Kuda("Kuda Islandia", "Islandia",
                "Kuda Islandia adalah jenis kuda yang dikembangkan di Islandia. Meskipun kuda-kudanya kecil, terkadang seukuran kuda poni", R.drawable.kudaislandia));
        kudas.add(new Kuda("Kuda Breton", "Prancis",
                "Trait Breton adalah jenis kuda rancangan Prancis. Ini berasal dari Brittany, di barat laut Prancis, dari persilangan kuda lokal dengan berbagai ras lainnya. Ini kuat dan berotot, dan sering memiliki mantel kastanye.", R.drawable.kudabreton));
        kudas.add(new Kuda("Kuda Gipsi", "Irlandia",
                "Kuda Gipsi atau Vanner Gipsi, adalah jenis atau jenis kuda domestik dari pulau-pulau Inggris Raya dan Irlandia", R.drawable.kudagipsi));
        kudas.add(new Kuda("Kuda Shire", "Inggris",
                "Shire adalah jenis kuda penarik Inggris. Biasanya berwarna hitam, bay, atau abu-abu. ", R.drawable.kudashire));
        return kudas;
    }

    public static List initDataKambing(Context ctx) {
        List<Kambing> kambings = new ArrayList<>();
        kambings.add(new Kambing("Kambing Boer", "Afrika Selatan",
                "Kambing boer adalah kambing yang berasal dari Afrika Selatan dan telah menjadi ternak yang teregistrasi selama lebih dari 65 tahun. Kata Boer artinya petani.", R.drawable.kambingboer));
        kambings.add(new Kambing("Kambing Spanyol", "Spanyol ",
                "Kambing Spanyol, dikenal juga dengan istilah kambing sikat atau kambing semak. Mereka berasal dari Spanyol melalui Meksiko ke Amerika Serikat", R.drawable.kambingspanyol));
        kambings.add(new Kambing("Kambing Alpen", "Prancis",
                "Kambing Alpen merupakan jenis kambing yang dikategorikan dalam ukuran sedang hingga besar. Kambing ini diketahui memiliki kualitas susu yang sangat baik", R.drawable.kambingalpin));
        kambings.add(new Kambing("Kambing kinder", "USA",
                "Kinder adalah jenis kambing domestik Amerika. Berasal dari sebuah peternakan di Snohomish, Washington, di mana pada sekitar tahun 1985 seekor sapi kerdil Amerika dikawinkan silang dengan Nubian", R.drawable.kambingkinder));
        kambings.add(new Kambing("Kambing Kiko", "Selandia Baru",
                "Kambing Kiko merupakan hasil persilangan yang dilakukan oleh peternak dari Selandia Baru yang bernama Garrick dan Anne Batten", R.drawable.kambingkiko));
        kambings.add(new Kambing("Saanen", "Swiss",
                "Kambing saanen adalah kambing yang berasal dari lembah Saanen, Swiss babak barat. Adalah salah satu jenis kambing terbesar di Swiss dan penghasil susu kambing yang terkenal. Kambing ini sulit mengembang di wilayah tropis karena kepekaannya terhadap matahari. ", R.drawable.kambingsaanen));
        return kambings;
    }

    public static List initDataAyam(Context ctx) {
        List<Ayam> ayam = new ArrayList<>();
        ayam.add(new Ayam("Ayam Kapas", "Tiongkok",
                "Ayam kapas adalah salah satu jenis ayam hias yang memiliki bentuk yang lucu. Bulunya unik, menyerupai kapas sehingga menarik untuk dipelihara.", R.drawable.ayamkapas));
        ayam.add(new Ayam("Brahma", "Amerika Serikat ",
                "Ayam Brahma merupakan ayam hasil dari perkawinan silang antara ayam cochin dan ayam melayu.", R.drawable.ayambrahma));
        ayam.add(new Ayam("Leghorn", "Italia",
                "Leghorn termasuk salah satu galur ayam petelur tertua di Eropa. Berasal dari daerah Livorno, sebuah kota pelabuhan di Italia.", R.drawable.ayamleghorn));
        ayam.add(new Ayam("Polandia", "Polandia",
                "Ayam poland merupakan jenis ayam bulu jambul Eropa yang populer sebab memiliki mahkota bulu yang luar cantik pada bagian kepalanya", R.drawable.ayampolandia));
        ayam.add(new Ayam("Kedu", "Indonesia",
                "Ayam kedu adalah ayam asli Indonesia yang berwarna hitam di sekujur tubuhnya", R.drawable.ayamkapas));
        ayam.add(new Ayam("Andalusia", "Spanyol",
                "Ayam Andalusia merupakan jenis ayam yang berasal dari Andalusian, atau lebih tepatnya adalah negara bagian Spanyol ", R.drawable.ayamandalusia));
        return ayam;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKuda(ctx));
        hewans.addAll(initDataKambing(ctx));
        hewans.addAll(initDataAyam(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}