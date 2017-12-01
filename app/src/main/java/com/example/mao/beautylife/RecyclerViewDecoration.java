package com.example.mao.beautylife;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;


import android.graphics.drawable.Drawable;

import android.support.annotation.DimenRes;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by -- Mao on 2017/11/30.
 */

public class RecyclerViewDecoration extends RecyclerView.ItemDecoration {

    private final Drawable mDivider;
    private final int mSize;
    private final Bitmap mBitmap;

    public RecyclerViewDecoration(Drawable drawable, Resources resources, @DimenRes int size, Bitmap bitmap) {
        mDivider = drawable;
        mSize = resources.getDimensionPixelSize(size);
        mBitmap = bitmap;
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int left;
        int right;
        int top;
        int bottom;
        left = parent.getPaddingLeft();
        right = parent.getWidth() - parent.getPaddingRight();
        final int childCount = parent.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            final View child = parent.getChildAt(i);
            final RecyclerView.LayoutParams params =
                    (RecyclerView.LayoutParams) child.getLayoutParams();
            top = child.getBottom() + params.bottomMargin;
            bottom = top + mSize;
            c.setBitmap(mBitmap);
            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.set(0, 0, 0, mSize);
    }
}
