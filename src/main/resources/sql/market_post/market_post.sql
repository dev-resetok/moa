CREATE TABLE TBL_MARKET_POST(
    ID NUMBER CONSTRAINT PK_MARKET_POST PRIMARY KEY,
    LOCATION VARCHAR2(255),
    DETAIL_LOCATION VARCHAR2(255),
    CONSTRAINT FK_MARKET_POST_POST FOREIGN KEY(ID)
    REFERENCES TBL_POST(ID)
);