-- 2021.06.15
-- JOIN & SUB QUERY

-- (5)  박지성이구매한
--      도서의출판사수

-- sub query 
select count(distinct publisher)
from book
where bookid in (select distinct o.bookid
                from orders o , customer c
                where o.custid = c.custid and c.name = '박지성')
;

-- join 
select count(distinct publisher)
from customer c, orders o, book b
where c.custid=o.custid and o.bookid = b.bookid
and c.name = '박지성';

-- (6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이

-- sub query
select b.bookname, b.price, b.price - o.saleprice as pricegap
from book b, orders o
where  b.bookid = o.bookid and
        o.custid in (select custid from customer where name = '박지성')
;
-- join 
select b.bookname, b.price, b.price-o.saleprice as pricegap
from orders o, customer c, book b
where c.custid = o.custid and o.bookid=b.bookid
and c.name = '박지성'
;

-- (7) 박지성이구매하지않은 -> sub query
-- 도서의이름 -> main query

select bookname
from book
where bookid not in (select o.bookid
                from orders o , customer c
                where o.custid = c.custid and c.name = '박지성')
;


-- (8) 주문하지않은고객의이름(부속질의사용)
-- sub query
select name
from customer 
where custid not in (select distinct custid from orders)
;

--outer join
select c.name
from orders o, customer c
where o.custid(+) = c.custid
and o.orderid is null
;


-- (9) 주문금액의총액과주문의평균금액
select sum(saleprice) as total, avg(saleprice) as avgsaleprice
from orders
;

-- (10) 고객의이름과고객별구매액
-- join
select c.name, sum(saleprice) 
from orders o, customer c
where o.custid = c.custid
group by c.name
;

--sub query
select (select c.name from customer c where o.custid = c.custid) as name, 
        sum(saleprice)
from orders o
group by o.custid
;

-- (11) 고객의 이름과 고객이 구매한 도서목록
--sub query
select c.name, (select bookname from book b
                where o.bookid = b.bookid) as bookname
from  orders o, customer c
where o.custid = c.custid
order by c.name
;

--join
select name, bookname 
from orders natural join customer natural join book
;

-- (12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문

--도서가격 - 판매가격 최대값
select max(b.price - o.saleprice)
from orders o, book b
where o.bookid = b.bookid
;

select *
from orders o, book b
where o.bookid = b.bookid and
    (b.price - o.saleprice) = (select max(b.price - o.saleprice)
                                from orders o, book b
                                    where o.bookid = b.bookid);

-- (13) 도서의 판매액 평균보다 
-- 자신의 구매액 평균이 더 높은 고객의 이름

select c.name
from customer c, orders o
where c.custid = o.custid
group by c.name
having avg(saleprice) > (select avg(saleprice)
                        from orders)
;

-- (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select name
from customer natural join orders natural join book
where name != '박지성' -- 박지성이 아닌,
    and publisher in (select publisher from customer natural join orders natural join book
                        where name = '박지성') -- 박지성과 같은 출판사
;

-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select name
from customer natural join orders natural join book
group by name
having count(distinct publisher)>=2;