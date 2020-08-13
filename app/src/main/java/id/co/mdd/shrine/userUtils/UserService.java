package id.co.mdd.shrine.userUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

import id.co.mdd.shrine.models.StoreModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface UserService {

    @GET("products")
    Call<ArrayList<StoreModel>> getDataStore();
}
