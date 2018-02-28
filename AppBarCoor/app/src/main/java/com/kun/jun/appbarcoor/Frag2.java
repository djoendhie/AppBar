package com.kun.jun.appbarcoor;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kun.jun.appbarcoor.R;

public class Frag2 extends Fragment {  @Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View frag2_pesan = inflater.inflate(R.layout.fragment_frag2, container, false);
    return frag2_pesan;
}
}