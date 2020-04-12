Feature: Question1
  I want to use this template for Question1

  @Question1.2
  Scenario: Verify user is able to select Top Rated Shows from Menu
    Given I open http://www.imdb.com in Chrome
    When I click Menu button
    And I select Top Rated Shows
   	Then the Top Rated Shows content is displayed

@Question1.3
	Scenario: Verify user is able to search
   Given I open http://www.imdb.com in Chrome
    When I do a Search using Game of thrones
    And select term from suggestion list
    Then Title, Rating and User reviews count are displayed
    
