package com.kun.jun.appbarcoor;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;



public class Frag1 extends Fragment {
    private ArrayList Merek;
    //Daftar Teman
    private String[] Judul = {"Wildan", "Taufan", "Aish", "Ferdi", "Taufik", "Dzaki", "Annisa",
            "Diki","Sinta","Agung","Andita","Dirham","Fadhil","Azis","Mukiidi","Tata"};

 ArrayList arrayList = new ArrayList<String>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_frag1, container, false);
        Merek = new ArrayList<>();
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        RecyclerView.Adapter adapter = new RecyclerViewAdapter(Merek) {

            @Override
            public int getItemCount() {
                return arrayList.size();
            }
        };


        //Membuat Underline pada Setiap Item Didalam List
        DividerItemDecoration itemDecoration = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL);
        itemDecoration.setDrawable(ContextCompat.getDrawable(getContext(), R.mipmap.ic_launcher));
        recyclerView.addItemDecoration(itemDecoration);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
        return view;
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        Merek.addAll(Arrays.asList(Judul));
    }
}
