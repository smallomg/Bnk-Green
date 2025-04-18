--고객
CREATE TABLE customer( 
c_code NUMBER(3) PRIMARY KEY,
c_name VARCHAR2(50),
c_ceo VARCHAR2(10),
c_addr VARCHAR2(50),
c_phone VARCHAR2(20)
);

--상품정보
CREATE TABLE product( 
p_code NUMBER(3) PRIMARY KEY,
p_name VARCHAR2(50),
p_cost NUMBER(10),
p_group VARCHAR2(50)
);

 --상품재고
CREATE TABLE stock(
s_qty NUMBER(10) PRIMARY KEY,
CONSTRAINT st_p_code
FOREIGN KEY (p_code)
REFERENCES product(p_code)
);

--거래내역
CREATE TABLE trade( 
t_seq NUMBER(10) PRIMARY KEY,
CONSTRAINT tr_p_code
FOREIGN KEY (p_code)
REFERENCES product(p_code),
CONSTRAINT tr_c_code
FOREIGN KEY (c_code)
REFERENCES product(c_code),
t_date DATE,
t_qty NUMBER(10),
t_cost NUMBER(10)
);