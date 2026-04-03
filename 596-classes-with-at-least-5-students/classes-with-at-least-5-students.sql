# Write your MySQL query statement below
select c.class
from courses c
group by class 
having count(*)>=5;