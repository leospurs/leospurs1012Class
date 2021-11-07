--앞에서 생성한 전화번호부 테이블을 기준으로 DML 을 작성해봅시다.

​

--1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneInfo_basic;



insert into phoneinfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address)
    values (1, '손흥민', '010-1234-1234', 'son@abc.com', 'LONDON');

insert into phoneinfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address)
    values (2, '황의조', '010-1111-1111', 'eijo@abc.com', 'BORDEUX');



update phoneinfro_basic
set fr_name = '황인범', fr_phonenumber = '010-3333-3333', fr_email = 'hwang@aaa.com'
where idx 2;  


delete from phoneinfo_basic
where idx = 1;


--2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneinfo_univ;
desc phoneinfo_univ;



insert into phoneinfo_univ (idx, fr_u_major, fr_ref)
    values (2,'독어독문', 2);
    
insert into phoneinfo_univ (idx, fr_u_major, fr_ref)
    values (3,'영어영문', 4);
    
select * from phoneinfo_univ;
    


update phoneinfo_univ
set fr_u_major = '경영'
where idx = 1;

update phoneinfo_univ
set fr_u_year = 4
where idx = 2;

update phoneinfo_univ
set fr_u_year = 4
where idx = 3;

select * from phoneinfo_univ;
    


delete from phoneinfo_univ
where idx = 2;

--3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneinfo_com;

insert into phoneinfo_com (idx, fr_c_company, fr_ref)
    values (2, '네이버', 4);

insert into phoneinfo_com (idx, fr_c_company, fr_ref)
    values (3, '라인', 4);
    
insert into phoneinfo_com (idx, fr_c_company, fr_ref)
    values (4, '당근마켓', 4);
    
select * from phoneinfo_com;

update phoneinfo_com
set fr_c_company = '라인'
where idx = 2;

select * from phoneinfo_com;

delete from phoneinfo_com
where idx = 1;

