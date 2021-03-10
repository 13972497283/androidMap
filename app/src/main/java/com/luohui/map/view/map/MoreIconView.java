package com.luohui.map.view.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.luohui.map.R;
import com.luohui.map.view.base.BaseIconView;

/**
 * 更多
 */
public class MoreIconView extends BaseIconView {

    private static final String TAG = "MoreIconView";

    public MoreIconView(Context context) {
        this(context, null);
    }

    public MoreIconView(Context context, AttributeSet attrs) {
        this(context, attrs, R.style.IconViewStyle);
    }

    public MoreIconView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public boolean createBackground() {
        setIconBackground(R.drawable.icon_c_diy5);
        return true;
    }

    @Override
    public boolean createIcon() {
        setBackgroundResource(R.drawable.icon_down_selector);
        return true;
    }
}
