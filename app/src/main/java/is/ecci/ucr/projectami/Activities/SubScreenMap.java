package is.ecci.ucr.projectami.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import is.ecci.ucr.projectami.R;

/**
 * Created by Daniel on 5/20/2017.
 */

public class SubScreenMap extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_screen_map);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        getWindow().setLayout(250, 250);

    }
}