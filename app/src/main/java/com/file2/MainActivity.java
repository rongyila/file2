package com.file2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase db=openOrCreateDatabase("file.db",MODE_PRIVATE,null);

        //创建数据表
        //createTable(db);
        //增加数据
        //insert(db);
        //删除数据
        //deleteTable(db);
        //更新数据
        //update(db);
        newInsert(db);
    }

    private void newInsert(SQLiteDatabase db) {
        String table="students";
        String nullColumnHack="id";
        ContentValues values=new ContentValues();


        long insert = db.insert(table,nullColumnHack,values );
    }

    private void update(SQLiteDatabase db) {

    }

    public void delete(SQLiteDatabase db) {
        String sql = "delete from students " +
                "where id=4";
        // sql = "delete from students";
        db.execSQL(sql);
        db.close();
    }

    public void insert(SQLiteDatabase db) {
        String sql = "insert into students " +
                "(name, age, gender) " +
                "values " +
                "('Lily', 18, 0)";
        db.execSQL(sql);

        sql = "insert into students " +
                "(name, age, gender) " +
                "values " +
                "('Rose', 19, 0)";
        db.execSQL(sql);

        sql = "insert into students " +
                "(name, age, gender) " +
                "values " +
                "('Billy', 22, 1)";
        db.execSQL(sql);

        sql = "insert into students " +
                "(name, age, gender) " +
                "values " +
                "('Alex', 20, 1)";
        db.execSQL(sql);

        sql = "insert into students " +
                "(name, age, gender) " +
                "values " +
                "('Jason', 21, 1)";
        db.execSQL(sql);


    }

    public void createTable(SQLiteDatabase db) {
        // 创建数据表
        String sql = "create table students (" +
                "id integer primary key autoincrement," +
                "name varchar(16) not null unique, " +
                "age integer, " +
                "gender integer" +
                ");";
        db.execSQL(sql);

    }


}
