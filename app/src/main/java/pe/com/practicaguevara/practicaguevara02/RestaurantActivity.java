package pe.com.practicaguevara.practicaguevara02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class RestaurantActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RestaurantAdapter RestaurantAdapter= new RestaurantAdapter();
        RestaurantAdapter.setRestaurant(RestaurantRespository.getList());

        recyclerView.setAdapter(RestaurantAdapter);

    }
}


