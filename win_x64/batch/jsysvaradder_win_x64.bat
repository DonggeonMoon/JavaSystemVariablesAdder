set /p version=
setx JAVA_HOME -m "C:/Program Files/Java/jdk-"%version%
setx Path -m "%Path%;%JAVA_HOME%\\bin"
