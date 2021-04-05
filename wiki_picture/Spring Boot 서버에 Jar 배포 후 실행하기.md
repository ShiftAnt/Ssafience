# &#128269; Spring Boot 서버에 Jar 배포 후 실행



## 0. 목차

1. 프로젝트 빌드
2. Jar 파일 실행
3. Jar 프로세스 종료



## 1.  프로젝트 빌드

0. 준비 사항

   * (Spring Boot 경우) pom.xml에 다음 빌드 플러그인이 있는 지 확인

     > ```xml
     > <build>
     > 		<plugins>
     > 			<plugin>
     > 				<groupId>org.springframework.boot</groupId>
     > 				<artifactId>spring-boot-maven-plugin</artifactId>
     > 			</plugin>
     > 		</plugins>
     > 	</build>
     > ```

   * (VSCode 경우) 환경변수에 JAVA_HOME이 추가되어 있는 지 확인 (최신 버전의 VSCode에서는 JDK 11 이상을 지원하므로 주의)

     > ![image-20200730103514301](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20200730103514301.png)

   * (Windows cmd 경우)  메이븐 압축(다운로드: http://maven.apache.org/download.cgi)을 푼 뒤 환경변수에 MAVEN_HOME 추가 및 path (C:\apache-maven-3.6.3\bin)추가

     > ![image-20200730103901103](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20200730103901103.png)

   

1. Spring STS

   * 프로젝트 오른쪽 버튼 클릭 -> Run As -> Maven Build -> Goals에 package입력 -> 확인

   * 성공 화면

     > ![image-20200730104415193](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20200730104415193.png)

2. Visual Studio Code

   * 내부 터미널 ->  `cd` 명령어를 통해 Spring Boot 프로젝트 디렉토리로 이동 -> `Ctrl + Shift + p`  -> `>maven:execute commands` 입력 -> package 선택

   * 주의

     > 전체 프로젝트 디렉토리가 아닌 Spring Boot 디렉토리에서 작업 해야 됨

   * 성공화면

     > ![image-20200730105108189](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20200730105108189.png)

3. command line

   * cd 명령어를 통해 Spring Boot 프로젝트 디렉토리로 이동 -> `mvn package` 입력

   * 성공화면

     > ![image-20200730110307874](C:\Users\multicampus\AppData\Roaming\Typora\typora-user-images\image-20200730110307874.png)

4. Terminal (추천)
   * `mvn -version` 실행 후 설치가 되어 있지 않으면 maven 설치(`sudo apt install maven`)
   * Spring Boot 프로젝트 디렉토리로 이동 후 mvn package 실행





## 2. Jar 파일 실행

* jar 파일은 Spring Boot 프로젝트 내 target 폴더 안에 있음
* `java -jar [폴더 경로/jar 파일 이름.jar]` 실행
* 터미널이 꺼져도 항상 켜진 상태로 유지하고 싶으면 `nohup java -jar [폴더 경로/jar 파일 이름.jar]` 실행





## 3. Jar 프로세스 종료

* 새로 만들어진 Jar 파일을 실행 시키기 위해선 기존의 파일을 종료해야 함.

* 기존 프로세스를 종료하는 2가지 방법을 소개

     >1. `ps -ef` 명령어로 jar 파일의 프로세스 번호를 찾아 종료 `kill -9 프로세스번호`
     >   * 매번 프로세스 번호가 달라질 수 있기 때문에 추천하지 않음
     >2. 해당 프로세스가 사용하는 포트로 프로세스를 종료 `fuser -k 포트번호/tcp`

* 프로세스 종료 후 다시 Jar 파일을 실행하면 새로 만들어진 스프링 서버를 올릴 수 있음