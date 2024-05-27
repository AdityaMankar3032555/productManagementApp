package com.example.productmanagementapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.productmanagementapp.api.APIclient;
import com.example.productmanagementapp.model.UserModelItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String  TAG = "MainActivity";
        super.onCreate(savedInstanceState);
        textView = findViewById(R.id.textView);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Call<List<UserModelItem>> call = APIclient.getInstance().getApi().getProductData();
        Log.d(TAG,"call"+call);
        call.enqueue(new Callback<List<UserModelItem>>() {
                         @Override
                         public void onResponse(Call<List<UserModelItem>> call, Response<List<UserModelItem>> response) {
                             Log.d(TAG,"response"+response);
                             Log.d(TAG,"productsItems"+response.body());
                             if(response.isSuccessful()){
                                 Log.d(TAG,"onResponse");
                                 Toast.makeText(MainActivity.this, "Successfully get data", Toast.LENGTH_SHORT).show();
                                 List<UserModelItem> productsItems = response.body();
                                 textView.setText(""+productsItems.get(0).getThumbnail());
                             }
                         }

                         @Override
                         public void onFailure(Call<List<UserModelItem>> call, Throwable throwable) {
                                Log.d(TAG,"onFailure");
                                Toast.makeText(MainActivity.this,"failure", Toast.LENGTH_SHORT).show();
                         }
                     });
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
    }
}