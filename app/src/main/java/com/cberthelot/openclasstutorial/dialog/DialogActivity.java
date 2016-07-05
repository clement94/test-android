package com.cberthelot.openclasstutorial.dialog;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 05/07/2016.
 */
public class DialogActivity extends Activity {

    public static final int TYPE_ALERT_DIALOG = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_activity);
    }

    public void showBasicAlertDialog(View view) {
        showDialogType(TYPE_ALERT_DIALOG);
    }

    public void showDialogType(int typeAlertDialog) {
        if (typeAlertDialog == TYPE_ALERT_DIALOG) {
            MyDialogFragment dialogFragment = MyDialogFragment.newInstance(R.string.helloworld);
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            dialogFragment.show(transaction, "the-tag");
        }
    }
}
