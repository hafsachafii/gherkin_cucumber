$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("createrequest.feature");
formatter.feature({
  "line": 1,
  "name": "Create request",
  "description": "feature for testing TF Framework",
  "id": "create-request",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Create request",
  "description": "",
  "id": "create-request;create-request",
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
  "line": 7,
  "name": "user select url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user navigates to Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "enters username and Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user fill the form",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify the addition of the document",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateDoc.userSelectUrl()"
});
formatter.result({
  "duration": 52805982900,
  "status": "passed"
});
formatter.match({
  "location": "CreateDoc.userNavigatesToLoginPage()"
});
formatter.result({
  "duration": 59200,
  "status": "passed"
});
formatter.match({
  "location": "CreateDoc.entersUsernameAndPassword()"
});
formatter.result({
  "duration": 52100,
  "status": "passed"
});
formatter.match({
  "location": "CreateDoc.userFillTheForm()"
});
formatter.result({
  "duration": 60900,
  "status": "passed"
});
formatter.match({
  "location": "CreateDoc.verifyTheAdditionOfTheDocument()"
});
formatter.result({
  "duration": 55700,
  "status": "passed"
});
});