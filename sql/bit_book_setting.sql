/*  
    mini project DB자바라
    
    테이블생성  관련된 SQL문
    
    eXERD 수정사항
    1.  table 이름 변경   21/11/10
            book       -> bit_book, 
            order      -> bit_orders,
            order_log  -> bit_orders_log
            user       -> bit_users

*/


/* 카테고리 */
----------------------- 카테고리 시작 ----------------------------------------
 DROP TABLE category CASCADE CONSTRAINTS;
 DROP INDEX PK_category;
/* 카테고리 */
CREATE TABLE "SCOTT"."CATEGORY" 
   (   "CATEGORYID" NUMBER(8,0) NOT NULL ENABLE, 
   "CATEGORYNAME" VARCHAR2(40 BYTE) NOT NULL ENABLE, 
    CONSTRAINT "PK_CATEGORY" PRIMARY KEY ("CATEGORYID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "SCOTT"."CATEGORY"."CATEGORYID" IS '카테고리고유번호';
   COMMENT ON COLUMN "SCOTT"."CATEGORY"."CATEGORYNAME" IS '카테고리이름';
   COMMENT ON TABLE "SCOTT"."CATEGORY"  IS '카테고리';


--CREATE UNIQUE INDEX PK_category
--	ON category (
--		categoryid ASC
--	);

--ALTER TABLE category
--	ADD
--		CONSTRAINT PK_category
--		PRIMARY KEY (
--			categoryid
--		);
        
------------------------ Category 끝 -------------------------------------


------------------------ Book 시작 ----------------------------------------


/* 책 */

DROP INDEX PK_bit_book;
DROP TABLE bit_book CASCADE CONSTRAINTS;

/* 책 */
CREATE TABLE "SCOTT"."BIT_BOOK" 
   (   "BOOKID" NUMBER(8,0) NOT NULL ENABLE, 
   "BOOKNAME" VARCHAR2(40 BYTE) NOT NULL ENABLE, 
   "PRICE" NUMBER(10,0) NOT NULL ENABLE, 
   "WRITER" VARCHAR2(40 BYTE) NOT NULL ENABLE, 
   "PUBLISHER" VARCHAR2(40 BYTE) NOT NULL ENABLE, 
   "CATEGORYID" NUMBER(8,0), 
   "STOCK" NUMBER(2,0) DEFAULT 0 NOT NULL ENABLE, 
    CONSTRAINT "PK_BIT_BOOK" PRIMARY KEY ("BOOKID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE, 
    CONSTRAINT "FK_CATEGORY_TO_BIT_BOOK" FOREIGN KEY ("CATEGORYID")
     REFERENCES "SCOTT"."CATEGORY" ("CATEGORYID") ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "SCOTT"."BIT_BOOK"."BOOKID" IS '책고유번호';
   COMMENT ON COLUMN "SCOTT"."BIT_BOOK"."BOOKNAME" IS '책이름';
   COMMENT ON COLUMN "SCOTT"."BIT_BOOK"."PRICE" IS '책가격';
   COMMENT ON COLUMN "SCOTT"."BIT_BOOK"."WRITER" IS '저자';
   COMMENT ON COLUMN "SCOTT"."BIT_BOOK"."PUBLISHER" IS '출판사';
   COMMENT ON COLUMN "SCOTT"."BIT_BOOK"."CATEGORYID" IS '카테고리고유번호';
   COMMENT ON COLUMN "SCOTT"."BIT_BOOK"."STOCK" IS '재고';
   COMMENT ON TABLE "SCOTT"."BIT_BOOK"  IS '책';

--CREATE UNIQUE INDEX PK_bit_book
--	ON bit_book (
--		bookid ASC
--	);
/*
ALTER TABLE bit_book
	ADD
		CONSTRAINT PK_bit_book
		PRIMARY KEY (
			bookid
		);

ALTER TABLE bit_book
	ADD
		CONSTRAINT FK_category_TO_bit_book
		FOREIGN KEY (
			categoryid
		)
		REFERENCES category (
			categoryid
		);
*/

---------------------------- 주문로그 테이블 ------------------------------


/* 주문로그 */
DROP INDEX PK_bit_orders_log;
DROP TABLE bit_orders_log CASCADE CONSTRAINTS;

/* 주문로그 */
CREATE TABLE "SCOTT"."BIT_ORDERS_LOG" 
   (   "ORDERID_L" NUMBER(8,0) NOT NULL ENABLE, 
   "ORDERID" NUMBER(8,0) NOT NULL ENABLE, 
    CONSTRAINT "PK_BIT_ORDERS_LOG" PRIMARY KEY ("ORDERID_L", "ORDERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE, 
    CONSTRAINT "FK_BIT_ORDERS_TO_LOG" FOREIGN KEY ("ORDERID")
     REFERENCES "SCOTT"."BIT_ORDERS" ("ORDERID") ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "SCOTT"."BIT_ORDERS_LOG"."ORDERID_L" IS '주문로그번호';
   COMMENT ON COLUMN "SCOTT"."BIT_ORDERS_LOG"."ORDERID" IS '주문고유번호';
   COMMENT ON TABLE "SCOTT"."BIT_ORDERS_LOG"  IS '주문로그';
   
/*
CREATE UNIQUE INDEX PK_bit_orders_log
	ON bit_orders_log (
		orderid_l ASC,
		orderid ASC
	);

ALTER TABLE bit_orders_log
	ADD
		CONSTRAINT PK_bit_orders_log
		PRIMARY KEY (
			orderid_l,
			orderid
		);
*/
        
------------------------------ 주문로그 테이블 -------------------------------

------------------------------- 주문 테이블 ---------------------------------


/* 주문 */
DROP INDEX PK_bit_orders;
DROP TABLE bit_orders CASCADE CONSTRAINTS;

/* 주문 */
CREATE TABLE "SCOTT"."BIT_ORDERS" 
   (   "ORDERID" NUMBER(8,0) NOT NULL ENABLE, 
   "BOOKID" NUMBER(8,0), 
   "USERID" NUMBER(2,0), 
   "ORDERDATE" TIMESTAMP (6), 
    CONSTRAINT "PK_BIT_ORDERS" PRIMARY KEY ("ORDERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE, 
    CONSTRAINT "FK_BIT_BOOK_TO_BIT_ORDERS" FOREIGN KEY ("BOOKID")
     REFERENCES "SCOTT"."BIT_BOOK" ("BOOKID") ENABLE, 
    CONSTRAINT "FK_BIT_USERS_TO_BIT_ORDERS" FOREIGN KEY ("USERID")
     REFERENCES "SCOTT"."BIT_USERS" ("USERID") ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "SCOTT"."BIT_ORDERS"."ORDERID" IS '주문고유번호';
   COMMENT ON COLUMN "SCOTT"."BIT_ORDERS"."BOOKID" IS '책고유번호';
   COMMENT ON COLUMN "SCOTT"."BIT_ORDERS"."USERID" IS '유저고유번호';
   COMMENT ON COLUMN "SCOTT"."BIT_ORDERS"."ORDERDATE" IS '주문일';
   COMMENT ON TABLE "SCOTT"."BIT_ORDERS"  IS '주문';

--CREATE UNIQUE INDEX PK_bit_orders
--	ON bit_orders (
--		orderid ASC
--	);
/*
ALTER TABLE bit_orders
	ADD
		CONSTRAINT PK_bit_orders
		PRIMARY KEY (
			orderid
		);

ALTER TABLE bit_orders
	ADD
		CONSTRAINT FK_bit_book_TO_bit_orders
		FOREIGN KEY (
			bookid
		)
		REFERENCES bit_book (
			bookid
		);
*/
----------------------------------------------------------------------------
--------------------- 유저테이블---------------------------------------------

/* 유저 */

DROP INDEX PK_bit_users;
DROP TABLE bit_users CASCADE CONSTRAINTS;

/* 유저 */
CREATE TABLE "SCOTT"."BIT_USERS" 
   (   "USERID" NUMBER(2,0) NOT NULL ENABLE, 
   "USERNAME" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
   "PASSWORD" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
   "NAME" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
   "EMAIL" VARCHAR2(40 BYTE), 
   "PHNUM" VARCHAR2(40 BYTE), 
   "ADDRESS" VARCHAR2(80 BYTE), 
    CONSTRAINT "PK_BIT_USERS" PRIMARY KEY ("USERID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "SCOTT"."BIT_USERS"."USERID" IS '유저고유번호';
   COMMENT ON COLUMN "SCOTT"."BIT_USERS"."USERNAME" IS '아이디';
   COMMENT ON COLUMN "SCOTT"."BIT_USERS"."PASSWORD" IS '비밀번호';
   COMMENT ON COLUMN "SCOTT"."BIT_USERS"."NAME" IS '이름';
   COMMENT ON COLUMN "SCOTT"."BIT_USERS"."EMAIL" IS '이메일';
   COMMENT ON COLUMN "SCOTT"."BIT_USERS"."PHNUM" IS '전화번호';
   COMMENT ON COLUMN "SCOTT"."BIT_USERS"."ADDRESS" IS '주소';
   COMMENT ON TABLE "SCOTT"."BIT_USERS"  IS '유저';

--CREATE UNIQUE INDEX PK_bit_users
--	ON bit_users (
--		userid ASC
--	);

--ALTER TABLE bit_users
--	ADD
--		CONSTRAINT PK_bit_users
--		PRIMARY KEY (
--			userid
--		);
---------------
--ALTER TABLE bit_orders_log
--	ADD
--		CONSTRAINT FK_bit_orders_TO_log
--		FOREIGN KEY (
--			orderid
--		)
--		REFERENCES bit_orders (
--			orderid
--		);
--        
--
--ALTER TABLE bit_orders
--	ADD
--		CONSTRAINT FK_bit_users_TO_bit_orders
--		FOREIGN KEY (
--			userid
--		)
--		REFERENCES bit_users (
--			userid
--		);
--        