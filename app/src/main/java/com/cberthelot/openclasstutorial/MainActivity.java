package com.cberthelot.openclasstutorial;

import android.app.Activity;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.cberthelot.openclasstutorial.mainactivity.listeners.ImcListener;
import com.cberthelot.openclasstutorial.mainactivity.listeners.RazListener;
import com.cberthelot.openclasstutorial.mainactivity.views.Views;

public class MainActivity extends Activity {

    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //On récupère toutes les vues dont on a besoin. On les stocke à l'exterieur pour
        //pouvoir y accéder dans des classes non anonymes. Sinon tout le code de l'activité se
        //retrouve ici ...
        Views.imcButton = (Button) findViewById(R.id.imcButton);
        Views.razButton =  (Button) findViewById(R.id.razButton);
        Views.poids = (EditText) findViewById(R.id.editPoids);
        Views.taille = (EditText) findViewById(R.id.editTaille);
        Views.resultText = (TextView) findViewById(R.id.resultText);
        Views.superFonction = (CheckBox) findViewById(R.id.superFonction);
        Views.radioCentimetre = (RadioButton) findViewById(R.id.radioCentimetre);
        Views.radioMetre = (RadioButton) findViewById(R.id.radioMetre);
        Views.context = this;

        //On accroche les listeners
        Views.imcButton.setOnClickListener(imcListener);
        Views.razButton.setOnClickListener(razListener);

        String presentation = getResources().getString(R.string.presentation, "Clément", 34);
        Log.d(TAG, presentation);
    }

    //Création des listeners
    private ImcListener imcListener = new ImcListener();
    private RazListener razListener = new RazListener();

}
