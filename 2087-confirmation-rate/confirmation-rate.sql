# Write your MySQL query statement below
Select s.user_id,IFNULL(ROUND(SUM(action='confirmed')/COUNT(*),2),0.00) as confirmation_rate
FROM Signups s LEFT JOIN Confirmations c 
ON s.user_id=c.user_id
GROUP BY
s.user_id;