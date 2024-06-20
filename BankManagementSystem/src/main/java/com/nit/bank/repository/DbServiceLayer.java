package com.nit.bank.repository;

import java.sql.Connection;

import com.nit.bank.BankRegistration;

import java.sql.*;
public class DbServiceLayer {
Connection conn=DbConnection.getRepository();

  public BankRegistration register(BankRegistration bank)throws Exception {
	  PreparedStatement ps;
	  PreparedStatement stmm;
	  System.out.println(bank.getBankName());
	if(bank.getBankName().equals("Sbi")) {
		  ps=conn.prepareStatement("insert into SbiBankRegistration values (?,?,?,?,?,?,?,?,?)");
		stmm=conn.prepareStatement("select * from SbiBankRegistration where email=?");
	}else if(bank.getBankName().equals("Hdfc")) {
		 ps=conn.prepareStatement("insert into HdfcBankRegistration values (?,?,?,?,?,?,?,?,?)");
		 stmm=conn.prepareStatement("select * from HdfcBankRegistration  where email=?");
	}else {
		ps=conn.prepareStatement("insert into AndhraBankRegistration values (?,?,?,?,?,?,?,?,?)");
		stmm=conn.prepareStatement("select * from AndhraBankRegistration where email=?");
	}
	 ps.setInt(1, bank.getBankId());
	 ps.setString(2, bank.getBankName());
	 ps.setString(3, bank.getName());
	 ps.setInt(4,bank.getAge());
	 ps.setString(5,bank.getEmail());
	 ps.setLong(6, bank.getMobile());
	 ps.setString(7,bank.getAddress());
	 ps.setString(8, bank.getState());
	 ps.setDouble(9, bank.getBalance());
	 ps.executeQuery();
	 BankRegistration bank1;
	
	
		
		 stmm.setString(1, bank.getEmail());
		 ResultSet rs=stmm.executeQuery();
	      bank1 	=new BankRegistration();
		 while(rs.next()) {
			 System.out.println(rs.getInt(1)+" "+rs.getString(3));
			 bank1.setBankId(rs.getInt(1));
			 bank1.setBankName(rs.getString(2));
			 bank1.setName(rs.getString(3));
			 bank1.setAge(rs.getInt(4));
			 bank1.setMobile(rs.getLong(6));
			 bank1.setAddress(rs.getString(7));
			 bank1.setState(rs.getString(8));
			 bank1.setEmail(rs.getString(5));
			 bank1.setBalance(rs.getDouble(9));
		 }
		 
	 
	 return bank1;
 }
  
  public  BankRegistration login(BankRegistration bank)throws Exception {
	  PreparedStatement stmm;
	  if(bank.getBankName().equals("Sbi")) {
		
		stmm=conn.prepareStatement("select * from SbiBankRegistration where mobile=? and name=?");
	}else if(bank.getBankName().equals("Hdfc")) {
	
		 stmm=conn.prepareStatement("select * from HdfcBankRegistration  where mobile=? and name=?");
	}else {
		
		stmm=conn.prepareStatement("select * from AndhraBankRegistration where mobile=? and name=?");
	}
	  BankRegistration bank1;
		 stmm.setLong(1, bank.getMobile());
		 stmm.setString(2, bank.getName());
		 ResultSet rs=stmm.executeQuery();
	      bank1 	=new BankRegistration();
		 while(rs.next()) {
			 System.out.println(rs.getInt(1)+" "+rs.getString(3));
			 bank1.setBankId(rs.getInt(1));
			 bank1.setBankName(rs.getString(2));
			 bank1.setName(rs.getString(3));
			 bank1.setAge(rs.getInt(4));
			 bank1.setMobile(rs.getLong(6));
			 bank1.setAddress(rs.getString(7));
			 bank1.setState(rs.getString(8));
			 bank1.setEmail(rs.getString(5));
			 bank1.setBalance(rs.getDouble(9));
		 }
		 return bank1;
  }
  
  public BankRegistration money(BankRegistration bank)throws Exception {
	  PreparedStatement stmm;
	  if(bank.getBankName().equals("Sbi")) {
			
			stmm=conn.prepareStatement("select * from SbiBankRegistration where mobile=? and name=?");
		}else if(bank.getBankName().equals("Hdfc")) {
		
			 stmm=conn.prepareStatement("select * from HdfcBankRegistration  where mobile=? and name=?");
		}else {
			
			stmm=conn.prepareStatement("select * from AndhraBankRegistration where mobile=? and name=?");
		}
	  BankRegistration bank1;
		 stmm.setLong(1, bank.getMobile());
		 stmm.setString(2, bank.getName());
		 ResultSet rs=stmm.executeQuery();
	      bank1 	=new BankRegistration();
		 while(rs.next()) {
			 System.out.println(bank);
			 bank1.setBankId(rs.getInt(1));
			 bank1.setBankName(rs.getString(2));
			 bank1.setName(rs.getString(3));
			 bank1.setAge(rs.getInt(4));
			 bank1.setMobile(rs.getLong(6));
			 bank1.setAddress(rs.getString(7));
			 bank1.setState(rs.getString(8));
			 bank1.setEmail(rs.getString(5));
			 bank1.setBalance(rs.getDouble(9));
		 }
		 return bank1;
  }
  
}
