package windstudy.com.myapplication.Network;

public class DataServices {

    public static APIServices getAPIService() {
        return RetrofitClient.getClient().create(APIServices.class);
    }
}
