package com.fxn.stashapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.recyclerview.widget.RecyclerView;

import com.fxn.adapters.UserAdapter;
import com.fxn.modal.User;
import com.fxn.stash.Stash;

import java.util.ArrayList;


public class MainActivity extends Activity {

    public static final String TAG_ARRAYLIST_STORE = "TAG_ARRAYLIST_STORE";
    RecyclerView recycleView;
    UserAdapter userAdapter;
    EditText et1;
    EditText et2;

    public void store(View view) {
        Stash.put(TAG_ARRAYLIST_STORE, userAdapter.getList());
    }

    public void get(View view) {
        ArrayList<User> mylist = Stash.getArrayList(TAG_ARRAYLIST_STORE, User.class);
        userAdapter.updateAll(mylist);
    }

    public void clear(View view) {
        Stash.clearAll();
        userAdapter.clearAll();
    }

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
        recycleView = findViewById(R.id.recycleView);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        userAdapter = new UserAdapter();
        recycleView.setAdapter(userAdapter);
    }
}
