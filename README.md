
# Utility Rings
A small mod that adds in a ring to turn lava within one block of the player into obsidian

## Setup the project to contribute:

### Step 1:
Open your command-line and browse to the project directory

### Step 2: 
You're left with a choice.
**If you prefer to use Eclipse**:
1. Run the following command to generate the runners for the mod in eclipse (Client,Server,Data,GameTestServer):
   Windows: `./gradlew.bat genEclipseRuns`
   Linux/MacOS: `./gradlew genEclipseRuns`
2. Run the following command to create the eclipse project:
   Windows: `./gradlew.bat eclipse`
   Linux/MacOS: `./gradlew eclipse`

**If you prefer to use IntelliJ**:
1. Open IDEA, and import project.
2. Import the project by pointing IntelliJ to the build.gradle file.
3. Run the following command to generate the runners for the mod in IntelliJ (Client,Server,Data,GameTestServer):
   Windows: `./gradlew.bat genIntellijRuns`
   Linux/MacOS: `./gradlew genIntellijRuns`
4. Refresh the Gradle Project in IDEA if required.

**If you prefer to use VSCode**:
1. Run the following command to generate the runners for the mod in VSCode (Client,Server,Data,GameTestServer):
   Windows: `./gradlew.bat genVSCodeRuns`
   Linux/MacOS: `./gradlew genVSCodeRuns`
2. Open the project in VSCode by running `code .`

If at any point you are missing libraries in your IDE, or you've run into problems you can 
run `gradlew --refresh-dependencies` to refresh the local cache. `gradlew clean` to reset everything 
{this does not affect your code} and then start the process again.

### Mapping Names:
This Project uses the mappings provided by [ParchmentMC](https://parchmentmc.org/docs/getting-started)

## Credit:
- sinkillerj the developer of [Project E](https://github.com/sinkillerj/ProjectE) for basic iron band texture.
- TheIllusiveC4 for the [CuriosAPI](https://github.com/TheIllusiveC4/Curios) saving me so much time.
- The [ParchmentMC](https://parchmentmc.org/docs/getting-started) team for their neutral bindings.
- The Industrial Forgoing Project for some base textures that were modified