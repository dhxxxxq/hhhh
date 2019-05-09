package com.example.a17630.mypingban;


import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 17630 on 2019/3/26.
 */

public class LeftFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container){
        View view=inflater.inflate(R.layout.left_fragment,container,false);
        //container; 是返回的对象，false是返回的类型，false为返回类型为view类型
        return view;
    }


}
