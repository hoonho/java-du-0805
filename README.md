# 12일차

<br/>

## 게시판 개발에서 사용되는 핵심 용어 정리

<br/>

### 데이터 계층 (Persistence Layer)
데이터베이스와 관련된 용어

|용어|설명|사용 기술|
|:--|:--|:--|
|DAO(Data Access Object)|DB 접근 전담 객체. SQL 실행하여 데이터 CRUD 처리|MyBatis, JDBC|
|Repository|JPA에서 DAO 역할. 인터페이스만 정의하면 Spring이 구현|Spring Data JPA|
|Entity|테이블과 매핑되는 자바 객체. ORM에서 사용|JPA, Hiberbate|
|Mapper|SQL과 자바 인터페이스를 매핑|MyBatis|
|CRUD|Create, Read, Update, Delete. 기본 DB 연산|전통적 DB 연산|

<br/>

### 비즈니스 계층 (Service Layer)
실제 로직, 규칙, 처리 과정을 담당하는 계층

|용어|설명|역할|
|:--|:--|:--|
|Service|비즈니스 로직 처리 계층. DAO/Repository 호출|게시글 등록, 로그인 처리 등|
|Transaction|여러 작업이 모두 성공해야 하는 단위. 실패 시 전체 롤백|게시글 저장 + 파일 저장 등|

<br/>

### 프레젠테이션 계층 (Presentation Layer)
사용자 요청 처리와 응답 반환, 화면 출력 등

|용어|설명|관련 기술|
|:--|:--|:--|
|Controller|사용자 요청 처리. Service 호출하고 View 반환|Spring MVC, Servlet|
|View|사용자에게 보여지는 화면|JSP, Thymeleaf, HTML|
|Model|View에 데이터 전달 시 사용하는 객체|Spring MVC|
|Servlet|자바 기반 웹 요청 처리기. Controller의 원형|Java EE|
|JSP|JavaServer Pages. 서버에서 동적 HTML 생성|View 구현 기술|

<br/>

### 데이터 객체 (DTO, VO)
계층 간 데이터 전달에 사용되는 객체

|용어|설명|특징|
|:--|:--|:--|
|DTO (Data Transfer Object)|계층 간 데이터 전달용 객체. getter/setter만 존재|가변 객체|
|VO (Value Object)|값 자체를 표현하는 객체. 불변성을 유지|equals/hashCode 중요|

<br/>

### 아키텍처/패턴 관련 용어
전체 구조나 개발 방식과 관련된 개념

|용어|설명|
|:--|:--|
|MVC (Model-View-Controller)|웹 애플리케이션을 세 역할로 분리하는 아키텍처|
|DI (Dependency Injection)|의존성 주입. 객체 간의 관계를 스프링이 관리|
|IoC (Inversion of Control)|제어의 역전. 객체 생성/관리를 개발자가 아닌 프레임워크가 수행|
|Bean|스프링 컨테이너가 관리하는 객체|

<br/>

### 세션 및 사용자 상태 관리
사용자 상태 유지에 관련된 개념

|용어|설명|
|:--|:--|
|Session|서버가 사용자 상태를 유지하기 위한 저장소|
|Cookie|클라이언트에 저장되는 사용자 데이터|

<br/>

### ORM 관련 용어
객체지향적으로 DB를 다루기 위한 기술

|용어|설명|기술|
|:--|:--|:--|
|ORM (Object-Relational Mapping)|객체와 관계형 DB 매핑|JPA, Hibernate|
|JPA (Java Persistence API)|자바 ORM 표준 명세|Hibernate가 대표 구현체|
|Hibernate|JPA의 구현체. 자바 객체 <-> DB 자동 매핑 지원| - |