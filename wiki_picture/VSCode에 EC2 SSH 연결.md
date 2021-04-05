# VSCode에 EC2 SSH 연결

## 0. 목차

   1. VSCode 설치 및 실행
   2. Remote - SSH 확장 설치
   3. Remote - Configure 파일 설정
   4. EC2 연결







## 1. VSCode 설치 및 실행

   * [공식홈페이지](https://code.visualstudio.com/)에서 운영체제에 맞는 VSCode 설치
   * <사진> Other downloads 선택 하면 운영체제 / 아키텍처 별 설치파일 확인 가능
     * Windows 사용자의 경우 본인만 사용하는 컴퓨터면 System Installer 설치 권장
       * User / System 설치되는 경로가 다름
   * 설치 후 실행 파일을 실행







## 2. Remote - SSH 확장 설치

   * VSCode에서 제공하는 확장(Extensions) 설치
   * <사진>
   * 확장 탭 선택 후 remote - ssh 검색
   * Microsoft에서 만든 Remote - SSH 확장 설치







## 3. Remote - Configure 파일 설정

   * VSCode 하단의 <사진> 아이콘 클릭

   * 상단에 표시되는 내용 중 Remote - SSH: Open Configuration File... 클릭 하여 설정 파일 <사진> 열기

   * `User` 하단에 `IdentityFile`을 추가한 뒤 인증키 파일의 경로를 넣음

     * <사진>

       > `Host`: 연결 시 목록에 보여질 이름(띄어쓰기 사용 X)
       >
       > `HostName`: 연결할 호스트의 주소 예) xxx.awsxx.com
       >
       > `User`: 연결할 사용자 이름
       >
       > `IdentityFile`: 인증키(.pem)의 경로(.pem 파일도 포함해야 함)

     

   

   

   

## 4. EC2 연결

   * 하단의  `><` 버튼 클릭 후 Remote - SSH: Connect to Host... 클릭
   * <사진>
   * 3번 과정에서 `Host`에 입력한 이름을 선택하면 완료



