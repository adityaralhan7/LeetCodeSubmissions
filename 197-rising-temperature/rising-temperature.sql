# Write your MySQL query statement below
Select w2.id AS Id FROM Weather w1,Weather w2
WHERE datediff(w2.recordDate,w1.recordDate)=1 AND
w2.temperature>w1.temperature;