package com.example.to_doapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "Dhaval")
public class MainData implements Serializable {
    //create id column
    @PrimaryKey(autoGenerate = true)

    private int ID;

    //create text column

    @ColumnInfo(name = "text")

    private String text;

    //generate getter abd setter


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
