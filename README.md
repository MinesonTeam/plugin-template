# 🚀 MinesonTeam Plugin Template

![Social Preview](https://github.com/MinesonTeam/plugin-template)

[![Build Status](https://github.com/MinesonTeam/plugin-template/actions/workflows/dev-build.yml/badge.svg)](https://github.com/MinesonTeam/plugin-template/actions)
[![Java Version](https://img.shields.io/badge/Java-8-orange?style=flat&logo=openjdk)](https://adoptium.net/)
[![Gradle Version](https://img.shields.io/badge/Gradle-8.7-blue?style=flat&logo=gradle)](https://gradle.org/)
[![License](https://img.shields.io/badge/License-GPL--3.0-green.svg)](LICENSE)
[![Support](https://img.shields.io/badge/Support-Ko--fi-red?logo=ko-fi)](https://ko-fi.com/Hxncus)

**MinesonTeam Plugin Template** is a high-tech template for PaperMC plugin development, focused on performance, security, and automation.

## ✨ Features
* **Stable Stack:** Optimized for Java 8 and Gradle 8.7.
* **Smart CI/CD:** Automated builds, version bumping, and release management.
* **Developer First:** Pre-configured Issue Forms, PR Templates, and Branch Protection.
* **Optimized:** Automatic ShadowJar shading and relocation.
* **Security:** Integrated GitHub Rulesets and Tag Protection.

---

## 🛠️ Getting Started
1. Click the **[Use this template](https://github.com/MinesonTeam/plugin-template/generate)** button.
2. Clone your new repository.
3. Update `settings.gradle.kts` and `src/main/resources/plugin.yml` with your plugin details.
4. Start coding!

## 💻 Development Workflow
We use a professional branching model:
* **`master`**: Production-ready stable code. Each merge here triggers a **New Release**.
* **`dev`**: Main development branch. Each push triggers a **dev-latest** build.
* **`feature/*`**: Experimental features and new modules.
* **`fix/*`**: Critical bug fixes.

### Commands
* `./gradlew build` — Compile and package the plugin.
* `./gradlew shadowJar` — Build a fat-JAR with all shaded dependencies.
* `./gradlew clean` — Clean the build directory.

---

## 📦 CI/CD Infrastructure
* **Push to `dev`**: Automatically builds the project and updates the `dev-latest` tag for testing.
* **Push to `master`**: Automatically increments the version (Patch), creates a Git tag, and generates a GitHub Release with the production `.jar`.

---

## 📜 License
This project is licensed under the **GNU General Public License v3.0**. See the [LICENSE](LICENSE) file for details.

## 💖 Support
Created with ❤️ by **MinesonTeam**. If this template helps you, consider [supporting us on Ko-fi](https://ko-fi.com/Hxncus).
