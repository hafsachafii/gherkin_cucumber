Feature: Create request
  feature for testing TF Framework

  @TFSample
  Scenario: Create request

    Given user select url
    Given user navigates to Login Page
    And enters username and Password
    When user fill the form
    Then verify the addition of the document