package jp.ac.it_college.std.s14002.android.comikequizgame;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by s14002 on 16/04/22.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, "MyTable.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE MyTable" +
            "(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT" +
                ", Pref TEXT" +
                ", City0 TEXT" +
                ", City1 TEXT" +
                ", City2 TEXT" +
                ", City3 TEXT" +
                ", City4 TEXT" +
                ", Clear INTEGER" +
                ")");

        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('北海道','札幌','青森','盛岡','仙台','札幌',1);");    // 1
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山形県','山形','山形','宇都宮','前橋','東京',0);");   // 2
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('群馬県','前橋','横浜','前橋','京都','水戸',0);");    // 3
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('福井県','福井','秋田','盛岡','仙台','福井',0);");    //4
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('石川県','金沢','前橋','京都','金沢','盛岡',0);");    //5
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('兵庫県','神戸','神戸','京都','和歌山','盛岡',0);"); // 6
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山梨県','甲府','前橋','京都','金沢','甲府',0);");    // 7
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('長野県','長野','前橋','東京','長野','盛岡',0);");    // 8
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('岐阜県','岐阜','前橋','岐阜','仙台','札幌',0);");    // 9
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('静岡県','静岡','静岡','神戸','京都','和歌山',0);");   // 10
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('北海道','札幌','青森','盛岡','仙台','札幌',0);");    // 11
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山形県','山形','山形','宇都宮','前橋','東京',0);");   // 12
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('群馬県','前橋','横浜','前橋','京都','水戸',0);");    // 13
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('福井県','福井','秋田','盛岡','仙台','福井',0);");    // 14
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('石川県','金沢','前橋','京都','金沢','盛岡',0);");    // 15
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('兵庫県','神戸','神戸','京都','和歌山','盛岡',0);");   // 16
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山梨県','甲府','前橋','京都','金沢','甲府',0);");    // 17
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('長野県','長野','前橋','東京','長野','盛岡',0);");    // 18
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('岐阜県','岐阜','前橋','岐阜','仙台','札幌',0);");    // 19
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('静岡県','静岡','静岡','神戸','京都','和歌山',0);");   // 20
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('北海道','札幌','青森','盛岡','仙台','札幌',0);");    // 21
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山形県','山形','山形','宇都宮','前橋','東京',0);");   // 22
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('群馬県','前橋','横浜','前橋','京都','水戸',0);");    // 23
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('福井県','福井','秋田','盛岡','仙台','福井',0);");    // 24
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('石川県','金沢','前橋','京都','金沢','盛岡',0);");    // 25
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('兵庫県','神戸','神戸','京都','和歌山','盛岡',0);");   // 26
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山梨県','甲府','前橋','京都','金沢','甲府',0);");    // 27
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('長野県','長野','前橋','東京','長野','盛岡',0);");    // 28
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('岐阜県','岐阜','前橋','岐阜','仙台','札幌',0);");    // 29
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('静岡県','静岡','静岡','神戸','京都','和歌山',0);");   // 30
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('北海道','札幌','青森','盛岡','仙台','札幌',0);");    // 31
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山形県','山形','山形','宇都宮','前橋','東京',0);");   // 32
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('群馬県','前橋','横浜','前橋','京都','水戸',0);");    // 33
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('福井県','福井','秋田','盛岡','仙台','福井',0);");    // 34
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('石川県','金沢','前橋','京都','金沢','盛岡',0);");    // 35
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('兵庫県','神戸','神戸','京都','和歌山','盛岡',0);");   // 36
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山梨県','甲府','前橋','京都','金沢','甲府',0);");    // 37
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('長野県','長野','前橋','東京','長野','盛岡',0);");    // 38
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('岐阜県','岐阜','前橋','岐阜','仙台','札幌',0);");    // 39
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('静岡県','静岡','静岡','神戸','京都','和歌山',0);");   // 40
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('北海道','札幌','青森','盛岡','仙台','札幌',0);");    // 41
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山形県','山形','山形','宇都宮','前橋','東京',0);");   // 42
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('群馬県','前橋','横浜','前橋','京都','水戸',0);");    // 43
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('福井県','福井','秋田','盛岡','仙台','福井',0);");    // 44
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('石川県','金沢','前橋','京都','金沢','盛岡',0);");    // 45
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('兵庫県','神戸','神戸','京都','和歌山','盛岡',0);");   // 46
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山梨県','甲府','前橋','京都','金沢','甲府',0);");    // 47
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('長野県','長野','前橋','東京','長野','盛岡',0);");    // 48
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('岐阜県','岐阜','前橋','岐阜','仙台','札幌',0);");    // 49
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('静岡県','静岡','静岡','神戸','京都','和歌山',0);");   // 50
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('北海道','札幌','青森','盛岡','仙台','札幌',0);");    // 51
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山形県','山形','山形','宇都宮','前橋','東京',0);");   // 52
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('群馬県','前橋','横浜','前橋','京都','水戸',0);");    // 53
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('福井県','福井','秋田','盛岡','仙台','福井',0);");    // 54
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('石川県','金沢','前橋','京都','金沢','盛岡',0);");    // 55
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('兵庫県','神戸','神戸','京都','和歌山','盛岡',0);"); // 56
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山梨県','甲府','前橋','京都','金沢','甲府',0);");    // 57
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('長野県','長野','前橋','東京','長野','盛岡',0);");    // 58
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('岐阜県','岐阜','前橋','岐阜','仙台','札幌',0);");    // 59
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('静岡県','静岡','静岡','神戸','京都','和歌山',0);");   // 60
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('北海道','札幌','青森','盛岡','仙台','札幌',0);");    // 61
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山形県','山形','山形','宇都宮','前橋','東京',0);");   // 62
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('群馬県','前橋','横浜','前橋','京都','水戸',0);");    // 63
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('福井県','福井','秋田','盛岡','仙台','福井',0);");    // 64
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('石川県','金沢','前橋','京都','金沢','盛岡',0);");    // 65
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('兵庫県','神戸','神戸','京都','和歌山','盛岡',0);");   // 66
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山梨県','甲府','前橋','京都','金沢','甲府',0);");    // 67
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('長野県','長野','前橋','東京','長野','盛岡',0);");    // 68
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('岐阜県','岐阜','前橋','岐阜','仙台','札幌',0);");    // 69
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('静岡県','静岡','静岡','神戸','京都','和歌山',0);");   // 70
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('北海道','札幌','青森','盛岡','仙台','札幌',0);");    // 71
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山形県','山形','山形','宇都宮','前橋','東京',0);");   // 72
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('群馬県','前橋','横浜','前橋','京都','水戸',0);");    // 73
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('福井県','福井','秋田','盛岡','仙台','福井',0);");    // 74
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('石川県','金沢','前橋','京都','金沢','盛岡',0);");    // 75
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('兵庫県','神戸','神戸','京都','和歌山','盛岡',0);");   // 76
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山梨県','甲府','前橋','京都','金沢','甲府',0);");    // 77
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('長野県','長野','前橋','東京','長野','盛岡',0);");    // 78
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('岐阜県','岐阜','前橋','岐阜','仙台','札幌',0);");    // 79
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('静岡県','静岡','静岡','神戸','京都','和歌山',0);");   // 80
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('北海道','札幌','青森','盛岡','仙台','札幌',0);");    // 81
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山形県','山形','山形','宇都宮','前橋','東京',0);");   // 82
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('群馬県','前橋','横浜','前橋','京都','水戸',0);");    // 83
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('福井県','福井','秋田','盛岡','仙台','福井',0);");    // 84
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('石川県','金沢','前橋','京都','金沢','盛岡',0);");    // 85
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('兵庫県','神戸','神戸','京都','和歌山','盛岡',0);");   // 86
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山梨県','甲府','前橋','京都','金沢','甲府',0);");    // 87
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('長野県','長野','前橋','東京','長野','盛岡',0);");    // 88
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('岐阜県','岐阜','前橋','岐阜','仙台','札幌',0);");    // 89
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('静岡県','静岡','静岡','神戸','京都','和歌山',0);");   // 90
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('北海道','札幌','青森','盛岡','仙台','札幌',0);");    // 91
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山形県','山形','山形','宇都宮','前橋','東京',0);");   // 92
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('群馬県','前橋','横浜','前橋','京都','水戸',0);");    // 93
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('福井県','福井','秋田','盛岡','仙台','福井',0);");    // 94
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('石川県','金沢','前橋','京都','金沢','盛岡',0);");    // 95
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('兵庫県','神戸','神戸','京都','和歌山','盛岡',0);");   // 96
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('山梨県','甲府','前橋','京都','金沢','甲府',0);");    // 97
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('長野県','長野','前橋','東京','長野','盛岡',0);");    // 98
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('岐阜県','岐阜','前橋','岐阜','仙台','札幌',0);");    // 99
        db.execSQL("INSERT INTO MyTable(Pref,City0, City1, City2, City3, City4, Clear) values ('静岡県','静岡','静岡','神戸','京都','和歌山',0);");   // 100
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}