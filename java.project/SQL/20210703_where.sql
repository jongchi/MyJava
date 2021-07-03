--2021.07.03

select *
from product
where price between 50000 and 80000;

select *
from product
where price in (40000, 50000, 60000);

select *
from product
where name like '정보%';

select *
from product
where price is null;