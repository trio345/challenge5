package id.co.mdd.shrine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import id.co.mdd.shrine.adapters.StoreAdapter;
import id.co.mdd.shrine.models.StoreModel;
import id.co.mdd.shrine.userUtils.UserRepository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ThirdActivity extends AppCompatActivity {

    StoreAdapter storeAdapter;
    RecyclerView rvStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        rvStore = findViewById(R.id.rvUsers);

        storeAdapter = new StoreAdapter();
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setOrientation(GridLayout.VERTICAL);




        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Shrine");
        }


        UserRepository userRepository = new UserRepository();

        userRepository.service.getDataStore().enqueue(new Callback<ArrayList<StoreModel>>() {
            @Override
            public void onResponse(Call<ArrayList<StoreModel>> call, Response<ArrayList<StoreModel>> response) {
                if (response.isSuccessful()){
                    if (response.body() != null){
                        ArrayList<StoreModel> list = response.body();
                        storeAdapter.setStore(list);
                        rvStore.setAdapter(storeAdapter);
                    }
                }
            }

            @Override
            public void onFailure(Call<ArrayList<StoreModel>> call, Throwable t) {
                t.printStackTrace();

            }
        });










    }
}