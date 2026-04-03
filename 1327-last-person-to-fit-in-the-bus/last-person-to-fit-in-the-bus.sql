# Write your MySQL query statement below
WITH s AS (
    SELECT 
        person_name,
        turn,
        SUM(weight) OVER (ORDER BY turn) AS running_total_weight
    FROM Queue
)
SELECT person_name
FROM s
WHERE running_total_weight <= 1000
ORDER BY running_total_weight DESC
LIMIT 1;