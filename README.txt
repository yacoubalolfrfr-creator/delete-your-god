Only My Lunge Sounds — Fabric 1.21.11

What it does:
- Includes your original lunge1.ogg, lunge2.ogg and lunge3.ogg files.
- Cancels entity-attached spear lunge sound packets when the source is another player.
- Keeps your original use_totem.ogg sound asset in the Minecraft assets folder.
- Client-side only; it does not change server gameplay.

Build:
1. Install Java 21.
2. Open a terminal in this project folder.
3. Run: ./gradlew build   (Windows: gradlew.bat build). A Gradle wrapper is included.
4. The mod jar will be in build/libs/.

Install: put the jar from build/libs/ (not the -sources jar) into your .minecraft/mods folder with Fabric Loader 0.16+ for Minecraft 1.21.11. Fabric API is not required.

Note: This source project has not been compiled in this environment. The exact Fabric/Yarn dependency availability may require updating versions if Gradle reports a resolution error.

No Java on your PC? Upload this folder to a new GitHub repository. The included workflow (.github/workflows/build.yml) builds the mod automatically; download the jar from the Actions tab > latest run > Artifacts (use the non-sources jar).
