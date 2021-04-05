# Front-End 배포



## 0. 목차

   1. 준비사항
   2. 빌드
   3. Nginx 설정
   4. Nginx 재시작 및 확인

   

## 1. 준비

   * nodejs, npm 설치
   * 프로젝트에 사용된 패키지 설치 (@vue/cli 등)
   * Nginx 설치 `sudo apt install nginx` 



## 2. 빌드

   * `cd` 명령어로 Front-End 프로젝트 경로로 이동 후 `npm run build` 명령어 실행
   * 빌드에 성공하면 프로젝트 폴더 내 `dist` 폴더가 생성 됨




## 3. Nginx 설정

* `sudo vi /etc/nginx/sites-available/default` vi 편집기로 Nginx 설정 파일을 엶

* <사진>

  > `root`: build로 생성된 dist 폴더의 전체 경로를 적음
  >
  > `location /`: 가장 최상단의 경로로 여기선 dist 폴더 내의 index.html이 최상단의 경로가 됨



## 4. Nginx 재시작 및 확인

* 작업을 반영하기 위해선 Nginx를 다시시작해야 한다.
* `sudo service nginx restart`
* 재시작이 완료되면 호스트 이름을 통해 외부에서 접속 테스트



