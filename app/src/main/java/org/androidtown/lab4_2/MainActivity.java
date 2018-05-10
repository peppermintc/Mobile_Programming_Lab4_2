package org.androidtown.lab4_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button button1;
    LinearLayout linearLayout1;
    //For changing pages
    int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);
        linearLayout1 = findViewById(R.id.linearlayout1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if current page is 1 do translate1 anim
                if(page == 1)
                {
                    button1.setText("close page");

                    linearLayout1.setVisibility(View.VISIBLE);
                    Animation anim = AnimationUtils.loadAnimation(
                            getApplicationContext(),R.anim.translate1);
                    linearLayout1.startAnimation(anim);

                    page=2;
                }
                //if current page is 2 do translate2 anim
                else if(page ==2)
                {
                    button1.setText("open page");

                    Animation anim = AnimationUtils.loadAnimation(
                            getApplicationContext(),R.anim.translate2);
                    linearLayout1.startAnimation(anim);
                    linearLayout1.setVisibility(View.GONE);

                    page=1;
                }

            }
        });
    }
}
