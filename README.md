Create a student management system that uses arrays and regular expressions to manage student records. The system should allow the user to add, view, and search for student records.

Instructions:

Create a Java project in Eclipse or any IDE of your choice.

Create a class called "Student" that has the following properties: name, ID, email, and GPA.

Create an array of Student objects to store the student records.

Create a method called "addStudent" that takes the name, ID, email, and GPA as parameters and adds a new Student object to the array.

Create a method called "viewStudents" that displays all the student records in the array.

Create a method called "searchStudents" searches for a student with a given name.

Use regular expressions to validate the email address format when adding a new student record.

Note: The project's source code is included in the resources of the last lecture in project section

Example Input/Output:

Enter a command (add, view, search, sort, exit): add
Add a new student record:
Name: John Smith
ID: 12345
Email: john.smith@gmail.com
GPA: 3.5
Student record added successfully.
 
Enter a command (add, view, search, sort, exit): add
Add a new student record:
Name: Jane Doe
ID: 67890
Email: jane.doe@hotmail.com
GPA: 4.0
Student record added successfully.
 
Enter a command (add, view, search, sort, exit): view
View all student records:
Name: Jane Doe, ID: 67890, Email: jane.doe@hotmail.com, GPA: 4.0
Name: John Smith, ID: 12345, Email: john.smith@gmail.com, GPA: 3.5
 
Enter a command (add, view, search, sort, exit): search
Enter a regular expression to search for: john
Name: John Smith, ID: 12345, Email: john.smith@gmail.com, GPA: 3.5
 
Sort student records:
Enter a regular expression to sort by (name, ID, email, or GPA): GPA
Name: Jane Doe, ID: 67890, Email: jane.doe@hotmail.com, GPA: 4.0
Name: John Smith, ID: 12345, Email: john.smith@gmail.com, GPA: 3.5