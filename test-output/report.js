$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/cucumber/Framwork/src/main/java/feature/taging.feature");
formatter.feature({
  "line": 2,
  "name": "OrangeHrm application Testing",
  "description": "",
  "id": "orangehrm-application-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@functionalTesting"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Login with incorrect username and incorrect password",
  "description": "",
  "id": "orangehrm-application-testing;login-with-incorrect-username-and-incorrect-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@RegressionTest"
    },
    {
      "line": 6,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "this is invalid login test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.this_is_invalid_login_test()"
});
formatter.result({
  "duration": 243922053,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "create a leave",
  "description": "",
  "id": "orangehrm-application-testing;create-a-leave",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "this is a leave test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.this_is_a_leave_test_case()"
});
formatter.result({
  "duration": 68222,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Ceate a time",
  "description": "",
  "id": "orangehrm-application-testing;ceate-a-time",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "this is a time test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.this_is_a_time_test_case()"
});
formatter.result({
  "duration": 54337,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Click on logout application",
  "description": "",
  "id": "orangehrm-application-testing;click-on-logout-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@RegressionTest"
    },
    {
      "line": 20,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "this is a logout test case",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingStepDefination.this_is_a_logout_test_case()"
});
formatter.result({
  "duration": 57354,
  "status": "passed"
});
});