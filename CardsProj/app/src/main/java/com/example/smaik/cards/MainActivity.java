package com.example.smaik.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Product> products;
    private void createProducts()
    {
        products = new ArrayList<>();
        products.add(new Product("Potato", getString(R.string.potato_text), R.mipmap.karoshka));
        products.add(new Product("Tomato",getString(R.string.tomato_text), R.mipmap.tomato));
        products.add(new Product("Cabbage",getString(R.string.cabbage_text), R.mipmap.cabbage));
        products.add(new Product("Apple",getString(R.string.apple_text), R.mipmap.apple));
        products.add(new Product("Banana",getString(R.string.banana_text), R.mipmap.banana));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createProducts();

        RecyclerView recyclerView = findViewById(R.id.ma_products_rv);
        CardsAdapter adapter = new CardsAdapter(products);
        recyclerView.setAdapter(adapter);
    }
}
