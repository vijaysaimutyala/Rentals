package abc.com.example.vijsu.rentals.Adapters;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import abc.com.example.vijsu.rentals.Beans.MyAdPost;
import abc.com.example.vijsu.rentals.R;

/**
 * Created by vijsu on 23-02-2016.
 */
public class RVAdapterForMyAds extends RecyclerView.Adapter<RVAdapterForMyAds.MyAdsViewHolder>{
    private List<MyAdPost> flatList;
    private Context context;

    public RVAdapterForMyAds(Context context, List<MyAdPost> flatList) {
        this.context = context;
        this.flatList = flatList;
    }

    @Override
    public MyAdsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.myad_card_dummy,parent,false);
        final MyAdsViewHolder myAdsViewHolder = new MyAdsViewHolder(view);
        return myAdsViewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return flatList.size();
    }

    public class MyAdsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView flatno;
        public Button update,close;
        public CardView cardViewSample;

        public MyAdsViewHolder(View itemView){
            super(itemView);
            cardViewSample = (CardView)itemView.findViewById(R.id.cvMyAds);
            flatno = (TextView)itemView.findViewById(R.id.cv_flatno);
            update = (Button)itemView.findViewById(R.id.btn_update);
            close = (Button)itemView.findViewById(R.id.btn_close);
            update.setOnClickListener(this);
            close.setOnClickListener(this);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id.cvMyAds:
                            Toast.makeText(v.getContext(), "Updating/Deleting the ad", Toast.LENGTH_SHORT).show();
                            break;
                    }
                    }
            });
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_update:
                    Snackbar.make(v,"Data successfully updated.",Snackbar.LENGTH_SHORT).show();
                    break;
                case R.id.btn_close:
                    Snackbar.make(v,"Ad closed successfully",Snackbar.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
