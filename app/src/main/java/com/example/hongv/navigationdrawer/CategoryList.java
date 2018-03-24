package com.example.hongv.navigationdrawer;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.hongv.navigationdrawer.adapter.CenterAdapter;
import com.example.hongv.navigationdrawer.model.Center;

import java.util.ArrayList;

/**
 * Created by hongv on 2/27/2018.
 */

public class CategoryList extends Fragment {
    View myView;

    private CenterAdapter centerAdapter;
    private ArrayList<Center> listData;
    private ListView lvData;
    private ImageView imageAddCenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.category_list, container, false);
        return myView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getData();
        initView();
    }

    private  void initView(){
        centerAdapter = new CenterAdapter(listData, getActivity());
        lvData = getView().findViewById(R.id.lvData);
        lvData.setAdapter(centerAdapter);
        centerAdapter.notifyDataSetChanged();
//        lvData.setOnItemClickListener(this);

    }

    private void getData(){
        listData = new ArrayList<>();
        listData.add(new Center(0,"EziEnghlish", "DaNang", "0123456789", R.drawable.ezienghlish, 5));
        listData.add(new Center(1,"Galazy", "DaNang", "0123456789", R.drawable.galaxy, 5));
        listData.add(new Center(2,"Geos", "DaNang", "0123456789", R.drawable.geos, 5));
        listData.add(new Center(3,"Thái Bình Dương", "DaNang", "0123456789", R.drawable.tbd, 5));
        listData.add(new Center(4,"World Win ", "DaNang", "0123456789", R.drawable.workdwin, 5));
        listData.add(new Center(5,"EziEnghlish", "DaNang", "0123456789", R.drawable.ezienghlish, 5));
        listData.add(new Center(6,"Galazy", "DaNang", "0123456789", R.drawable.galaxy, 5));
        listData.add(new Center(7,"Geos", "DaNang", "0123456789", R.drawable.geos, 5));
        listData.add(new Center(8,"Thái Bình Dương", "DaNang", "0123456789", R.drawable.tbd, 5));
        listData.add(new Center(9,"World Win ", "DaNang", "0123456789", R.drawable.workdwin, 5));
    }

}
