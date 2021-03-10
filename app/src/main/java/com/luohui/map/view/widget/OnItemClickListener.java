package com.luohui.map.view.widget;

import android.view.View;

/**
 * RecyclerView条目点击回调
 */
public interface OnItemClickListener {
    /**
     * 条目点击回调
     * @param v
     * @param position
     */
    void onItemClick(View v, int position);
}
