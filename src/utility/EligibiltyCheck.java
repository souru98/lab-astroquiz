//progression 4
package utility;

import model.User;


public  class EligibiltyCheck  extends  BasicEligibility implements EligibilityInterface
{

	@Override
	public boolean checkUser(User user) 
	{
		 
	     int age =user.getAge();
		 int height =user.getHeight() ;
		 int weight=user.getWeight();
	     String country=user.getCountry();
	     System.out.println(age);
		if((18 <= age && age<= 35)&&(155 <=height&&height<=170)&&(55<= weight&&weight<= 90)&&(country.equals("ProGrad")) )// You cannot check String using == Apprao
			return true;
		return false;
	}
	
	
	@Override
	public boolean checkQuizAnswer(String points)
	{
		int score=Integer.parseInt(points);
		if(score>5)
			return true;
		return false;
	}

	
	public	boolean basicEligibilityCheck(User user)
	{
		if(checkUser(user))
			return true;
		
		return false;
	}

}








