🧨 Goal
Delete a student record from the database using their id.

✅ Table Assumed
sql
Copy code
CREATE TABLE Student (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    city VARCHAR(100)
);
🧱 Step-by-Step Implementation
1️⃣ Add deleteStudent() Method in StudentDao
In your StudentDao.java, add the following method:
2️⃣ Call Delete from App.java
You can now call this method from your App.java like this:

🧠 Summary
Task	Code
SQL	DELETE FROM Student WHERE id = ?
Method	deleteStudent(int id) in StudentDao
Call	From App.java with DAO bean
