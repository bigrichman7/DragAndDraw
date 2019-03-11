package com.bigrichman.android.draganddraw;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DragAndDrawActivity extends SingleFragmentActivity {

    public Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }

}
