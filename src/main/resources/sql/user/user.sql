CREATE TABLE TBL_USER(
    ID NUMBER CONSTRAINT PK_USER PRIMARY KEY,
    USER_ID VARCHAR2(255) NOT NULL,
    USER_EMAIL VARCHAR2(255) NOT NULL,
    USER_PASSWORD NUMBER NOT NULL,
    USER_TYPE NUMBER NOT NULL,
    USER_NAME VARCHAR2(255) NOT NULL,
    USER_GENDER VARCHAR2(255),
    USER_BIRTHDAY NUMBER,
    USER_AREA VARCHAR2(255),
    USER_DETAILED_AREA VARCHAR2(255),
    USER_ADDRESS VARCHAR2(255),
    USER_INTRODUCE VARCHAR2(255),
    USER_HOMEPAGE_ADDRESS VARCHAR2(255),
    USER_CELL_PHONE_NUMBER NUMBER,
    USER_PHONE_NUMBER NUMBER NOT NULL,
    USER_FAX_NUMBER NUMBER,
    USER_MAJOR VARCHAR2(255),      -- USER_TYPE이 일반일 경우 학과 정보가 없기 때문에 NOT NULL 제외
    CREATED_DATE DATE DEFAULT SYSDATE,
    UPDATED_DATE DATE DEFAULT SYSDATE
);