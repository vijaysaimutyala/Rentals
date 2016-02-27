package abc.com.example.vijsu.rentals.Activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import abc.com.example.vijsu.rentals.Adapters.DividerItemDecoration;
import abc.com.example.vijsu.rentals.Adapters.RVAdapterForPost;
import abc.com.example.vijsu.rentals.Beans.AdPost;
import abc.com.example.vijsu.rentals.CustomItemClickListener;
import abc.com.example.vijsu.rentals.R;

public class AdsListActivity extends AppCompatActivity{
    private List<AdPost> adPostList = new ArrayList<>();
    private List<AdPost> adPost;
    private RecyclerView recyclerView;
    private RVAdapterForPost rvAdapterForPost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads_list);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.filterFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(view.getContext(),FilterForSearchActivity.class);
               startActivity(intent);
            }
        });
        recyclerView = (RecyclerView)findViewById(R.id.postsRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        initializeAdapter();
        initializeData(adPostList);
    }

    private void initializeAdapter() {
        rvAdapterForPost = new RVAdapterForPost(adPostList, this.getApplicationContext());
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rvAdapterForPost);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
    }

    private void initializeData(List<AdPost> adPostList) {
        adPost = adPostList;
        adPost.add(new AdPost("A15-202","15000/-","Men","Singapore Township","2 BHK"));
        adPost.add(new AdPost("A19-202","16000/-","Women","Malaysian Township","3 BHK"));
        adPost.add(new AdPost("A16-202","17000/-","Family","AB Township","2 BHK"));
        adPost.add(new AdPost("A17-202","18000/-","Men","Chennai Apartments","2 BHK"));
        adPost.add(new AdPost("A18-202","19000/-","Family","Bangalore Towers","3 BHK"));
        adPost.add(new AdPost("A20-202","21000/-","Women","Mysore Towers","2 BHK"));
        adPost.add(new AdPost("A21-202","22000/-","Women","Jaipur Flats","1 BHK"));
        adPost.add(new AdPost("A22-202","23000/-","Women","Chandigarh Flats","2 BHK"));
        adPost.add(new AdPost("A23-202","25000/-","Men","Mangalore Towers","3 BHK"));
    }

/*
    @Override
    public void onItemClick(View v, int position) {
        Intent intent = new Intent(v.getContext(),FlatDetailsActivity.class);
        startActivity(intent);
    }*/
}
