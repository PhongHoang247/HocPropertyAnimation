package com.phong.hocpropertyanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void XuLyObjectAnimator(View view) {
        Button btnObjectAnimator =  findViewById(R.id.btnObjectAnimator);
        //Load hiệu ứng lên:
        ObjectAnimator objectAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.object_animator);
        objectAnimator.setTarget(btnObjectAnimator);
        objectAnimator.start();
    }

    public void XuLyObjectAnimatorSet(View view) {
        Button btnObjectAnimatorSet = findViewById(R.id.btnObjectAnimatorSet);
        //Load hiệu ứng lên:
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.object_animator_set);
        animatorSet.setTarget(btnObjectAnimatorSet);
        animatorSet.start();
    }
}
