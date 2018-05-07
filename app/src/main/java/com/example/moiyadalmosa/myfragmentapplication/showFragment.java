package com.example.moiyadalmosa.myfragmentapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class showFragment extends Fragment {

    MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.show_info_fragment,container,false);

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textView = view.findViewById(R.id.textView5);

        mainActivity=(MainActivity)getActivity();

        textView.setText(mainActivity.getName());

        mainActivity.addBook(new Book("koashjfg","Categorie Book","Description book",R.drawable.thevigitarian));
        mainActivity.addBook(new Book("koashjfg","Categorie Book","Description book",R.drawable.thevigitarian));
        mainActivity.addBook(new Book("koashjfg","Categorie Book","Description book",R.drawable.thevigitarian));




        RecyclerView myrv = view.findViewById(R.id.recycel_view2);
        RecycelerViewShow myAdapter = new RecycelerViewShow(getContext(),mainActivity.getBookList());
        myrv.setLayoutManager(new GridLayoutManager(getContext(),2));
        myrv.setAdapter(myAdapter);

    }
}
