package ms.cloudtea.viewpagermultiplefragmentdemo.app;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by yogesh.kamaliya on 16/08/16.
 */
public class Utils {

    public static void hideSoftKeyboard(Activity context) {
        if (context.getCurrentFocus() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(context.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(context.getCurrentFocus().getWindowToken(), 0);
        }
    }

}
