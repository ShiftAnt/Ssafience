# MariaDB 정리

## Trigger

> DELIMITER
>
> > 구분 문자
> >
> > 일반 텍스트 또는 데이터 스트림에서 별도의 독립적 영역 사이의 경계를 지정하는 데 사용하는 하나의 문자 혹은 문자 배열
> >
> > 내부에 세비 콜론 쓰는 것을 구분하여 사용하기 위해 사용
> >
> > 사용 예:
> >
> > ```mariadb
> > DELIMITER $$
> > CREATE PROCEDURE test()
> > BEGIN
> > DECLARE i INT;
> > SET I = 0;
> > WHILE I < 100000 DO
> > INSERT INTO account(createDatetime) VALUES(now());
> > SET i = i + 1;
> > END WHILE;
> > END $$
> > DELIMITER ;
> > ```



## procedure vs function

> 둘 다 구조는 같음
>
> 둘 다 파라미터 값을 지정하고 리턴 값ㅇ르 가짐
>
> 프로시져는 코딩을 서버(DB상)에서 함
>
> 함수는 클라이언트에서 함
>
> 프로시져: 클라이언트가 호출하면 프로시져는 받은 값을 서버에서 실행하여 원하는 값을 걸러내면 다시 클라이언트에게 넘겨줌
>
> 함수: 클라이언트가 호출하면 서버에서 필요한 값들을 가지고와서 자체적으로 실행하여 원하는 값을 걸러내고 그 값을 호출했던 클라이언트에게 넘겨 줌
>
> 
>
> 속도는 프로시져가 빠름 (서버 속도가 훨씬 빠르기 때문)
>
> 

