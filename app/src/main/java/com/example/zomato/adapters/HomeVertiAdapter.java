package com.example.zomato.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.zomato.models.HomeVertiModel;

import com.example.zomato.R;

import org.w3c.dom.Text;

import java.util.List;

public class HomeVertiAdapter extends RecyclerView.Adapter<HomeVertiAdapter.MaViewHolder> {
    Context context;
    List<HomeVertiModel> list;

    public HomeVertiAdapter(Context context, List<HomeVertiModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HomeVertiAdapter.MaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.home_vertical_lyt,parent,false);

        return new MaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeVertiAdapter.MaViewHolder holder, int position) {
        holder.productImage.setImageResource(list.get(position).getProductItemImage());
        holder.productName.setText(list.get(position).getProductName());
        holder.productRate.setText(list.get(position).getProductRate());
        holder.productInfo.setText(list.get(position).getProductInfo());




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MaViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        ImageView productOverlay;
        TextView productInfo;
        TextView productRate;
        TextView productName;

        public MaViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.productItemImage);
            productOverlay = itemView.findViewById(R.id.imageView3);
            productName = itemView.findViewById(R.id.productNameText);
            productRate = itemView.findViewById(R.id.moneyText);
            productInfo = itemView.findViewById(R.id.productInfoText);


        }
    }
}
