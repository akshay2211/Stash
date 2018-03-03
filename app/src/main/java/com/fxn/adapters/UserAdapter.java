package com.fxn.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fxn.modal.User;
import com.fxn.storeapp.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by akshay on 02/03/18.
 */

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    // private Context context;
    private ArrayList<User> mDataset = new ArrayList<>();

    /*public UserAdapter(Context context) {
        this.context = context;
    }*/

    public void update(User user) {
        this.mDataset.add(user);
        notifyDataSetChanged();
    }

    public void updateAll(ArrayList<User> userlist) {
        this.mDataset.clear();
        this.mDataset.addAll(userlist);
        notifyDataSetChanged();
    }

    public void clearAll() {
        this.mDataset = new ArrayList<>();
        notifyDataSetChanged();
    }

    public ArrayList<User> getList() {
        return this.mDataset;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final ViewHolder viewHolder = (ViewHolder) holder;
        User user = mDataset.get(position);
        viewHolder.Name.setText(user.getName());
        viewHolder.Age.setText(user.getAge());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        @BindView(R.id.Name)
        public TextView Name;
        @BindView(R.id.Age)
        public TextView Age;

        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }
}
