# 12일차

<br/>

## 목차
1. [데이터 계층](#데이터-계층-persistence-layer)
2. [비즈니스 계층](#비즈니스-계층-service-layer)
3. [프레젠테이션 계층](#프레젠테이션-계층-presentation-layer)
4. [데이터 객체](#데이터-객체-dto-vo)
5. [아키텍처/패턴](#아키텍처패턴-관련-용어)
6. [세션 및 사용자 상태 관리](#세션-및-사용자-상태-관리)
7. [ORM 용어](#orm-관련-용어)
8. [기본 자바 유틸 패키지](#기본-자바-유틸-패키지)
9. [웹 관련 패키지](#웹-관련-패키지)
10. [파일 업로드/다운로드](#파일-업로드--다운로드-관련)
11. [예외 처리](#예외-처리-관련)
12. [DB 연동](#db-연동-관련)
13. [Spring 프레임워크](#spring-프레임워크-관련-패키지)
14. [JSON 처리](#json-처리-프론트와-데이터-교환)
15. [유효성 검사/바인딩](#유효성-검사--바인딩)
16. [정리](#정리)

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

<br/><br/>

## 게시판 개발에서 사용되는 import 패키지와 클래스 정리

<br/>

### 기본 자바 유틸 패키지

|import 문|설명|예시|
|:--|:--|:--|
|`import java.util.List;`|리스트 자료구조. DB에서 받은 게시글 목록 저장|`List<BoardDTO> list = new ArrayList<>();`|
|`import java.util.ArrayList;`|리스트의 구현체|게시글 목록 저장|
|`import java.util.Map;`|key-value 구조의 데이터 저장|파라미터나 설정 값 전달|
|`import java.util.HashMap;`|Map의 구현체|`Map<String, Object> data = new HashMap<>();`|
|`import java.util.Date;`|날짜/시간 저장 (구버전)|게시글 작성일 등|
|`import java.time.LocalDateTime;`|최신 날짜/시간 API|JPA, Java 8 이상에서 선호|
|`import java.time.format.DateTimeFormatter;`|날짜 포맷 처리|화면에 날짜를 출력할 때 사용|

<br/>

### 웹 관련 패키지

|import 문|설명|예시|
|:--|:--|:--|
|`import javax.servlet.http.HttpServletRequest;`|요청 정보 받기|파라미터, 세션 등|
|`import javax.servlet.http.HttpServletResponse;`|응답 정보 작성|리다이렉트, 응답 상태 설정 등|
|`import javax.servlet.http.HttpSession;`|사용자 세션 관리|로그인 유지|
|`import org.springframework.web.bind.annotation.*;`|REST API 또는 요펑 매핑|`@GetMapping`, `@PostMapping` 등|
|`import org.springframework.stereotype.Controller;`|스프링 MVC 컨트롤러 지정|`@Controller` 클래스|
|`import org.springframework.ui.Model;`|View로 데이터 전달|`model.addAttribute(...)`|

<br/>

### 파일 업로드 / 다운로드 관련

|import 문|설명|예시|
|:--|:--|:--|
|`import org.springframework.web.multipart.MultipartFile;`|파일 업로드용 객체|게시판에서 파일 첨부 시|
|`import java.io.File;`|파일 객체|업로드한 파일 저장|
|`import java.io.IOException;`|파일 처리 중 발생할 수 있는 예외| - |

<br/>

### 예외 처리 관련

|import 문|설명|
|:--|:--|
|`import java.lang.Exception;`|기본 예외 클래스|
|`import java.io.IOException;`|입출력 예외|
|`import org.springframework.dao.DataAccessException;`|DB 접근 중 발생하는 예외|
|`import org.springframework.web.bind.annotation.ExceptionHandler;`|컨트롤러 내 예외 처리|

<br/>

### DB 연동 관련
MyBatis 사용하는 경우
|import 문|설명|
|:--|:--|
|`import org.apache.ibatis.annotations.Mapper;`|Mapper 인터페이스 지정|
|`import org.apache.ibatis.annotations.Select;`|SQL 직접 정의 (Annotation 방식)|

-------------------------------------------------------------------------------

JPA 사용하는 경우
|import 문|설명|
|:--|:--|
|`import org.springframework.data.jpa.repository.JpaRepository;`|Repository 인터페이스|
|`import javax.persistence.*;`|Entity 관련 어노테이션들: `@Entity`, `@Id`, `@Column`, `@Table` 등|
|`import org.hibernate.annotations.CreationTimestamp;`|등록 시간 자동 생성|
|`import org.hibernate.annotations.UpdateTimestamp;`|수정 시간 자동 갱신|

<br/>

### Spring 프레임워크 관련 패키지
|import 문|설명|
|:--|:--|
|`import org.springframework.beans.factory.annotation.Autowired;`|의존성 주입 (DI)|
|`import org.springframework.stereotype.Service;`|서비스 계층 지정|
|`import org.springframework.transaction.annotation.Transactional;`|트랜잭션 처리|
|`import org.springframework.context.annotation.Configuration;`|설정 클래스 정의|

<br/>

### JSON 처리 (프론트와 데이터 교환)
|import 문|설명|사용 라이브러리|
|:--|:--|:--|
|`import com.fasterxml.jackson.databind.ObjectMapper;`|객체 ↔ JSON 변환|Jackson|
|`import org.json.JSONObject;`|간단한 JSON 생성|org.json|
|`import com.google.gson.Gson;`|JSON 직렬화/역직렬화|Gson|

<br/>

### 유효성 검사 / 바인딩
|import 문|설명|
|:--|:--|
|`import javax.validation.constraints.*;`|DTO 필드 유효성 검사용 어노테이션들|
|`import org.springframework.validation.BindingResult;`|유효성 검사 결과 처리|

<br/>

### 정리
* DAO/Repository/Entity → 데이터 계층
* DTO/VO → 데이터 객체
* Service → 비즈니스 계층
* Controller/View/Model → 프레젠테이션 계층
* JSP/Servlet → View 구현 기술
* Spring MVC, JPA → 아키텍처 및 프레임워크

-------------------------------------------------------------------------------

* `java.util.*` → 컬렉션, 날짜 등 기본 유틸
* `javax.servlet.*` → 요청/응답/세션 등 웹 기능
* `org.springframework.*` → 스프링 MVC 구성 요소
* `java.io.*` → 파일 입출력 관련
* `java.time.*` → Java 8 이상의 날짜/시간 처리
* `com.fasterxml.jackson.*`, `org.json.*` → JSON 처리

<br/><br/>

[위로 가기](#12일차)