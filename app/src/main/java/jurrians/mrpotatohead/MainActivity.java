package jurrians.mrpotatohead;

import android.media.Image;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;





public class MainActivity extends AppCompatActivity {


    CheckBox checkArms;
    CheckBox checkEars;
    CheckBox checkEyebrows;
    CheckBox checkEyes;
    CheckBox checkGlasses;
    CheckBox checkHat;
    CheckBox checkMouth;
    CheckBox checkMustache;
    CheckBox checkNose;
    CheckBox checkShoes;

    ImageView arms;
    ImageView ears;
    ImageView eyebrows;
    ImageView eyes;
    ImageView glasses;
    ImageView hat;
    ImageView mouth;
    ImageView mustache;
    ImageView nose;
    ImageView shoes;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        checkArms = (CheckBox) findViewById(R.id.checkArms);
        checkEars = (CheckBox) findViewById(R.id.checkEars);
        checkEyebrows = (CheckBox) findViewById(R.id.checkEyebrows);
        checkEyes = (CheckBox) findViewById(R.id.checkEyes);
        checkGlasses = (CheckBox) findViewById(R.id.checkGlasses);
        checkHat = (CheckBox) findViewById(R.id.checkHat);
        checkMouth = (CheckBox) findViewById(R.id.checkMouth);
        checkMustache = (CheckBox) findViewById(R.id.checkMustache);
        checkNose = (CheckBox) findViewById(R.id.checkNose);
        checkShoes = (CheckBox) findViewById(R.id.checkShoes);


        arms = (ImageView) findViewById(R.id.arms);
        ears = (ImageView) findViewById(R.id.ears);
        eyebrows = (ImageView) findViewById(R.id.eyebrows);
        eyes = (ImageView) findViewById(R.id.eyes);
        glasses = (ImageView) findViewById(R.id.glasses);
        hat = (ImageView) findViewById(R.id.hat);
        mouth = (ImageView) findViewById(R.id.mouth);
        mustache = (ImageView) findViewById(R.id.mustache);
        nose = (ImageView) findViewById(R.id.nose);
        shoes = (ImageView) findViewById(R.id.shoes);


        setContentView(R.layout.activity_main);

    }


    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super

        Integer armsValue = arms.getVisibility();
        outState.putInt("arms", armsValue);

        Integer earsValue = ears.getVisibility();
        outState.putInt("arms", armsValue);

        Integer eyebrowsValue = eyebrows.getVisibility();
        outState.putInt("eyebrows", eyebrowsValue);

        Integer eyesValue = eyes.getVisibility();
        outState.putInt("eyes", earsValue);

        Integer glassesValue = glasses.getVisibility();
        outState.putInt("glasses", glassesValue);

        Integer hatValue = hat.getVisibility();
        outState.putInt("hat", hatValue);

        Integer mouthValue = mouth.getVisibility();
        outState.putInt("mouth", mouthValue);

        Integer mustacheValue = mustache.getVisibility();
        outState.putInt("mustache", mustacheValue);

        Integer noseValue = nose.getVisibility();
        outState.putInt("nose", noseValue);

        Integer shoesValue = shoes.getVisibility();
        outState.putInt("shoes", shoesValue);
    }

    public void onRestoreInstanceState (Bundle inState) {
        super.onRestoreInstanceState(inState);

        Integer armsValueRes = inState.getInt("arms");
        arms.setVisibility(armsValueRes);

        Integer earsValueRes = inState.getInt("ears");
        ears.setVisibility(earsValueRes);

        Integer eyebrowsValueRes = inState.getInt("eyebrows");
        eyebrows.setVisibility(earsValueRes);

        Integer eyesValueRes = inState.getInt("eyes");
        eyes.setVisibility(eyesValueRes);

        Integer glassesValueRes = inState.getInt("glasses");
        glasses.setVisibility(glassesValueRes);

        Integer hatValueRes = inState.getInt("hat");
        hat.setVisibility(glassesValueRes);

        Integer mouthValueRes = inState.getInt("mouth");
        mouth.setVisibility(mouthValueRes);

        Integer mustacheValueRes = inState.getInt("mustache");
        mustache.setVisibility(mustacheValueRes);

        Integer noseValueRes = inState.getInt("nose");
        nose.setVisibility(noseValueRes);

        Integer shoesValueRes = inState.getInt("shoes");
        shoes.setVisibility(shoesValueRes);

    }


    public void checkClicked(View v) {

        CheckBox checkArms = (CheckBox) findViewById(R.id.checkArms);
        CheckBox checkEars = (CheckBox) findViewById(R.id.checkEars);
        CheckBox checkEyebrows = (CheckBox) findViewById(R.id.checkEyebrows);
        CheckBox checkEyes = (CheckBox) findViewById(R.id.checkEyes);
        CheckBox checkGlasses = (CheckBox) findViewById(R.id.checkGlasses);
        CheckBox checkHat = (CheckBox) findViewById(R.id.checkHat);
        CheckBox checkMouth = (CheckBox) findViewById(R.id.checkMouth);
        CheckBox checkMustache = (CheckBox) findViewById(R.id.checkMustache);
        CheckBox checkNose = (CheckBox) findViewById(R.id.checkNose);
        CheckBox checkShoes = (CheckBox) findViewById(R.id.checkShoes);


        ImageView arms = (ImageView) findViewById(R.id.arms);
        ImageView ears = (ImageView) findViewById(R.id.ears);
        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        ImageView hat = (ImageView) findViewById(R.id.hat);
        ImageView mouth = (ImageView) findViewById(R.id.mouth);
        ImageView mustache = (ImageView) findViewById(R.id.mustache);
        ImageView nose = (ImageView) findViewById(R.id.nose);
        ImageView shoes = (ImageView) findViewById(R.id.shoes);

        CheckBox checkbox = (CheckBox) v;

        Log.d( "potato", "checkClicked");

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
