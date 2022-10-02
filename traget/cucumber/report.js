$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/FeatureFileScenario1.feature");
formatter.feature({
  "line": 1,
  "name": "setting the background color",
  "description": "",
  "id": "setting-the-background-color",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2131615700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "1 user should be able to change background color to sky blue",
  "description": "",
  "id": "setting-the-background-color;1-user-should-be-able-to-change-background-color-to-sky-blue",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "validate SkyBlue Background button is displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the skyBlue background button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionfinal.validate_SkyBlue_Background_button_is_displayed()"
});
formatter.result({
  "duration": 135053700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionfinal.i_click_on_the_skyBlue_background_button()"
});
formatter.result({
  "duration": 48376900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionfinal.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 28131300,
  "status": "passed"
});
formatter.after({
  "duration": 13300,
  "status": "passed"
});
});