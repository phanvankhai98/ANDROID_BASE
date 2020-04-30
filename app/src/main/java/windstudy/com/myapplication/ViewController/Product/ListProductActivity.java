package windstudy.com.myapplication.ViewController.Product;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import windstudy.com.myapplication.Model.ListProductResult;
import windstudy.com.myapplication.Model.Product;
import windstudy.com.myapplication.Network.DataServices;
import windstudy.com.myapplication.R;

public class ListProductActivity extends AppCompatActivity {

    RecyclerView rvProduct;
    ArrayList<Product> data = new ArrayList<>();
    ProductAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);
        init();
        prepareData();
    }

    void init(){
        rvProduct = findViewById(R.id.rv_product);
        adapter = new ProductAdapter();
        adapter.context = this;
        adapter.data = this.data;
        LinearLayoutManager linearLayout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        rvProduct.setLayoutManager(linearLayout);
        rvProduct.setAdapter(adapter);
    }

    void prepareData(){
        DataServices.getAPIService().getListProduct().enqueue(new Callback<ListProductResult>() {
            @Override
            public void onResponse(Call<ListProductResult> call, Response<ListProductResult> response) {
                if (response.isSuccessful() && response.body().status == 1){
                    data.clear();
                    data.addAll(response.body().productList);
                    adapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onFailure(Call<ListProductResult> call, Throwable t) {
                Log.d("product", "onResponse: ");
            }
        });
    }

}
