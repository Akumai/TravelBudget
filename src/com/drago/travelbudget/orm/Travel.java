package com.drago.travelbudget.orm;


import android.provider.BaseColumns;

/**
 * Table for our travels
 */
public abstract class Travel implements BaseColumns {
    public static final String TABLE_NAME = "travel";
    public static final String COLUMN_NAME_TRAVEL_ID = "travelid";
    public static final String COLUMN_NAME_TITLE = "title";
    public static final String COLUMN_NAME_SUBTITLE = "subtitle";

    // Prevents the FeedReaderContract class from being instantiated.
    private Travel(){}
}
