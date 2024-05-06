package com.example.bottomnavigation.model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomnavigation.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentNotification extends Fragment {
    MessageAdapter messageAdapter;
    RecyclerView recyclerView;
    List<Message> list;

    public FragmentNotification(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_noti,container,false);
        list=new ArrayList<>();
        list.add(new Message(R.drawable.icon_cat,"Thanh","A dung day tu chieu","19:30"));
        list.add(new Message(R.drawable.ic_chub,"Nam","A dung day tu chieu","19:55"));
        list.add(new Message(R.drawable.icon_cat,"Hieu","A dung day tu chieu","20:00"));
        list.add(new Message(R.drawable.icon_cat,"Cuong","A dung day tu chieu","20:40"));
        list.add(new Message(R.drawable.icon_cat,"Thuan","A dung day tu chieu","21:20"));
        list.add(new Message(R.drawable.icon_cat,"Ngoc","A dung day tu chieu","22:30"));
        recyclerView=view.findViewById(R.id.recycleView);
        LinearLayoutManager manager=new LinearLayoutManager(view.getContext(),RecyclerView.VERTICAL,false);
        messageAdapter=new MessageAdapter(view.getContext(),list);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(messageAdapter);
        return view;
    }
}
