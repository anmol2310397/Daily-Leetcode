# Write your MySQL query statement below
select Emp.unique_id,e.name from Employees e
left join EmployeeUNI Emp
on Emp.id=e.id;

