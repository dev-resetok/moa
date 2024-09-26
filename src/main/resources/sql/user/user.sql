CREATE SEQUENCE SEQ_USER;

CREATE TABLE TBL_USER(
    ID NUMBER CONSTRAINT PK_USER PRIMARY KEY,
    USER_ID VARCHAR2(255) NOT NULL,
    USER_EMAIL VARCHAR2(255) NOT NULL,
    USER_PASSWORD VARCHAR2(255) NOT NULL,
    USER_TYPE NUMBER NOT NULL,      -- 0 : 일반, 1 : 대학생, 2 : 교수
    USER_NAME VARCHAR2(255),
    USER_GENDER NUMBER,             -- 0 : 남성, 1 : 여성
    USER_BIRTHDAY VARCHAR2(255),
    USER_AREA VARCHAR2(255),
    USER_DETAILED_AREA VARCHAR2(255),
    USER_ADDRESS VARCHAR2(255),
    USER_INTRODUCTION VARCHAR2(255),
    USER_HOMEPAGE_ADDRESS VARCHAR2(255),
    USER_CELL_PHONE VARCHAR2(255),
    USER_PHONE VARCHAR2(255),
    USER_FAX VARCHAR2(255),
    USER_MAJOR VARCHAR2(255),      -- USER_TYPE이 일반일 경우 학과 정보가 없기 때문에 NOT NULL 제외
    CREATED_DATE DATE DEFAULT SYSDATE,
    UPDATED_DATE DATE DEFAULT SYSDATE
);

SELECT * FROM TBL_USER;

ALTER TABLE TBL_USER