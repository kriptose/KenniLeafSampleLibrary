package com.kennileaf.librarypack;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by HyeHailyn on 10/19/2016.
 */
public class TGNaonao extends TextView {

    public TGNaonao(Context context) {
        super(context);
        createFont();
    }

    public TGNaonao(Context context, AttributeSet attrs) {
        super(context, attrs);
        createFont();
    }

    public TGNaonao(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        createFont();
    }

    public void createFont() {
        Typeface font = Typeface.createFromAsset(getContext().getAssets(), "TGNaonao.ttf");
        setTypeface(font);
    }
}

