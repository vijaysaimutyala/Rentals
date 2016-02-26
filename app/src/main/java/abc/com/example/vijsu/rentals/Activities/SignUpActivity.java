package abc.com.example.vijsu.rentals.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import abc.com.example.vijsu.rentals.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username,pin,emailid,company,mobileno,confirmpin;
    AutoCompleteTextView gender;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sign Up");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String[] Gender = {"Male","Female"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Gender);
        username = (EditText)findViewById(R.id.edt_name);
        pin = (EditText)findViewById(R.id.edt_password);
        confirmpin = (EditText)findViewById(R.id.edt_confirmpassword);
        emailid = (EditText)findViewById(R.id.edt_email);
        company = (EditText)findViewById(R.id.edt_company);
        mobileno = (EditText)findViewById(R.id.edt_mobileno);
        gender = (AutoCompleteTextView)findViewById(R.id.atv_gender);
        gender.setAdapter(adapter);
        gender.setThreshold(0);
        signup = (Button)findViewById(R.id.btn_submit);
        signup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_submit:
                if (!pin.getText().equals(confirmpin.getText())){
                    Toast.makeText(SignUpActivity.this, "Pin does not match!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(SignUpActivity.this, "Sign Up Successful", Toast.LENGTH_SHORT).show();
                    finish();
                    break;
            /*    Intent intent = new Intent(this,LoginActivity.class);
                startActivity(intent);*/

                }

        }
    }
}
