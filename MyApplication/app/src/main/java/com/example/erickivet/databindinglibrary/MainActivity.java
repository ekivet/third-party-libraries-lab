package com.example.erickivet.databindinglibrary;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.erickivet.databindinglibrary.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    EditText firstNameText;
    EditText lastNameText;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);


        firstNameText = (EditText) findViewById(R.id.first_name);
        lastNameText = (EditText) findViewById((R.id.last_name));
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                User user = new User(firstNameText.getText().toString(),lastNameText.getText().toString());

                binding.setUser(user);

            }
        });






    }
}
