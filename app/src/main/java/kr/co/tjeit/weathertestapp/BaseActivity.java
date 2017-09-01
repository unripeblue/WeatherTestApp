package kr.co.tjeit.weathertestapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by the on 2017-09-01.
 */

public abstract class BaseActivity extends AppCompatActivity {
    Context mContext;

    public abstract void setupEvents();
    public abstract void setValues();
    public abstract void bindViews();

}
