package com.fxn.stashapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import com.fxn.adapters.UserAdapter;
import com.fxn.modal.User;
import com.fxn.stash.Stash;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public static final String TAG_ARRAYLIST_STORE = "TAG_ARRAYLIST_STORE";
    RecyclerView recycleView;
    UserAdapter userAdapter;
    @BindView(R.id.et1)
    EditText et1;
    @BindView(R.id.et2)
    EditText et2;

    @OnClick(R.id.store)
    public void store(View view) {
        Stash.put(TAG_ARRAYLIST_STORE, userAdapter.getList());
    }

    @OnClick(R.id.get)
    public void get(View view) {
        ArrayList<User> mylist = Stash.getArrayList(TAG_ARRAYLIST_STORE, User.class);
        userAdapter.updateAll(mylist);
    }

    @OnClick(R.id.clear)
    public void clear(View view) {
        Stash.clearAll();
        userAdapter.clearAll();
    }

    @OnClick(R.id.addToList)
    public void addToList(View view) {
        if (et1.getText().toString().isEmpty()) {
            et1.setError("Name is Empty");
        } else if (et2.getText().toString().isEmpty()) {
            et2.setError("Age is Empty");
        } else {
            User user = new User(et1.getText().toString(), Integer.parseInt(et2.getText().toString()));
            et1.setText("");
            et2.setText("");
            et1.requestFocus();
            userAdapter.update(user);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        recycleView = findViewById(R.id.recycleView);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
        userAdapter = new UserAdapter();
        recycleView.setAdapter(userAdapter);
    }
}
