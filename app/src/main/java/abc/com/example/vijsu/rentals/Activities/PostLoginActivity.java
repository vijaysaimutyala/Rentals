package abc.com.example.vijsu.rentals.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import abc.com.example.vijsu.rentals.Beans.MyAdPost;
import abc.com.example.vijsu.rentals.R;

public class PostLoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button postAd,viewAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_login);
        postAd = (Button)findViewById(R.id.btn_postAd);
        viewAd = (Button)findViewById(R.id.btn_wantAFlat);
        postAd.setOnClickListener(this);
        viewAd.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_logged_in, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
      /*  int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_settings) {
            return true;
        }
*/      switch (item.getItemId()){
            case R.id.action_settings:
                Toast.makeText(PostLoginActivity.this, "Clicked Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_myposts:
                Intent intent = new Intent(this, MyAdsActivity.class);
                startActivity(intent);
                break;
            }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_postAd:
                Intent intentPost = new Intent(PostLoginActivity.this,PostAFlatActivity.class);
                startActivity(intentPost);
                Toast.makeText(PostLoginActivity.this, "Taking to post activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_wantAFlat:
                Toast.makeText(PostLoginActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,AdsListActivity.class);
                startActivity(intent);
        }
    }
}
