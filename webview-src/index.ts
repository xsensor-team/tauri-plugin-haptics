import { invoke } from "@tauri-apps/api/core";

export async function trigger(value: string) {
  console.log("[tauri-plugin-haptics] triggered");
  return await invoke("plugin:haptics|trigger", { value });
}
