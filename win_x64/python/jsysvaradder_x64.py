#이 프로그램은 관리자 권한으로 실행돼야 합니다. This program MUST be run as administrator.
import os

version = str(input("자바 버전을 입력하세요"))
os.system("setx JAVA_HOME -m \"C:\\Program Files\\Java\\jdk-"+version+"\"")
os.system("setx Path -m \"%Path%;%JAVA_HOME%\\bin\"")
