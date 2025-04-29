package com.istg.practica4C;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.istg.practica4C.primerParcial.CurriculumVitaeActivity;

public class MenuActivity extends AppCompatActivity {

    CardView curriculumCardView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        loadWidget();
    }

    private void loadWidget (){
        curriculumCardView = findViewById(R.id.curriculumCardView);
        setOnClicks();
    }

    private void setOnClicks ()
    {
        curriculumCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchCurriculum();
            }
        });
    }


    private void launchCurriculum()
    {
        Intent objIntent = new Intent(this, CurriculumVitaeActivity.class);
        startActivity(objIntent);
    }

}