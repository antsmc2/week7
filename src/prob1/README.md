# Explanation for all problem one issues

## Part B

### Problem statement

Execution returns false for the following reasons:

Employee implements `boolean equals(Employee e)`. This is different from `boolean equals(Object ob)` present in objects class. 
EmployeeInfo.removeDuplicates(List<Employee> employees) works as expected because internal to it, it makes use of `inList(Employee e, List<Employee> emps)`. This method makes use of the `boolean equals(Employee e)`. 

The problem happens inside `listsAreEqual(List<Employee> l1, List<Employee> l2)`. This is because `List.contains` method is invoked. This method invokes `Object.equals(object obj)` and ignores equals defined in Employee class.


### Solution

Replace Employee.equals(Employee e) with the following piece of code:

	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee emp = (Employee)ob;
		return emp.name.equals(name) && emp.salary == salary && emp.visited == visited;
	}



## Part C

### Problem statement

The program returns false because Employee class does not implement hashCode. Every time a new Employee is created, a different hashCode is generated even though they have the same attributes. In `List<Employee> removeDuplicates(List<Employee> employees)`, employee is used as hash key. Because `new Employee(String name, int salary)` creates a new hashCode every time, it is unable to properly create proper hash keys in the map. The result of this is removeDuplicates does not work properly.


### Solution

Implement hasCode method in Employee class. See below code:

	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
	

	
## Part D

### Problem Statement

In Employee class, hashCode is implemented using name, salary and visited attribute. In EmployeeInfo.removeDuplicates, visited attribute is updated after the entry is put inside the hashMap. Changing this value resulted in different hashKey value. The result of this is that the entry is no longer recognized during HashMap.get(employee). The result of this problem is that removeDuplicates does not work properly.


### Solution

Make the Employee class immutable (Remove all setter classes in Employee class) to prevent employee instance from being changed inside removeDuplicates method.	
