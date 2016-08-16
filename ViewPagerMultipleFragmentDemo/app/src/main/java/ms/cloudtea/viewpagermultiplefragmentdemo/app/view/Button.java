package ms.cloudtea.viewpagermultiplefragmentdemo.app.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;

import ms.cloudtea.viewpagermultiplefragmentdemo.app.R;

import java.io.FileNotFoundException;


public class Button extends android.support.v7.widget.AppCompatButton {

    public Button(Context context) throws FileNotFoundException {
        super(context);
        init(context, null, 0);
    }

    public Button(Context context, AttributeSet attrs) throws FileNotFoundException {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public Button(Context context, AttributeSet attrs, int defStyle) throws FileNotFoundException {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) throws FileNotFoundException {
        if (isInEditMode())
            return;

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Digicorp_Components, defStyle, 0);
        if (typedArray != null) {
            if (typedArray.hasValue(R.styleable.Digicorp_Components_asset_font_file_name)) {
                String assetFontFileName = typedArray.getString(R.styleable.Digicorp_Components_asset_font_file_name);
                Typeface typeface = Typeface.createFromAsset(context.getAssets(), assetFontFileName);
                if (typeface == null) {
                    throw new FileNotFoundException("Font file not found in asset : " + assetFontFileName);
                }

                setTypeface(typeface);
            }
            typedArray.recycle();
        }
    }
}
