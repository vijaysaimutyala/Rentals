package abc.com.example.vijsu.rentals.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import abc.com.example.vijsu.rentals.Adapters.RVAdapterForMyAds;
import abc.com.example.vijsu.rentals.Beans.MyAdPost;
import abc.com.example.vijsu.rentals.R;

public class MyAdsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<MyAdPost> flatList = new ArrayList<>();
    private List<MyAdPost> myAdPosts;
    private RVAdapterForMyAds rvAdapterForMyAds;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_ads);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

/*        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        recyclerView = (RecyclerView)findViewById(R.id.myAdsRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        initializeAdapter();
        initializeData(flatList);

    }

    private void initializeAdapter() {
        rvAdapterForMyAds = new RVAdapterForMyAds(this.getApplicationContext(),flatList);
        recyclerView.setAdapter(rvAdapterForMyAds);

    }

    private void initializeData(List<MyAdPost> flatList) {
        myAdPosts = flatList;
        myAdPosts.add(new MyAdPost("A15-202"));
        myAdPosts.add(new MyAdPost("B17-501"));
        myAdPosts.add(new MyAdPost("C5-412"));
        myAdPosts.add(new MyAdPost("DB5-302"));
        myAdPosts.add(new MyAdPost("A15-102"));
    }

}
