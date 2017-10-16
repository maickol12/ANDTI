package com.example.mand.calculadoraricardo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MAND on 13/10/2017.
 */

public class Frag extends Fragment {
    public static Frag newInstance(int page,String tittle){
        Frag f = new Frag();
        Bundle b = new Bundle();
        b.putInt("page",page);
        b.putString("tittle",tittle);
        f.setArguments(b);
        return f;
    }
    public int page;
    public String tittle;
    public void onCreate(Bundle b){
        super.onCreate(b);
        page = getArguments().getInt("page");
        tittle = getArguments().getString("tittle");

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle b){
        View v;

        switch (page){
            case 0:
                v = inflater.inflate(R.layout.frag,container,false);
                break;
            case 1:
                v = inflater.inflate(R.layout.frag2,container,false);
                break;
            default:
                v = inflater.inflate(R.layout.frag,container,false);
                break;
        }

        return v;
    }
}
