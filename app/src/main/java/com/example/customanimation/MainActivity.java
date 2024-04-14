package com.example.customanimation;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button animatedButton;
    private ImageView imageView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by their IDs
        textView = findViewById(R.id.textView);
        animatedButton = findViewById(R.id.animatedButton);
        imageView = findViewById(R.id.imageView);
        editText = findViewById(R.id.editText);

        // Set click listener on the animated button
        animatedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Apply animations to views
                animateTextView();
                animateButton();
                animateImageView();
                animateEditText();
            }
        });
    }

    // Method to animate the TextView
    private void animateTextView() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale_rotate);
        textView.startAnimation(animation);
    }

    // Method to animate the Button
    private void animateButton() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        animatedButton.startAnimation(animation);
    }

    // Method to animate the ImageView
    private void animateImageView() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        imageView.startAnimation(animation);
    }

    // Method to animate the EditText
    private void animateEditText() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        editText.startAnimation(animation);
    }
}
