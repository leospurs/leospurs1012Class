

-- 2021.10.29

desc dual;
select * from dual;



-- 함수 : 단일행 함수, 집합 함수


-- 단일행 함수 : 숫자, 문자, 날짜, 변환


-- 숫자 함수

select abs(-15.5) from dual;

select floor(35.43)  "Floor" from dual;

select round(15.693) from dual;

select round(15.693,2) from dual;

select round(15.693,-1) from dual;

select trunc(15.6789) from dual;

select trunc(15.6789,-1) from dual;

select mod(10,2) from dual;


-- 문자 함수

select LOWER('MR. SCOTT MCMILLAN') "Lowercase" from dual;

select ename, lower(ename) from emp;

select concat('저는', '손흥민입니다.') from dual;

select ename || 'is a' from emp;

select concat('나의 이름은', ename) from emp;

select lpad('page 1',15, '*') from dual;

select rpad('page 1',15, '*') from dual;

select lpad('page 1',15, '*') from dual;

select rpad('001111-1',14, '*') from dual;

select SUBSTR('ABCDEFG',3,4)FROM dual;

select substr('001212-3000123',1,8) from dual;

select substr(hiredate,1,2) from emp;

select rpad(substr('001212-3000123',1,8),14,'*') from dual;

select rpad(substr(name,1,2),5,'*') from customer;

select Ltrim('     =from=    ') from dual;

select Rtrim('     =from=    ') from dual;

select trim('+' from '+++++from+++++') as a from dual;

select trim(' ' from '     +++++from+++++     ') as a from dual;

select replace('jack and jue','j','bl') from dual;

select replace('000-000-0000','-',' ') from dual;


-- 날짜 함수

select sysdate from dual;

select sysdate-30 from dual;

select add_months(sysdate, -4) from dual;

select last_day(sysdate+40) from dual;

-- 변환 함수 
-- 날짜 -> 문자 to_char(원본, 패턴)
select to_char(sysdate,'YYYY.MM.DD. day dy AM PM HH HH24 MI SS') from dual;
-- 2021.10.29 13:00
select to_char(sysdate,'YYYY.MM.DD HH24:MI') from dual;

-- 숫자 -> 문자 to_char(원본, 패턴)

select to_char(100000, '0000000') from dual;

select to_char(100000, '9999999') from dual;

select to_char(100000.123, 'L9,999,999.9') from dual;

select sal, to_char(sal*1200, 'L9,999,999') from emp;


-- 문자 -> 날짜 to_date(원본, 패턴)
select to_date('2021.10.29', 'yyyy.mm.dd.')from dual;

-- 2021.01.01 오늘
select trunc(sysdate - to_date('1992-10-08','YYYY-MM-DD'))from dual;

-- 문자 -> 숫자 to_number(원본, 패턴)
select to_number('100,000', '9,999,999') + 100000 from dual;

-- switch case 와 유사한 decode 함수
select * from dept;

select ename, deptno, 
decode(deptno,
    10, 'Account',
    20, 'research',
    30, 'sales',
    40, 'operations'
        ) as dname
from emp;

-- 직급에 따라 급여인상
--직급이 'ANAlYST'인 사원은 5%, 
--'SALESMAN'인 사원은 10%, 
--'MANAGER'인 사원은 15%, 
--'CLERK'인 사원은 20%인 인상한다
select * from emp;

select ename, job, sal, 
        decode(job, 
            'ANALYST',sal*1.05,
            'SALESMAN',sal*1.1,
            'MANAGER',sal*1.15,
            'CLERK',sal*1.2
        ) as upSal
from emp;
            
-- case when the : if else if와 유사 -> 조건식을 = 이외의 비교 연산을 할 수 있다.
select ename, sal,
    case 
        when sal >= 3000 then sal*1.3
        when sal < 3000 then sal+1.5
    end as upSal
from emp;


---------------------------------------------------------
-- 집합 함수 ( 그룹 함수)
-- 하나의 행의 칼럼이 대상이 아니고, 행 그룹의 컬럼들(집합)이 대상이다.
---------------------------------------------------------

select 
    to_char(sum(sal)*1200, 'L999,999,999') as "월 급여 총액",
    to_char(round(avg(sal)*1200),'L999,999,999') as "월 급여 평균",
    count(*) as "총 사원의 수",
    count(comm) as "커미션 등록 수",
    sum(comm) as "커미션의 합",
    avg(comm) as "커미션의 평균",
    max(sal) as "가장 높은 급여",
    min(sal) as "가장 낮은 급여"
from emp;

-- 사원들의 업무의 개수

select count(distinct job) from emp;

-- 각 부서 급여의 총합

select  sum(sal) 
from emp
where deptno = 10;

select  sum(sal) 
from emp
where deptno = 20;

select  sum(sal) 
from emp
where deptno = 30;


select * from emporder order by deptno;




-- group by : 특정 칼럼으로 구룹핑 -> 그룹 내의 평균이나 합과 같은 집합 함수를 사용할 수 있다.


-- 부서번호를 기준으로 그룹핑 
---> 급여의 총합, 평균, 최대, 최소, 사원의 수, 
--커미션을 받는 사람, 커미션 평균, 커미션 총

select deptno,
        count(*) as "사원 수",
        sum(sal) as "급여 총합",
        trunc(avg(sal)) as "급여 평균",
        max(sal) as "최대 급여",
        min(sal) as "최소 급여",
        count(comm) as "커미션 대상자 수",
        nvl(sum(comm),0) as "커미션 총합",
        nvl(avg(comm),0) as "커미션 평균"
from emp
where deptno != 10
group by deptno
having max(sal) >= 2500
--having avg(sal) >= 2000
order by deptno;








