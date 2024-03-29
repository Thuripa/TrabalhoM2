package com.example.trabalhodispositivosmveis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import io.realm.OrderedRealmCollection;
import io.realm.RealmRecyclerViewAdapter;

import java.util.List;

public class RecyclerViewAdapter extends RealmRecyclerViewAdapter<Abastecimento, RecyclerViewAdapter.ViewHolder> {

    private List<Abastecimento> mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // dados são passados pelo construtor


    RecyclerViewAdapter(OrderedRealmCollection<Abastecimento> data) {
        super(data, true);
        this.mData = data;
    }

    // infla o layout da linha a partir do xml quando necessário
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_linha, parent, false);
        return new ViewHolder(itemView);
    }

    // passa os dados para seu respectivo TextView
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Abastecimento abastecimento = mData.get(position);
        holder.myTextView.setText(abastecimento.getPosto());
        holder.myTextView2.setText(String.valueOf(abastecimento.getValor()));
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextView;
        TextView myTextView2;

        ViewHolder(View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.tvPosto);
            myTextView2 = itemView.findViewById(R.id.tvValor);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    @Override
    public long getItemId(int index) {
        //noinspection ConstantConditions
        return getItem(index).getId();
    }


    // convenience method for getting data at click position
    /*Abastecimento getItem(int id) {
        return getItem(id).getId();
    }*/

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}