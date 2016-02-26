package abc.com.example.vijsu.rentals.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import abc.com.example.vijsu.rentals.Beans.AdPost;
import abc.com.example.vijsu.rentals.CustomItemClickListener;
import abc.com.example.vijsu.rentals.R;

/**
 * Created by vijsu on 19-02-2016.
 */
public class RVAdapterForPost extends RecyclerView.Adapter<RVAdapterForPost.PostsViewHolder> {
    private List<AdPost> postList;
    private Context context;
    CustomItemClickListener listener;
    public class PostsViewHolder extends RecyclerView.ViewHolder {
        public TextView flatNo,rentAmt,availableFrom,tenants;
        public CardView cardView;
        public LinearLayout linearLayout;
        public PostsViewHolder(View itemView) {
            super(itemView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.parent_list_dummy);
            cardView = (CardView)itemView.findViewById(R.id.dummy_card_post);
            flatNo = (TextView)itemView.findViewById(R.id.txt_flatno);
            rentAmt = (TextView)itemView.findViewById(R.id.txt_rent);
            availableFrom = (TextView)itemView.findViewById(R.id.txt_available_from);
            tenants = (TextView)itemView.findViewById(R.id.txt_for_gender);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id.parent_list_dummy:
                            Toast.makeText(v.getContext(), "Post clicked. Taking to other activity...", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });
        }

    }

    public RVAdapterForPost(List<AdPost> postList, Context context) {
        this.postList = postList;
        this.context = context;
    }

    @Override
    public PostsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_dummy,parent,false);
        final PostsViewHolder postsViewHolder = new PostsViewHolder(view);
        return postsViewHolder;
    }

    @Override
    public void onBindViewHolder(PostsViewHolder holder, int position) {
        AdPost adPost = postList.get(position);
        holder.flatNo.setText(adPost.getFlatNo());
        holder.availableFrom.setText(adPost.getAvailableFrom());
        holder.rentAmt.setText(adPost.getRentAmt());
        holder.tenants.setText(adPost.getTenants());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

}/*
switch (v.getId()){
        case R.id.parent_list_dummy:
        Toast.makeText(v.getContext(), "Post clicked. Taking to other activity...", Toast.LENGTH_SHORT).show();
        break;
        }*/
