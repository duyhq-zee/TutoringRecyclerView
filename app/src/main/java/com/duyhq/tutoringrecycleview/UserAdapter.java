package com.duyhq.tutoringrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private ArrayList<User> userList;

    public UserAdapter(ArrayList<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(R.layout.item_user, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = userList.get(position);

        holder.usernameTV.setText(user.getUsername());
        holder.fullNameTV.setText(user.getFullName());
        holder.emailTV.setText(user.getEmail());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView usernameTV;
        TextView fullNameTV;
        TextView emailTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            usernameTV = itemView.findViewById(R.id.tv_username);
            fullNameTV = itemView.findViewById(R.id.tv_full_name);
            emailTV = itemView.findViewById(R.id.tv_email);
        }
    }
}
