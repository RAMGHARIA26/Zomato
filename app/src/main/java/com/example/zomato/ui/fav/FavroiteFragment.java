package com.example.zomato.ui.fav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.zomato.R;


public class FavroiteFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       View root = inflater.inflate(R.layout.fragment_favorite,container,false);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}