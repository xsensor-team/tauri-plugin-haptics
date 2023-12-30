# Tauri Plugin haptics

## Install

add directly to your package.json

```json
"tauri-plugin-haptics": "github:xsensor-team/tauri-plugin-haptics#main"
```

and to your cargo.toml

```toml
tauri-plugin-haptics = { git = "https://github.com/xsensor-team/tauri-plugin-haptics.git" }
```

and connect the plugin in your tauri builder

```rust
tauri::Builder::default()
    .setup()
    .plugin(tauri_plugin_haptics::init())
    .invoke_handler(tauri::generate_handler![])
    .run(tauri::generate_context!())
    .expect("Error while building tauri appliction");
```

### Android instructions

make sure to add the following permission to your `AndroidManifest.xml`

```xml
<uses-permission android:name="android.permission.VIBRATE"/>
```

## Usage

See the [examples](https://github.com/xsensor-team/tauri-plugin-haptics/tree/main/examples/tauri-app) for more information

```javascript
import { trigger } from 'tauri-plugin-haptics-api'

 ...

const result = await trigger()
```
