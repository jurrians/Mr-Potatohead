package jurrians.mrpotatohead;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        String tag = "potato";
        String msg = "checkClicked: ";
        Log.d(tag, msg);

        CheckBox checkbox = (CheckBox) v;

        CheckBox checkArms = findViewById(R.id.checkArms);
        CheckBox checkEars = findViewById(R.id.checkEars);
        CheckBox checkEyebrows = findViewById(R.id.checkEyebrows);
        CheckBox checkEyes = findViewById(R.id.checkEyes);
        CheckBox checkGlasses = findViewById(R.id.checkGlasses);
        CheckBox checkHat = findViewById(R.id.checkHat);
        CheckBox checkMouth = findViewById(R.id.checkMouth);
        CheckBox checkMustache = findViewById(R.id.checkMustache);
        CheckBox checkNose = findViewById(R.id.checkNose);
        CheckBox checkShoes = findViewById(R.id.checkShoes);

        ImageView arms = (ImageView) findViewById(R.id.arms);
        ImageView ears = (ImageView) findViewById(R.id.ears);
        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        ImageView hat =(ImageView) findViewById(R.id.hat);
        ImageView mouth =(ImageView) findViewById(R.id.mouth);
        ImageView mustache = (ImageView) findViewById(R.id.mustache);
        ImageView nose = (ImageView) findViewById(R.id.nose);
        ImageView shoes = (ImageView) findViewById(R.id.shoes);







        if (checkArms.isChecked()){
            arms.setVisibility(View.VISIBLE);
        }

        else if (!checkArms.isChecked()) {
            arms.setVisibility(View.INVISIBLE);
        }

        if (checkEars.isChecked()){
            ears.setVisibility(View.VISIBLE);
        }

        else if (!checkEars.isChecked()) {
            ears.setVisibility(View.INVISIBLE);
        }

        if (checkEyebrows.isChecked()){
            eyebrows.setVisibility(View.VISIBLE);
        }

        else if (!checkEyebrows.isChecked()) {
            eyebrows.setVisibility(View.INVISIBLE);
        }


        if (checkEyes.isChecked()){
            eyes.setVisibility(View.VISIBLE);
        }

        else if (!checkEyes.isChecked()) {
            eyes.setVisibility(View.INVISIBLE);
        }


        if (checkGlasses.isChecked()){
            glasses.setVisibility(View.VISIBLE);
        }

        else if (!checkGlasses.isChecked()) {
            glasses.setVisibility(View.INVISIBLE);
        }


        if (checkHat.isChecked()){
            hat.setVisibility(View.VISIBLE);
        }

        else if (!checkHat.isChecked()) {
            hat.setVisibility(View.INVISIBLE);
        }


        if (checkMouth.isChecked() ){
            mouth.setVisibility(View.VISIBLE);
        }

        else if (!checkMouth.isChecked() ) {
            mouth.setVisibility(View.INVISIBLE);
        }


        if (checkMustache.isChecked() ){
            mustache.setVisibility(View.VISIBLE);
        }

        else if (!checkMustache.isChecked() ) {
            mustache.setVisibility(View.INVISIBLE);
        }


        if (checkNose.isChecked() ){
            nose.setVisibility(View.VISIBLE);
        }

        else if (!checkNose.isChecked() ) {
            nose.setVisibility(View.INVISIBLE);
        }


        if (checkShoes.isChecked() ){
            shoes.setVisibility(View.VISIBLE);
        }

        else if (!checkShoes.isChecked() ) {
            shoes.setVisibility(View.INVISIBLE);
        }

    }





}
