package windstudy.com.myapplication.ViewController.Product;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import windstudy.com.myapplication.Model.Product;
import windstudy.com.myapplication.R;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    Context context;
    ArrayList<Product> data;

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_item_layout,viewGroup,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder productViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
