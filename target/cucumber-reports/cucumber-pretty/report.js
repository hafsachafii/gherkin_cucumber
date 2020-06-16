$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("inscri.feature");
formatter.feature({
  "line": 1,
  "name": "connection",
  "description": "feature for testing TF Framework",
  "id": "connection",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "add two numbers",
  "description": "",
  "id": "connection;add-two-numbers",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TFSample"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "select username and password",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "conncted",
  "keyword": "Then "
});
formatter.match({
  "location": "inscri.userOnHomepage()"
});
formatter.result({
  "duration": 7864962500,
  "status": "passed"
});
formatter.match({
  "location": "inscri.selectUsernameAndPassword()"
});
formatter.result({
  "duration": 3763503400,
  "status": "passed"
});
formatter.match({
  "location": "inscri.conncted()"
});
formatter.result({
  "duration": 625026400,
  "status": "passed"
});
});