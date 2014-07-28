If you run Gradle with gradlew, the wrapper checks if a Gradle distribution
for the wrapper is available. If not it tries to download it,
otherwise it delegates to the gradle command of this distribution
with all the arguments passed originally to the gradlew command.

To build: ./gradlew build
To run tests: ./gradlew test
To run application: ./gradlew run -Pargs=your_file.txt
To create jar: ./gradlew jar ( it is in /build/libs folder )