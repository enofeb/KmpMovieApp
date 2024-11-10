import SwiftUI
import ComposeApp

@main
struct iOSApp: App {

    init() {
      KoinInitHelperKt.doInitKoin()
      LoggerInitHelperKt.doInitLogger()
    }

    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}