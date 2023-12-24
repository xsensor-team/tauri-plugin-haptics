// import UIKit
// import WebKit
// import Tauri

// public class HapticsPlugin: Plugin {
//     @objc public func triggerHaptics(_ invoke: Invoke) throws {
//         // Choose the type of haptic feedback you want
//         let feedbackGenerator = UIImpactFeedbackGenerator(style: .medium)
//         feedbackGenerator.prepare()
//         feedbackGenerator.impactOccurred()

//         // Optionally send a response back
//         invoke.resolve(["status": "Haptics triggered"])
//     }
// }

// @_cdecl("init_haptics_plugin")
// func initPlugin() -> Plugin {
//   return HapticsPlugin()
// }

//func initHapticsPlugin(name: SRString, webview: WKWebView?) {
//    Tauri.registerPlugin(webview: webview, name: name.toString(), plugin: HapticsPlugin())
//}
