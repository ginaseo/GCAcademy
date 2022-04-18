package p08_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//dto:데이타를 담아서 옮기는 목적
class Employees{
	private int employee_id;
	private String first_name;
	private double salary;
	//생성자
	public Employees() {}
	public Employees(int employee_id, String first_name, double salary) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.salary = salary;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [employee_id=" + employee_id + ", first_name=" + first_name + ", salary=" + salary + "]";
	}
	
}

public class J201223_02_Select {

	public static void main(String[] args) {
		// db 컨넥션
		Connection conn = DBConn.getConnection();
		System.out.println(conn);
		
		//ArrayList생성
		List<Employees> empList = new ArrayList<>();
		
		//select문
		String sql = "select employee_id, first_name, salary from employees";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int employee_id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				double salary = rs.getDouble("salary");
				Employees emp = new Employees();
				emp.setEmployee_id(employee_id);
				emp.setFirst_name(first_name);
				emp.setSalary(salary);
				empList.add(emp);
				
				
//				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//출력
		//foreach문
		for(Employees emp:empList) {
			System.out.println("아이디:" + emp.getEmployee_id());
			System.out.println("이름:" + emp.getFirst_name());
			System.out.println("연봉:" + emp.getSalary());
			System.out.println("---------------------------");
		
		
		
		
		}
	}

}
