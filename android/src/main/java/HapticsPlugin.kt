package com.plugin.haptics

import android.app.Activity
import android.content.Context
import android.os.VibrationEffect
import android.os.Vibrator
import app.tauri.annotation.Command
import app.tauri.plugin.JSObject
import app.tauri.plugin.Plugin
import app.tauri.plugin.Invoke


class PingArgs(val value: String? = null)

class HapticsPlugin(activity: Activity) : Plugin(activity) {

    private val vibrator = activity.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

    @Command
    fun trigger(invoke: Invoke) {
        val args: PingArgs = invoke.parseArgs(PingArgs::class.java)
        vibrator.vibrate(VibrationEffect.createOneShot(100, VibrationEffect.DEFAULT_AMPLITUDE))

        val response = JSObject()
        response.put("value", args.value ?: "")
        invoke.resolve(response)
    }
}