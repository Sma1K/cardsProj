package com.example.smaik.cards;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CardsAdapter extends RecyclerView.Adapter<CardsAdapter.ViewHolder>{
    private List<Product> products;

    public CardsAdapter(List<Product> products) {
        this.products = products;
    }




    @NonNull
    @Override
    public CardsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.product_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardsAdapter.ViewHolder holder, int position) {
        Product product = products.get(position);
        holder.img.setImageResource(product.getImg());
        holder.name.setText(product.getName());
        holder.text.setText(product.getText());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView name;
        TextView text;
        ImageView img;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            img = itemView.findViewById(R.id.pi_product_image_iv);
            text = itemView.findViewById(R.id.pi_text_tv);
            name = itemView.findViewById(R.id.pi_name_tv);
        }
    }
}
