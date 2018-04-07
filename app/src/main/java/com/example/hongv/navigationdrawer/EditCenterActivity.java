package com.example.hongv.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.hongv.navigationdrawer.model.Center;

public class EditCenterActivity extends AppCompatActivity {

    ImageView imageEditAvatar;
    EditText edtEditCenter, edtEditAddress, edtEditPhone, edtEditQuality;
    Button btnSaveEdit, btnExitEdit,btnDel;

    Center center;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_center);
        initView();
        getData();
    }

    private void getData() {
        if (getIntent().getExtras()!=null){
            center =(Center) getIntent().getSerializableExtra("Edit");
            int a = center.getIdCenter();

            imageEditAvatar.setImageResource(center.getPicture());
            edtEditCenter.setText(center.getNameCenter());
            edtEditAddress.setText(center.getAddress());
            edtEditPhone.setText(center.getPhone());
            edtEditQuality.setText(String.valueOf(center.getQuality()));
        }
    }

    private void initView() {
        imageEditAvatar =(ImageView) findViewById(R.id.imgEditAvatar);
        edtEditCenter =(EditText) findViewById(R.id.edtEditName);
        edtEditAddress =(EditText) findViewById(R.id.edtEditAddress);
        edtEditPhone=(EditText) findViewById(R.id.edtEditPhone);
        edtEditQuality=(EditText) findViewById(R.id.edtEditQuality);
        btnSaveEdit =(Button) findViewById(R.id.btnEdit);
        btnDel=(Button) findViewById(R.id.btnDel);
        btnExitEdit=(Button) findViewById(R.id.btnExitEdit);

        btnSaveEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditCenterActivity.this, MainActivity.class);
                int b = center.getIdCenter();
                Center center1 = new Center(b,edtEditCenter.getText().toString(),edtEditAddress.getText().toString(),edtEditPhone.getText().toString(), center.getPicture(), Float.valueOf(edtEditQuality.getText().toString())
                );
                intent.putExtra("Edit", center1);
                setResult(200,intent);
                finish();

            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditCenterActivity.this, MainActivity.class);
                intent.putExtra("Del", center.getIdCenter());
                setResult(300,intent);
                finish();
            }
        });

        btnExitEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
