Feature: Login and Logout Test
	
		Scenario: Login Test
			Given launch the browser and navigate to url
			When Tester enters username and password
			And clicks on login
			Then welcome admin message displayed
			
		Scenario: Loogut Test
			When Tester Cicks on welcome admin link
			And also clicks on logout link
			Then Login page displayed
				
			
			