package zero.com.nweq.common;

import android.content.Context;
import android.content.Intent;

import zero.com.nweq.MainActivity;
import zero.com.nweq.ui.LoginActivity;
import zero.com.nweq.ui.PositionActivity;
import zero.com.nweq.ui.SearchActivity;
import zero.com.nweq.ui.ThemeActivity;

/**
 * Created by luowei on 15/4/21.
 */
public class UIHelper {
    public static void showMainActivity(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public static void showThemeActivity(Context context){
        Intent intent = new Intent(context, ThemeActivity.class);
        context.startActivity(intent);
    }

    public static void showPositionActivity(Context context){
        Intent intent = new Intent(context, PositionActivity.class);
        context.startActivity(intent);
    }

    public static void showSearchActivity(Context context){
        Intent intent = new Intent(context, SearchActivity.class);
        context.startActivity(intent);
    }

    public static void showLoginActivity(Context context){
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

}
