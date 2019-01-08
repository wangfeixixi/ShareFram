package wangfeixixi.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
    private static Toast toast;

    /**
     * 静态toast
     */
    public static void showToast(final Context context, final String text) {
        ThreadUtils.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                // toast消失了  toast 会自动为null
                if (toast == null) {// 消失了
                    toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
                }

                toast.setText(text);
                toast.show();
            }
        });
    }

    public static void showToast(String text) {
        showToast(UIUtils.getContext(), text);
    }
}

