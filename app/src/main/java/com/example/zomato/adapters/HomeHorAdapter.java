package com.example.zomato.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zomato.R;
import com.example.zomato.SelectListner;
import com.example.zomato.models.HomeHorModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.MyViewHolder> {
    List<HomeHorModel> list;
    Context context;
    SelectListner selectListner;


    public HomeHorAdapter(Context context, List<HomeHorModel> list,SelectListner selectListner) {
        this.context = context;
        this.list = list;
        this.selectListner = selectListner;
    }

    @NonNull
    @Override
    public HomeHorAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recyle_view_hori_image,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeHorAdapter.MyViewHolder holder, int position) {
        holder.imageHori.setImageResource(list.get(position).getImage());
        holder.textHori.setText(list.get(position).getText());
        int raw = position;
        holder.cardViewHori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectListner.onItemClicked(list.get(raw));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textHori;
        ImageView imageHori;
        CardView cardViewHori;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textHori = itemView.findViewById(R.id.textHori);
            imageHori = itemView.findViewById(R.id.imageHori);
            cardViewHori = itemView.findViewById(R.id.cardViewHori);
        }
    }
}
