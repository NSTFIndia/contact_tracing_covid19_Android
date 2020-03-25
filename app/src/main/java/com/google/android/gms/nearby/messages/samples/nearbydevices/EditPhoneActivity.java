package com.google.android.gms.nearby.messages.samples.nearbydevices;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EditPhoneActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView back;
    private String id;
    private RelativeLayout relativeLayout;
    private TextView mHeaderText;
    private EditText editText;
    private TextView tvDone;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_phone);

        relativeLayout = findViewById(R.id.relativeLayout_Header);
        relativeLayout.setVisibility(View.VISIBLE);

        sharedPreferences = getSharedPreferences(getApplicationContext().getPackageName(), Context.MODE_PRIVATE);

        mHeaderText = findViewById(R.id.txtHeader);
        mHeaderText.setText("Edit Phone");

        tvDone = findViewById(R.id.tvDone);
        tvDone.setOnClickListener(this);

        editText = findViewById(R.id.edt_Number);
        String email = sharedPreferences.getString("readUserMobile","");
        editText.setText(email);
        editText.setSelection(editText.getText().length());

        this.back = (ImageView) findViewById(R.id.imgHeaderLeftBack);

        this.back.setOnClickListener(this);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(s.toString().length() != 10){
                    tvDone.setTextColor(getResources().getColor(R.color.gray_light));
                    tvDone.setClickable(false);
                }else{
                    tvDone.setTextColor(getResources().getColor(R.color.black_pure));
                    tvDone.setClickable(true);
                }

            }
        });

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgHeaderLeftBack:
                onBackPressed();
                break;
            case R.id.tvDone:
                // if(tvDone.isClickable()) {
                String phone = (editText.getText().toString().trim());
                sharedPreferences.edit().putString("readUserMobile",phone).apply();
                Intent intent = new Intent(EditPhoneActivity.this,MainActivity.class);
                startActivity(intent);
                // }

                break;
        }

    }


    private static final String TAG = EditPhoneActivity.class.getSimpleName();


}
