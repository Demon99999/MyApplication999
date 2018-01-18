package com.example.myapplication999;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Дима on 01.12.2017.
 */

interface menu {
    void onClick(View v);

    boolean onCreateOptionsMenu(Menu menu);

    boolean onOptionsItemsSelected(MenuItem item);
}
