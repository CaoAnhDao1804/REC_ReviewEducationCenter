package com.example.hongv.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hongv.navigationdrawer.model.Center;

public class AddCenterActivity extends AppCompatActivity {
    EditText edtAddName, edtAddAddress, edtAddPhone;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_center);
        getSupportActionBar().hide();
        initView();
    }

    private void initView() {
        edtAddName =(EditText) findViewById(R.id.edtAddNameCenter);
        edtAddAddress =(EditText) findViewById(R.id.edtAddAddress);
        edtAddPhone =(EditText) findViewById(R.id.edtAddPhone);

        btnAdd =(Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Center center = new Center(0,edtAddName.getText().toString(), edtAddAddress.getText().toString(),edtAddPhone.getText().toString(),R.drawable.ezienghlish,0);
                Intent intent = new Intent(AddCenterActivity.this, MainActivity.class);
                intent.putExtra("Add", center);
                setResult(100,intent);
                finish();

            }
        });

    }
}
