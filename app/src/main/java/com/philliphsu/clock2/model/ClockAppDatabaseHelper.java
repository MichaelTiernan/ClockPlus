package com.philliphsu.clock2.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Phillip Hsu on 7/30/2016.
 */
public class ClockAppDatabaseHelper extends SQLiteOpenHelper {
    private static final String TAG = "ClockAppDatabaseHelper";
    private static final String DB_NAME = "clock_app.db";
    private static final int VERSION_1 = 1;

    /**
     * @param context the Context with which the application context will be retrieved
     */
    public ClockAppDatabaseHelper(Context context) {
        super(context.getApplicationContext(), DB_NAME, null, VERSION_1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        AlarmsTable.onCreate(db);
        TimersTable.onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        AlarmsTable.onUpgrade(db, oldVersion, newVersion);
        TimersTable.onUpgrade(db, oldVersion, newVersion);
    }
}
