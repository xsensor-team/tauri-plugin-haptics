import { invoke } from "@tauri-apps/api/core";

export async function execute() {
  console.log("execute called");
  return await invoke("plugin:haptics|execute");
}

export async function trigger(value: string) {
  console.log("trigger called");
  return await invoke("plugin:haptics|trigger", { value });
}
