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


    }

    CheckBox checkbox = (CheckBox) v;

    String string = checkbox.getText().toString();

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

    public void OnClick(View v) {


        if (checkbox.isChecked() && string == "arms" ){
            arms.setVisibility(View.VISIBLE);
        }

        else if (!checkbox.isChecked() && string == "arms") {
            arms.setVisibility(View.INVISIBLE);
        }


        if (checkbox.isChecked() && string == "ears" ){
            ears.setVisibility(View.VISIBLE);
        }

        else if (!checkbox.isChecked() && string == "ears") {
            ears.setVisibility(View.INVISIBLE);
        }





        if (checkbox.isChecked() && string == "eyebrows" ){
            eyebrows.setVisibility(View.VISIBLE);

        }

        else if (!checkbox.isChecked() && string == "eyebrows") {
            eyebrows.setVisibility(View.INVISIBLE);
        }




        if (checkbox.isChecked() && string == "eyes" ){
            eyes.setVisibility(View.VISIBLE);
        }

        else if (!checkbox.isChecked() && string == "eyes") {
            eyes.setVisibility(View.INVISIBLE);
        }



        if (checkbox.isChecked() && string == "glasses" ){
            glasses.setVisibility(View.VISIBLE);
        }

        else if (!checkbox.isChecked() && string == "glasses") {
            glasses.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && string == "hat" ){
            hat.setVisibility(View.VISIBLE);
        }


        else if (!checkbox.isChecked() && string == "hat") {
            hat.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && string == "mouth" ){
            mouth.setVisibility(View.VISIBLE);
        }

        else if (!checkbox.isChecked() && string == "mouth") {
            mouth.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && string == "mustache" ){
            mustache.setVisibility(View.VISIBLE);
        }

        else if (!checkbox.isChecked() && string == "mustache") {
            mustache.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && string == "nose" ){
            nose.setVisibility(View.VISIBLE);
        }

        else if (!checkbox.isChecked() && string == "nose") {
            nose.setVisibility(View.INVISIBLE);
        }

        if (checkbox.isChecked() && string == "shoes" ){
            shoes.setVisibility(View.VISIBLE);
        }

        else if (!checkbox.isChecked() && string == "shoes") {
            shoes.setVisibility(View.INVISIBLE);
        }

    }






}











}


