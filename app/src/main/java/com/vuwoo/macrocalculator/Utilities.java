package com.vuwoo.macrocalculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.SeekBar;

/**
 * Created by spran on 12/25/2015.
 */
public class Utilities
{

    /*These calculateMethods are to calculate the carbs,protein or
fat with the calories provided
 */
    public static int calculcateCarbs (int calories, double carbsPercent)
    {
        return (int) (calories * (carbsPercent/100)) / 4 ;
    }
    public static int calculcateProtein (int calories, double proteinPercent)
    {
        return (int) (calories * (proteinPercent/100)) / 4 ;
    }
    public static int calculcateFat (int calories, double fatPercent)
    {
        return (int) (calories * (fatPercent/100)) / 9 ;
    }


}
