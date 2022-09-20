package com.firstapp.custom_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends BaseAdapter {

    Context context;
    List<UserPojo> userPojoList=new ArrayList<>();
    LayoutInflater layoutInflater;

    public GridAdapter(Context context,List<UserPojo> userPojoList){
        this.context=context;
        this.userPojoList=userPojoList;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return userPojoList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View root=layoutInflater.inflate(R.layout.activity_custom_gird_view1,null);
        ImageView imageView=root.findViewById(R.id.picture_id);
        TextView name=root.findViewById(R.id.picture_name);
        TextView age=root.findViewById(R.id.picture_age);
        TextView price=root.findViewById(R.id.picture_price);
        TextView weigth=root.findViewById(R.id.picture_weight);


        name.setText(userPojoList.get(i).getName());
        age.setText(userPojoList.get(i).getAge());
        price.setText(userPojoList.get(i).getPrice());
        weigth.setText(userPojoList.get(i).getWeight());


        imageView.setImageResource(userPojoList.get(i).getImage());


        return root;
    }
}
