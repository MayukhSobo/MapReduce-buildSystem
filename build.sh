rm -rf appClasses && mkdir appClasses
javac -cp `hadoop classpath` -d appClasses *.java
jar -cvf ./$1.jar -C appClasses/ .
