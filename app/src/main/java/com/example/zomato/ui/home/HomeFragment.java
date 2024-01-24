package com.example.zomato.ui.home;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.zomato.R;
import com.example.zomato.SelectListner;
import com.example.zomato.adapters.HomeHorAdapter;
import com.example.zomato.adapters.HomeVertiAdapter;
import com.example.zomato.models.HomeHorModel;
import com.example.zomato.models.HomeVertiModel;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment  implements SelectListner {
    RecyclerView recyclerViewHori;
    RecyclerView vertiRecycleView;
    List<HomeHorModel> list;
    List<HomeVertiModel> listPizzaVer;
    List<HomeVertiModel> listNorthIndian;
    List<HomeVertiModel> listBurger;
    List<HomeVertiModel> listMomos;
    HomeHorAdapter homeHorAdapter;
    HomeVertiAdapter homeVertiAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home,container,false);
        recyclerViewHori = root.findViewById(R.id.hor_recycleView);
        list = new ArrayList<>();
        list.add(new HomeHorModel(R.drawable.vegan_pepperoni_pizza,"Pizza"));
        list.add(new HomeHorModel(R.drawable.burger,"Burger"));
        list.add(new HomeHorModel(R.drawable.fried_chicken_momos,"Momos"));
        list.add(new HomeHorModel(R.drawable.northinidan,"NorthIndian"));
        homeHorAdapter = new HomeHorAdapter(getActivity(),list,this::onItemClicked);
        recyclerViewHori.setAdapter(homeHorAdapter);
        recyclerViewHori.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        listPizzaVer = new ArrayList<>();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }


    @Override
    public void onItemClicked(HomeHorModel homeHorModel) {
           String itemName = homeHorModel.getText();
           switch (itemName) {
               case "NorthIndian":
                   listNorthIndian.add(new HomeVertiModel(R.drawable.rarha_thali,"Rarha Thali 1","Mix veg and other Dals","20$"));
                   listNorthIndian.add(new HomeVertiModel(R.drawable.rarha_thali,"Rarha Thali 2","Mix veg and other Dals","20$"));
                   listNorthIndian.add(new HomeVertiModel(R.drawable.rarha_thali,"Rarha Thali 3","Mix veg and other Dals","20$"));
                   Toast.makeText(getActivity(), "Pizza", Toast.LENGTH_LONG).show();
                   homeVertiAdapter = new HomeVertiAdapter(getActivity(),listNorthIndian);
                   vertiRecycleView.setAdapter(homeVertiAdapter);
                   recyclerViewHori.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
                   break;
               case "Pizza":
                   listPizzaVer.add(new HomeVertiModel(R.drawable.vegan_pepperoni_pizza,"Pizza Super 1","Boston Super Crispy Crust","10$"));
                   listPizzaVer.add(new HomeVertiModel(R.drawable.vegan_pepperoni_pizza,"Pizza Super 2","Boston Super Crispy Crust","10$"));
                   listPizzaVer.add(new HomeVertiModel(R.drawable.vegan_pepperoni_pizza,"Pizza Super 3","Boston Super Crispy Crust","10$"));
                   homeVertiAdapter = new HomeVertiAdapter(getActivity(),listPizzaVer);
                   vertiRecycleView.setAdapter(homeVertiAdapter);
                   recyclerViewHori.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
                   break;
               case "Burger":
                   listBurger.add(new HomeVertiModel(R.drawable.burger,"Burger 1","Soft bunn and double tikky","5$"));
                   listBurger.add(new HomeVertiModel(R.drawable.burger,"Burger 2","Soft bunn and double tikky","5$"));
                   listBurger.add(new HomeVertiModel(R.drawable.burger,"Burger 3","Soft bunn and double tikky","5$"));
                   homeVertiAdapter = new HomeVertiAdapter(getActivity(),listBurger);
                   vertiRecycleView.setAdapter(homeVertiAdapter);
                   recyclerViewHori.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
                   break;
               case "Momos":
                   listMomos.add(new HomeVertiModel(R.drawable.fried_chicken_momos,"Momos 1","Soft Momos and fried 1","10$"));
                   listMomos.add(new HomeVertiModel(R.drawable.fried_chicken_momos,"Momos 2","Soft Momos and fried 2","25$"));
                   listMomos.add(new HomeVertiModel(R.drawable.fried_chicken_momos,"Momos 3","Soft Momos and fried 3","35$"));
                   homeVertiAdapter = new HomeVertiAdapter(getActivity(),listMomos);
                   vertiRecycleView.setAdapter(homeVertiAdapter);
                   recyclerViewHori.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
                   break;
           }

    }
}