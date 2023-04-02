package com.duyhq.tutoringrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<User> userList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_user);

        userList.add(new User("Username 1", "Full name 1", "Email 1"));
        userList.add(new User("Username 2", "Full name 2", "Email 2"));
        userList.add(new User("Username 3", "Full name 3", "Email 3"));
        userList.add(new User("Username 4", "Full name 4", "Email 4"));

        UserAdapter userAdapter = new UserAdapter(userList);

        recyclerView.setAdapter(userAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


    }
}