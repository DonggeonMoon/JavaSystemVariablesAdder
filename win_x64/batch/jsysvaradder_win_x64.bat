::이 프로그램은 관리자 권한으로 실행돼야 합니다. This program MUST be run as administrator.
set /p version=
setx JAVA_HOME -m "C:/Program Files/Java/jdk-"%version%
setx Path -m "%Path%%%JAVA_HOME%%\bin"
