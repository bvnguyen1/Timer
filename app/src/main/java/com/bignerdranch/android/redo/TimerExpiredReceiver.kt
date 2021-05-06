package com.bignerdranch.android.redo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.bignerdranch.android.redo.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        PrefUtil.setTimerState(MainActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}