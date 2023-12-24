import SwiftRs
import Tauri
import UIKit
import WebKit

class PingArgs: Decodable {
  let value: String?
}

class ExamplePlugin: Plugin {
  @objc public func ping(_ invoke: Invoke) throws {
    let args = try invoke.parseArgs(PingArgs.self)
    // Choose the type of haptic feedback you want
    let feedbackGenerator = UIImpactFeedbackGenerator(style: .medium)
    feedbackGenerator.prepare()
    feedbackGenerator.impactOccurred()

    // Optionally send a response back
    // invoke.resolve(["status": "Haptics triggered"])


    invoke.resolve(["value": args.value ?? ""])
  }
}

@_cdecl("init_plugin_haptics")
func initPlugin() -> Plugin {
  return ExamplePlugin()
}
