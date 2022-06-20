# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE person1
    FROM Person person, Person person1
        WHERE person.Email = person1.Email
        AND person.Id < person1.Id;
        
        
