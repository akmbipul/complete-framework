Feature: Home Page Test
  as a Letsfodit user i should be able to 
  launch home page and login successfully
  and see all homepage feature

 Background: Landing HomePage
  
  Given I open "chrome"and go to "https://letskodeit.teachable.com/"
   
  
  Scenario: Login Feature
    When I start login with "nightgroup@gmail.com" and "night123"
    Then I should see "My Courses"

 