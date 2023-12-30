package com.plugin.haptics

import android.app.Activity
import app.tauri.annotation.Command
import app.tauri.annotation.InvokeArg
import app.tauri.annotation.TauriPlugin
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
        invoke.resolve(mapOf("value" to (args.value ?: "")))
    }
}