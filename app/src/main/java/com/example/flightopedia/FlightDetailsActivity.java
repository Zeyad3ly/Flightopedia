package com.example.flightopedia;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.TextUtilsCompat;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FlightDetailsActivity extends AppCompatActivity {

    @BindView(R.id.cover)
    ImageView cover;
    @BindView(R.id.tvAdults)
    TextView tvAdults;
    @BindView(R.id.radio1)
    RadioButton radio1;
    @BindView(R.id.radio2)
    RadioButton radio2;
    @BindView(R.id.radio3)
    RadioButton radio3;
    @BindView(R.id.tvBags)
    TextView tvBags;
    @BindView(R.id.Radiobags1)
    RadioButton Radiobags1;
    @BindView(R.id.Radiobags2)
    RadioButton Radiobags2;
    @BindView(R.id.tvDepartDate)
    TextView tvDepartDate;
    @BindView(R.id.etDateDepart)
    EditText etDateDepart;
    @BindView(R.id.tvFlightTime)
    TextView tvFlightTime;
    @BindView(R.id.etFlightTime)
    EditText etFlightTime;
    @BindView(R.id.btnProceed)
    Button btnProceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_details);
        ButterKnife.bind(this);
        String mEtFlightTime = etFlightTime.getText().toString();
        String mDepartEt = etDateDepart.getText().toString();
        if (TextUtils.isEmpty(mDepartEt)) {
            etDateDepart.setError("Cannot be left empty");

        } else if (TextUtils.isEmpty(mEtFlightTime)) {
            etFlightTime.setError("Cannot be left empty");
        }
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FlightDetailsActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
    }


}
