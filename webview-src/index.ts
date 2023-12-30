import { invoke } from "@tauri-apps/api/core";

export async function execute() {
  console.log("execute called");
  return await invoke("plugin:haptics|execute");
}

export async function ping(value: string) {
  console.log("ping called");
  return await invoke("plugin:haptics|trigger", { value });
}
