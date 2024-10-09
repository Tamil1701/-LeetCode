# Write your MySQL query statement below
SELECT s.student_id, s.student_name, su.subject_name, count(e.subject_name) as attended_exams
FROM Students s 
CROSS JOIN Subjects su
left join Examinations e on su.subject_name =e.subject_name and s.student_id=e.student_id 
group by s.student_id,su.subject_name,s.student_name
order by s.student_id ,su.subject_name;