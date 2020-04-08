package com.roworkshop.andro;

import android.graphics.Point;

public class c_point extends Point {
    public c_point() {
    }

    public c_point(int i, int i2) {
        set(i, i2);
    }

    public c_point(Point point) {
        set(point.x, point.y);
    }
}
