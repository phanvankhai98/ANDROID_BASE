package windstudy.com.myapplication.Network;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import windstudy.com.myapplication.Model.ListProductResult;
import windstudy.com.myapplication.Model.LoginResult;


public interface APIServices {
    @GET("/users/login")
    Call<LoginResult> login(@Query("user_name") String userName,
                            @Query("password") String password);

    @GET("/users/products")
    Call<ListProductResult> getListProduct();
}
