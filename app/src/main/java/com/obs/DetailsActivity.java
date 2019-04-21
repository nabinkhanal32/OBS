package com.obs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
CircleImageView circImg;
TextView tvNameOfBook, tvDetailsOfBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailsactivity);

        circImg = findViewById(R.id.cirImage);
        tvNameOfBook = findViewById(R.id.tvNameOfBook);
        tvDetailsOfBook = findViewById(R.id.tvDetailsOfBook);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null)
        {
            circImg.setImageResource(bundle.getInt("image"));
            tvNameOfBook.setText(bundle.getString("Name"));
            tvDetailsOfBook.setText(bundle.getString("Details"));
        }

    }

}
