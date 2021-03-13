$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/featurefiles/Login.feature");
formatter.feature({
  "name": "Login to stack overflow website",
  "description": "\texisting user should be able to login to website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to account with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user navigates to stack overflow website",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_navigates_to_stack_overflow_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a valid user name",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_enters_a_valid_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter a valid password",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_enter_a_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the submit login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_clicks_on_the_submitLogin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be taken to success page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_should_be_taken_to_success_page()"
});
formatter.result({
  "status": "passed"
});
});