package com.hotdeals.hotdeals.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v7.appcompat.R;

import com.hotdeals.hotdeals.adaptors.DealsAdaptor;

import java.util.ArrayList;

/**
 * Created by confiz-2349 on 08/11/15.
 */
public class DealsActivity extends Fragment {
    ListView lv;

    ArrayList dealsListNames;
    public static int [] dealsImages={R.drawable.abc_btn_radio_material, R.drawable.abc_ic_menu_paste_mtrl_am_alpha,R.drawable.abc_ic_menu_paste_mtrl_am_alpha,R.drawable.abc_ic_menu_paste_mtrl_am_alpha,R.drawable.abc_ic_menu_paste_mtrl_am_alpha,R.drawable.abc_ic_menu_paste_mtrl_am_alpha,R.drawable.abc_ic_menu_paste_mtrl_am_alpha,R.drawable.abc_ic_menu_paste_mtrl_am_alpha,R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public static String [] dealsList={"Deal 1","Deal 2","Deal 3","Deal 4","Deal 5","Deal 6","Deal 7","Deal 8"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(com.hotdeals.hotdeals.R.layout.deals_layout, container, false);
        ListView list = (ListView) view.findViewById(com.hotdeals.hotdeals.R.id.deals_listView);

        list.setAdapter(new DealsAdaptor(this, dealsList, dealsImages));
        return view;
    }
}
