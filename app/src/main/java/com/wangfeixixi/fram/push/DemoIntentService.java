package com.wangfeixixi.fram.push;

import android.content.Context;
import android.util.Log;

import com.igexin.sdk.GTIntentService;
import com.igexin.sdk.message.GTCmdMessage;
import com.igexin.sdk.message.GTNotificationMessage;
import com.igexin.sdk.message.GTTransmitMessage;

/**
 * Created by Fei.Wang20 on 2018/6/20.
 */

public class DemoIntentService extends GTIntentService {
    private String TAG = "DemoIntentService";

    public DemoIntentService() {

    }

    @Override
    public void onReceiveServicePid(Context context, int pid) {
        Log.e(TAG, "onReceiveServicePid");
    }

    @Override
    public void onReceiveMessageData(Context context, GTTransmitMessage msg) {
        Log.e(TAG, "onReceiveMessageData");
    }

    @Override
    public void onReceiveClientId(Context context, String clientid) {
        Log.e(TAG, "onReceiveClientId -> " + "clientid = " + clientid);
    }

    @Override
    public void onReceiveOnlineState(Context context, boolean online) {

        Log.e(TAG, "onReceiveOnlineState"+online);
    }

    @Override
    public void onReceiveCommandResult(Context context, GTCmdMessage cmdMessage) {
        Log.e(TAG, "onReceiveCommandResult");
    }
//06-20 07:40:31.418 1788-1822/com.wangfeixixi.sharefram:pushservice D/PushService: clientid is d7287ef4a4152fd82e6458030991d690

    @Override
    public void onNotificationMessageArrived(Context context, GTNotificationMessage msg) {
        Log.e(TAG, "onNotificationMessageArrived");
    }

    @Override
    public void onNotificationMessageClicked(Context context, GTNotificationMessage msg) {
        Log.e(TAG, "onNotificationMessageClicked");
    }
}