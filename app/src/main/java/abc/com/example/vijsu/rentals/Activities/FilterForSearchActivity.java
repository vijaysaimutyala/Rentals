package abc.com.example.vijsu.rentals.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import abc.com.example.vijsu.rentals.R;

public class FilterForSearchActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener,View.OnClickListener{
    SeekBar rentAmt;
    TextView rentMin,rentMax;
    Spinner bhk;
    RadioGroup tenantType,furnitureType;
    Button apply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_for_search);
        rentAmt = (SeekBar)findViewById(R.id.seekBarRent);
        rentMin = (TextView)findViewById(R.id.minAmt);
        rentMax = (TextView)findViewById(R.id.maxAmt);
        bhk = (Spinner)findViewById(R.id.noOfBhk);
        tenantType = (RadioGroup)findViewById(R.id.rb_tenantType);
        furnitureType = (RadioGroup)findViewById(R.id.rb_furnishingType);
        apply = (Button)findViewById(R.id.btn_apply);
        apply.setOnClickListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_apply:

        }

    }
}
