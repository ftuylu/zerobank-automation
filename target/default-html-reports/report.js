$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NavigationMenu.feature");
formatter.feature({
  "name": "Navigation Menu",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Navigating  following \u003cpage\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip2"
    }
  ]
});
formatter.step({
  "name": "the user enter the valid information",
  "keyword": "And "
});
formatter.step({
  "name": "the user navigates to following \"\u003cpage\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "the title should be following \"\u003ctitle\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "page",
        "title"
      ]
    },
    {
      "cells": [
        "Account Summary",
        "Zero - Account Summary"
      ]
    },
    {
      "cells": [
        "Account Activity",
        "Zero - Account Activity"
      ]
    },
    {
      "cells": [
        "Account Pay Bills",
        "Zero - Pay Bills"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigating  following Account Summary",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip2"
    }
  ]
});
formatter.step({
  "name": "the user enter the valid information",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_enter_the_valid_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to following \"Account Summary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.NavigationMenuStepDefs.the_user_navigates_to_following(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should be following \"Zero - Account Summary\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.NavigationMenuStepDefs.the_title_should_be_following(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigating  following Account Activity",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip2"
    }
  ]
});
formatter.step({
  "name": "the user enter the valid information",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_enter_the_valid_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to following \"Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.NavigationMenuStepDefs.the_user_navigates_to_following(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should be following \"Zero - Account Activity\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.NavigationMenuStepDefs.the_title_should_be_following(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigating  following Account Pay Bills",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip2"
    }
  ]
});
formatter.step({
  "name": "the user enter the valid information",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefs.the_user_enter_the_valid_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to following \"Account Pay Bills\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.NavigationMenuStepDefs.the_user_navigates_to_following(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should be following \"Zero - Pay Bills\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.NavigationMenuStepDefs.the_title_should_be_following(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});