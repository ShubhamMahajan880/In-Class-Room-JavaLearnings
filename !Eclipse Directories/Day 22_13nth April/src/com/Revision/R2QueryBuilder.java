package com.Revision;

public class R2QueryBuilder {

	public static void main(String[] args) {
		String employeeId = null;
		String sal = null;
		R2QueryBuilder qb = new R2QueryBuilder();
		qb.generateSQL(employeeId, sal);

	}

	public void generateSQL(String empID, String empSalary) {
		StringBuffer query = new StringBuffer("Select firsName and lastName from Employee where ");

		if (empID != null) {
			query.append("employeeeID is - " + empID);
		} else if (empSalary != null) {
			query.append("Employee Salary is - " + empSalary);
		} else {
			query.append("Select firsName and lastName from Employee 1223");
		}
		query.append(";");
		System.out.println("final query is - " + query);

	}

}
