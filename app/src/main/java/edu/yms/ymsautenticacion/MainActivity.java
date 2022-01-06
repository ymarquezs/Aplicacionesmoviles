package edu.yms.ymsautenticacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button  btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance("https://autentica2022-69f18-default-rtdb.firebaseio.com");
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!nnnn");
        Toast.makeText(this, "heh", Toast.LENGTH_SHORT).show();
    }
}