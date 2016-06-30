package com.cberthelot.openclasstutorial.mainactivity.listeners;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cberthelot.openclasstutorial.mainactivity.views.Views;

/**
 * Created by cberthelot on 14/06/2016.
 */
public class ImcListener implements View.OnClickListener, View.OnTouchListener {

    private final static String TAG = "ImcListener";

    @Override
    public void onClick(View v) {
        try {
            Log.d(TAG, "on click listener");
            float size = Integer.valueOf(Views.taille.getText().toString());
            if (Views.radioCentimetre.isChecked()) {
                size = size / 100;
            }
            float imc = Integer.valueOf(Views.poids.getText().toString()) / size;
            if (Views.superFonction.isChecked()) {
                Views.resultText.setText("Votre IMC est " + imc + " c'est chaud");
            } else {
                Views.resultText.setText("Votre IMC est " + imc + " c'est pas mal !");
            }
        }catch(Exception e) {
            Toast.makeText(Views.context, "Hého, tu es un Minipouce ou quoi ?", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Log.d(TAG, "On touch listener");
        // Comme l'évènement nous donne la vue concernée par le toucher, on le récupère et on le caste en Button
        Button bouton = (Button)v;
        // On récupère la largeur du bouton
        int largeur = bouton.getWidth();
        // On récupère la hauteur du bouton
        int hauteur = bouton.getHeight();
        // On récupère la coordonnée sur l'abscisse (X) de l'évènement
        float x = event.getX();
        // On récupère la coordonnée sur l'ordonnée (Y) de l'évènement
        float y = event.getY();
        // Puis on change la taille du texte selon la formule indiquée dans l'énoncé
        bouton.setTextSize(Math.abs(x - largeur / 2) + Math.abs(y - hauteur / 2));
        // Le toucher est fini, on veut continuer à détecter les touchers d'après
        return true;
    }
}
