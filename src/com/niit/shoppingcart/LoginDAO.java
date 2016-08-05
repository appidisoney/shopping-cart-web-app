package com.niit.shoppingcart;

public class LoginDAO {
		public Boolean isValidUser(String userid,String pwd){
			if(userid.equals("niit")&&pwd.equals("niit"))
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}

	}


