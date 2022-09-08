package com.demo.model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity
@Table
public class Farmer {
	 
		//mark id as primary key  
		@Id  
		//defining id as column name  
		@Column  
		public int id;  
		//defining name as column name  
		@Column  
		public String name;  
		//defining age as column name  
		@Column  
		public int age;  
		//defining email as column name  
		@Column  
		public String gender;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}  
	

}
