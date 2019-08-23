package com.wazinsure.bottomsheetdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {


    private LinearLayout bottomsheetlayout;
    private BottomSheetBehavior bottomSheetBehavior;
    private ImageView imgshare;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomsheetlayout = (LinearLayout) findViewById( R.id.bottmsheet);
        imgshare = (ImageView) findViewById(R.id.shareimg);
        bottomSheetBehavior = bottomSheetBehavior.from(bottomsheetlayout);

        //state hidden
//        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        // state Collapsed
//        bottomSheetBehavior.setState(BottomSheetBehav  ior.STATE_COLLAPSED);
        //state expanded
//        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        imgshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //show BottomSheet
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
    }
}
