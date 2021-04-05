# JWT 인증하기







# 0. 환경 설정

* dependency  추가

  > pom.xml
  >
  > ```xml
  >  <!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt -->
  > <dependency>
  >        <groupId>io.jsonwebtoken</groupId>
  >        <artifactId>jjwt</artifactId>
  >        <version>0.9.1</version>
  > </dependency>
  > ```



* JDK10 이상 사용 시 추가 (java.xml.bind 해결)

  > pom.xml
  >
  > ```xml
  > <dependency>
  >    	<groupId>javax.xml.bind</groupId>
  >    	<artifactId>jaxb-api</artifactId>
  >    	<version>2.3.1</version>
  > </dependency>
  > <dependency>
  >    	<groupId>com.sun.xml.bind</groupId>
  >    	<artifactId>jaxb-core</artifactId>
  >    	<version>2.3.0.1</version>
  > </dependency>
  > <dependency>
  >    	<groupId>com.sun.xml.bind</groupId>
  >    	<artifactId>jaxb-impl</artifactId>
  >    	<version>2.3.1</version>
  > </dependency>
  > ```



