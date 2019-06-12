package com.example.instagramclonefirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class UploadActivity extends AppCompatActivity {

    ImageView postImage;
    EditText postCommentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        postImage = findViewById(R.id.ivPost);
        postCommentText = findViewById(R.id.etPostComment);
    }

    public void upload(View view) {

    }

    public void imageSelect(View view) {
        
    }
}
