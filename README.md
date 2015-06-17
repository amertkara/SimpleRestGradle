### Jersey REST Boilerplate (with Gradle) ###

A Rest API boilerplate code with Jersey and build with Tomcat. Gradle tomcat plugin is activated (with tomcat 7) and the gradle properties assumes that you have Java 7 installed (you might need to change that).

It is prepared to work on eclipse, ideally it should work with other IDEs.

#### How to Run ####

Tomcat plugin is there to make it easier, simply running `./gradlew tomcatRun` will load the servlet into the container. However if you desire to deploy it in your own instance of tomcat, you can run `./gradlew war` and check the directory `build/libs`. It should prepare a war file that can be deployed to tomcat by simply pasting it under `$TOMCAT_HOME/webapps/`.


[More on How to use Tomcat plugin](https://github.com/bmuschko/gradle-tomcat-plugin)