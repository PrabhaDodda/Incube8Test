$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 1,
  "name": "Question1",
  "description": "I want to use this template for Question1",
  "id": "question1",
  "keyword": "Feature"
});
formatter.before({
  "duration": 184700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user is able to select Top Rated Shows from Menu",
  "description": "",
  "id": "question1;verify-user-is-able-to-select-top-rated-shows-from-menu",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Question1.2"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open http://www.imdb.com in Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click Menu button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select Top Rated Shows",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the Top Rated Shows content is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.imdb.com",
      "offset": 7
    },
    {
      "val": "Chrome",
      "offset": 30
    }
  ],
  "location": "TestSteps.iOpenUrlInBrowser(String,String)"
});
formatter.result({
  "duration": 10090222400,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iClickMenuButton()"
});
formatter.result({
  "duration": 332828100,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iSelectTopRatedShows()"
});
formatter.result({
  "duration": 1943503500,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.theTopRatedShowsContentIsDisplayed()"
});
formatter.result({
  "duration": 270449400,
  "status": "passed"
});
formatter.after({
  "duration": 795085100,
  "status": "passed"
});
formatter.before({
  "duration": 78100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify user is able to search",
  "description": "",
  "id": "question1;verify-user-is-able-to-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Question1.3"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I open http://www.imdb.com in Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I do a Search using Game of thrones",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "select term from suggestion list",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Title, Rating and User reviews count are displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.imdb.com",
      "offset": 7
    },
    {
      "val": "Chrome",
      "offset": 30
    }
  ],
  "location": "TestSteps.iOpenUrlInBrowser(String,String)"
});
formatter.result({
  "duration": 9369525800,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iDoASearch()"
});
formatter.result({
  "duration": 403093100,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.selectTermFromSuggestionList()"
});
formatter.result({
  "duration": 2574803400,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.titleRatingAndUserReviewsCount()"
});
formatter.result({
  "duration": 1406111800,
  "status": "passed"
});
formatter.after({
  "duration": 1124251600,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Question2",
  "description": "I want to use this template for Question2",
  "id": "question2",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Verify user is able to register into IMdb",
  "description": "",
  "id": "question2;verify-user-is-able-to-register-into-imdb",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Question2.1"
    },
    {
      "line": 5,
      "name": "@Question2.2"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open http://www.imdb.com in Firefox",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click SignIn",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click Create an Account",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I provide \u003cname\u003e \u003cemail\u003e \u003cpassword\u003e and user registration successful",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I Logout and Login with \u003cemail\u003e \u003cpassword\u003e successfully having profile \u003cname\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "question2;verify-user-is-able-to-register-into-imdb;",
  "rows": [
    {
      "cells": [
        "name",
        "email",
        "password"
      ],
      "line": 14,
      "id": "question2;verify-user-is-able-to-register-into-imdb;;1"
    },
    {
      "cells": [
        "prabha",
        "prabhadks4@gmail.com",
        "Test@1234"
      ],
      "line": 15,
      "id": "question2;verify-user-is-able-to-register-into-imdb;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 218900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify user is able to register into IMdb",
  "description": "",
  "id": "question2;verify-user-is-able-to-register-into-imdb;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Question2.1"
    },
    {
      "line": 5,
      "name": "@Question2.2"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open http://www.imdb.com in Firefox",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click SignIn",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click Create an Account",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I provide prabha prabhadks4@gmail.com Test@1234 and user registration successful",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I Logout and Login with prabhadks4@gmail.com Test@1234 successfully having profile prabha",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.imdb.com",
      "offset": 7
    },
    {
      "val": "Firefox",
      "offset": 30
    }
  ],
  "location": "TestSteps.iOpenUrlInBrowser(String,String)"
});
formatter.result({
  "duration": 8807319500,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iClickSignIn()"
});
formatter.result({
  "duration": 2006457900,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iClickCreateAnAccount()"
});
formatter.result({
  "duration": 704291700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prabha",
      "offset": 10
    },
    {
      "val": "prabhadks4@gmail.com",
      "offset": 17
    },
    {
      "val": "Test@1234",
      "offset": 38
    }
  ],
  "location": "TestSteps.iProvideUserDetailsAndContinue(String,String,String)"
});
formatter.result({
  "duration": 4289474600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prabhadks4@gmail.com",
      "offset": 24
    },
    {
      "val": "Test@1234",
      "offset": 45
    },
    {
      "val": "prabha",
      "offset": 83
    }
  ],
  "location": "TestSteps.iLogoutAndLogin(String,String,String)"
});
formatter.result({
  "duration": 11709539600,
  "status": "passed"
});
formatter.after({
  "duration": 2364518100,
  "status": "passed"
});
});