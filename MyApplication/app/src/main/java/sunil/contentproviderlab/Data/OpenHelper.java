package sunil.contentproviderlab.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class OpenHelper extends SQLiteOpenHelper {
    private static final String DB_NAME="lab_db";

    private static final int VERSION=1;
    private static OpenHelper sInstance;

    private OpenHelper(Context context){
        super(context,DB_NAME,null,VERSION);
    }

    public static OpenHelper getInstance(Context context){
        if(sInstance == null){
            sInstance = new OpenHelper(context.getApplicationContext());
        }
        return sInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
