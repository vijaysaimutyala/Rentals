package abc.com.example.vijsu.rentals.Activities;

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
        adPost.add(new AdPost("A15-202","15000/-","March","Men"));
        adPost.add(new AdPost("A19-202","16000/-","April","Women"));
        adPost.add(new AdPost("A16-202","17000/-","May","Family"));
        adPost.add(new AdPost("A17-202","18000/-","June","Men"));
        adPost.add(new AdPost("A18-202","19000/-","July","Family"));
        adPost.add(new AdPost("A20-202","21000/-","August","Women"));
        adPost.add(new AdPost("A21-202","22000/-","September","Women"));
        adPost.add(new AdPost("A22-202","23000/-","October","Women"));
        adPost.add(new AdPost("A23-202","25000/-","November","Men"));
    }


}
