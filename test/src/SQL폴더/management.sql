-- 1. 영업사원 테이블
CREATE TABLE salerymen (
    s_code   NUMBER(6) PRIMARY KEY,    -- 사원 코드
    s_name   VARCHAR2(50) NOT NULL,    -- 사원 이름
    s_phone  VARCHAR2(20)             -- 사원 연락처
);

-- 2. 상품정보 테이블
CREATE TABLE product (
    p_code   NUMBER(6) PRIMARY KEY,    -- 상품 코드
    p_name   VARCHAR2(50) NOT NULL   -- 상품명
);

-- 3. 거래처 정보 테이블
CREATE TABLE customer (
    c_code    NUMBER(6) PRIMARY KEY,   -- 거래처 코드
    c_name    VARCHAR2(50) NOT NULL,   -- 거래처 명
    c_ceo     VARCHAR2(50),            -- 경영자
    c_addr    VARCHAR2(100),           -- 주소
    c_phone   VARCHAR2(20)            -- 연락처
);

-- 4. 판매장부 테이블
CREATE TABLE sale (
    sa_code   NUMBER(6) PRIMARY KEY,   -- 출고장부 코드
    sa_date   DATE NOT NULL,           -- 출고 날짜
    sa_stock  NUMBER(10) NOT NULL CHECK (sa_stock > 0), -- 출고 수량
    sa_cost   NUMBER(12,2) NOT NULL CHECK (sa_cost >= 0), -- 상품 단가
    sa_total  NUMBER(15,2) NOT NULL CHECK (sa_total >= 0), -- 출고 총액
    c_code    NUMBER(6) NOT NULL,      -- 거래처 코드
    p_code    NUMBER(6) NOT NULL,      -- 상품 코드
    s_code    NUMBER(6) NOT NULL,      -- 사원 코드
    FOREIGN KEY (c_code) REFERENCES customer(c_code),
    FOREIGN KEY (p_code) REFERENCES product(p_code),
    FOREIGN KEY (s_code) REFERENCES salerymen(s_code)
);

-- 5. 매입장부 테이블
CREATE TABLE purchase (
    pc_code   NUMBER(6) PRIMARY KEY,   -- 매입장부 코드
    pc_date   DATE NOT NULL,           -- 입고 날짜
    pc_stock  NUMBER(10) NOT NULL CHECK (pc_stock > 0), -- 입고 수량
    pc_cost   NUMBER(12,2) NOT NULL CHECK (pc_cost >= 0), -- 상품 단가
    pc_total  NUMBER(15,2) NOT NULL CHECK (pc_total >= 0), -- 입고 총액
    c_code    NUMBER(6) NOT NULL,      -- 거래처 코드
    p_code    NUMBER(6) NOT NULL,      -- 상품 코드
    s_code    NUMBER(6) NOT NULL,      -- 사원 코드
    FOREIGN KEY (c_code) REFERENCES customer(c_code),
    FOREIGN KEY (p_code) REFERENCES product(p_code),
    FOREIGN KEY (s_code) REFERENCES salerymen(s_code)
);

-- 6. 상품 재고 테이블
CREATE TABLE stock (
    s_code   NUMBER(3) PRIMARY KEY,    -- 재고 코드
    s_qty    NUMBER(10),               -- 재고 수량
    p_code   NUMBER(3),                -- 상품 코드
    FOREIGN KEY (p_code) REFERENCES product(p_code)
);

-- 사원 번호 자동 증가 시퀀스
CREATE SEQUENCE seq_sal_code START WITH 1 INCREMENT BY 1 NOCACHE;

-- 출고장부 번호 자동 증가 시퀀스
CREATE SEQUENCE seq_sa_code START WITH 1 INCREMENT BY 1 NOCACHE;

-- 매입장부 번호 자동 증가 시퀀스
CREATE SEQUENCE seq_pc_code START WITH 1 INCREMENT BY 1 NOCACHE;

-- 재고코드 자동 증가 시퀀스
CREATE SEQUENCE seq_st_code START WITH 1 INCREMENT BY 1 NOCACHE;

drop sequence seq_pc_code;

-- ===============================================================================

drop table purchase;
drop table sale;
drop table stock;
drop table product;
drop table salerymen;
drop table customer;
drop sequence seq_sa_code;
drop sequence seq_pc_code;
drop sequence seq_st_code;

-- ===============================================================================
-- 샘플데이터

-- 1. 영업사원 샘플 데이터
INSERT INTO salerymen (s_code, s_name, s_phone) VALUES (seq_sal_code.NEXTVAL, '김영업', '010-1111-2222');
INSERT INTO salerymen (s_code.NEXTVAL, s_name, s_phone) VALUES (seq_sal_code.NEXTVAL, '박판매', '010-2222-3333');
INSERT INTO salerymen (s_code, s_name, s_phone) VALUES (seq_sal_code.NEXTVAL, '이마케팅', '010-3333-4444');

delete FROM salerymen;

select * from salerymen;

-- 2. 상품정보 샘플 데이터
INSERT INTO product (p_code, p_name) VALUES (1, '노트북');
INSERT INTO product (p_code, p_name) VALUES (2, '스마트폰');
INSERT INTO product (p_code, p_name) VALUES (3, '태블릿');
INSERT INTO product (p_code, p_name) VALUES (4, '무선이어폰');
INSERT INTO product (p_code, p_name) VALUES (5, '스마트워치');

select * from product;

-- 3. 거래처 정보 샘플 데이터 (거래처 코드는 시퀀스가 없어 직접 값 입력)
INSERT INTO customer (c_code, c_name, c_ceo, c_addr, c_phone) 
VALUES (1, '가전마트', '홍길동', '서울시 강남구 테헤란로 123', '02-555-1234');
INSERT INTO customer (c_code, c_name, c_ceo, c_addr, c_phone) 
VALUES (2, '전자랜드', '김사장', '부산시 해운대구 센텀로 456', '051-777-8888');
INSERT INTO customer (c_code, c_name, c_ceo, c_addr, c_phone) 
VALUES (3, '디지털월드', '박대표', '대구시 동구 동대구로 789', '053-222-3333');
INSERT INTO customer (c_code, c_name, c_ceo, c_addr, c_phone) 
VALUES (4, '테크놀로지', '이사장', '인천시 연수구 송도로 101', '032-444-5555');

select * from customer;

-- 4. 상품 재고 샘플 데이터
INSERT INTO stock (s_code, s_qty, p_code) 
VALUES (seq_st_code.NEXTVAL, 50, 1);
INSERT INTO stock (s_code, s_qty, p_code) 
VALUES (seq_st_code.NEXTVAL, 100, 2);
INSERT INTO stock (s_code, s_qty, p_code) 
VALUES (seq_st_code.NEXTVAL, 75, 3);
INSERT INTO stock (s_code, s_qty, p_code) 
VALUES (seq_st_code.NEXTVAL, 200, 4);
INSERT INTO stock (s_code, s_qty, p_code) 
VALUES (seq_st_code.NEXTVAL, 60, 5);

select * from stock;

-- 5. 매입장부 샘플 데이터 (매입장부 코드는 직접 값 입력)
INSERT INTO purchase (pc_code, pc_date, pc_stock, pc_cost, pc_total, c_code, p_code, s_code)
VALUES (seq_pc_code.NEXTVAL, TO_DATE('2025-04-01', 'YYYY-MM-DD'), 10, 1100000.00, 11000000.00, 1, 1, 1);
INSERT INTO purchase (pc_code, pc_date, pc_stock, pc_cost, pc_total, c_code, p_code, s_code)
VALUES (seq_pc_code.NEXTVAL, TO_DATE('2025-04-02', 'YYYY-MM-DD'), 20, 800000.00, 16000000.00, 2, 2, 2);
INSERT INTO purchase (pc_code, pc_date, pc_stock, pc_cost, pc_total, c_code, p_code, s_code)
VALUES (seq_pc_code.NEXTVAL, TO_DATE('2025-04-03', 'YYYY-MM-DD'), 15, 600000.00, 9000000.00, 3, 3, 3);
INSERT INTO purchase (pc_code, pc_date, pc_stock, pc_cost, pc_total, c_code, p_code, s_code)
VALUES (seq_pc_code.NEXTVAL, TO_DATE('2025-04-04', 'YYYY-MM-DD'), 30, 170000.00, 5100000.00, 4, 4, 1);
INSERT INTO purchase (pc_code, pc_date, pc_stock, pc_cost, pc_total, c_code, p_code, s_code)
VALUES (seq_pc_code.NEXTVAL, TO_DATE('2025-04-05', 'YYYY-MM-DD'), 25, 240000.00, 6000000.00, 1, 5, 2);

select * from purchase;

-- 6. 판매장부 샘플 데이터 (판매장부 코드는 직접 값 입력)
INSERT INTO sale (sa_code, sa_date, sa_stock, sa_cost, sa_total, c_code, p_code, s_code)
VALUES (seq_sa_code.NEXTVAL, TO_DATE('2025-04-10', 'YYYY-MM-DD'), 2, 1250000.00, 2500000.00, 3, 1, 1);
INSERT INTO sale (sa_code, sa_date, sa_stock, sa_cost, sa_total, c_code, p_code, s_code)
VALUES (seq_sa_code.NEXTVAL, TO_DATE('2025-04-11', 'YYYY-MM-DD'), 5, 900000.00, 4500000.00, 2, 2, 2);
INSERT INTO sale (sa_code, sa_date, sa_stock, sa_cost, sa_total, c_code, p_code, s_code)
VALUES (seq_sa_code.NEXTVAL,  TO_DATE('2025-04-12', 'YYYY-MM-DD'), 3, 680000.00, 2040000.00, 4, 3, 3);
INSERT INTO sale (sa_code, sa_date, sa_stock, sa_cost, sa_total, c_code, p_code, s_code)
VALUES (seq_sa_code.NEXTVAL,  TO_DATE('2025-04-13', 'YYYY-MM-DD'), 10, 190000.00, 1900000.00, 1, 4, 1);
INSERT INTO sale (sa_code, sa_date, sa_stock, sa_cost, sa_total, c_code, p_code, s_code)
VALUES (seq_sa_code.NEXTVAL,  TO_DATE('2025-04-14', 'YYYY-MM-DD'), 8, 260000.00, 2080000.00, 3, 5, 2);

select * from sale;



