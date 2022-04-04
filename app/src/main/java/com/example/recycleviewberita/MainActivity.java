package com.example.recycleviewberita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleviewberita.adapter.BeritaAdapter;
import com.example.recycleviewberita.model.BeritaModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvBerita;
    List<BeritaModel> listBerita= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvBerita=findViewById(R.id.rvBerita);
        listBerita.add(new BeritaModel("Orang ini mati 3 kali, ini kata resti","Health","https://assets.pikiran-rakyat.com/crop/0x0:0x0/x/photo/2022/03/30/2810251709.jpg", "DIKIT DIKIT LESTI, DIKIT DIKIT LESTI, APAAN SIH TIKTOK (Begini tanggapan Lesti), BODO AMAT, GA PEDULI GUE"));
        listBerita.add(new BeritaModel("Juara Coding itu mantap, ini kata nining","Lifestyle","https://juaracoding.com/public/dummy/img_pak_paulus.png", "BTW ini pak paulus ya waktu masih muda, meskipun sekarang masih muda, anggep aja dah tua deh"));
        listBerita.add(new BeritaModel("Banci ini ditangkap warga karna tidak banci","Travel","https://cdn0-production-images-kly.akamaized.net/C78TuqRI6EvujNd5nHZApBQ9apw=/1200x900/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3951801/original/052272700_1646356554-Tessy_1.jpg", "Banci di tanggap warga karena bukan banci, setelah di cek jenis kelaminnya, ternyata banci tersebut adalah LAKI-LAKI"));

        BeritaAdapter adapter = new BeritaAdapter(listBerita,MainActivity.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        rvBerita.setLayoutManager(layoutManager);
        rvBerita.setAdapter(adapter);
    }
}