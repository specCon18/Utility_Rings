
Utility Rings
=======
A small mod that adds in a ring to turn lava within one block of the player into obsidian

Setup the project to contribute:
--------

Step 1: Open your command-line and browse to the project directory

Step 2: You're left with a choice.
If you prefer to use Eclipse:
1. Run the following command to generate the runners for the mod in eclipse (Client,Server,Data,GameTestServer):
   Windows: `./gradlew.bat genEclipseRuns`
   Linux/MacOS: `./gradlew genEclipseRuns`
2. Run the following command to create the eclipse project:
   Windows: `./gradlew.bat eclipse`
   Linux/MacOS: `./gradlew eclipse`

If you prefer to use IntelliJ:
1. Open IDEA, and import project.
2. Import the project by pointing IntelliJ to the build.gradle file.
3. Run the following command to generate the runners for the mod in IntelliJ (Client,Server,Data,GameTestServer):
   Windows: `./gradlew.bat genIntellijRuns`
   Linux/MacOS: `./gradlew genIntellijRuns`
4. Refresh the Gradle Project in IDEA if required.

If at any point you are missing libraries in your IDE, or you've run into problems you can 
run `gradlew --refresh-dependencies` to refresh the local cache. `gradlew clean` to reset everything 
{this does not affect your code} and then start the process again.

Mapping Names:
============
By default, the MDK is configured to use the official mapping names from Mojang for methods and fields 
in the Minecraft codebase. These names are covered by a specific license. All modders should be aware of this
license, if you do not agree with it you can change your mapping names to other crowdsourced names in your 
build.gradle. For the latest license text, refer to the mapping file itself, or the reference copy here:
https://github.com/NeoForged/NeoForm/blob/main/Mojang.md

Credit:
=======
- sinkillerj the developer of [Project E](https://github.com/sinkillerj/ProjectE) for basic iron band texture.
- TheIllusiveC4 for the [CuriosAPI](https://github.com/TheIllusiveC4/Curios) saving me so much time.
- The [ParchmentMC](https://parchmentmc.org/docs/getting-started) team for their neutral bindings.