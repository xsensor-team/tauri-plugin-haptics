# Tauri Plugin haptics

## Install

add directly to your package.json

```json
"tauri-plugin-haptics-api": "github:keeganstothert/tauri-plugin-haptics#main"
```

### Android instructions

make sure to add the following permission to your `AndroidManifest.xml`

```xml
<uses-permission android:name="android.permission.VIBRATE"/>
```

## Usage

See the [examples](https://github.com/keeganstothert/tauri-plugin-haptics/tree/main/examples/tauri-app) for more information

```javascript
import { trigger } from 'tauri-plugin-haptics-api'

 ...

const result = await trigger()
```
