//이 프로그램은 관리자 권한으로 실행돼야 합니다. This program MUST be run as administrator.
import java.util.Scanner;

public class jsysvaradder_x64 {	
	public static void main(String[] args) throws Exception {
		System.out.println("JDK 버전을 입력하세요:");
		Scanner sc = new Scanner(System.in);
		String version = sc.next();
				
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("setx JAVA_HOME -m \"C:\\Program Files\\Java\\jdk-"+version+"\"");
		runtime.exec("setx Path -m \"%Path%;%JAVA_HOME%\\bin\"");
	}
}
