Feature: Learn more Automation
  @lmti01
  Scenario: Alert message validation in Confirmation box
    Given User click on conformation box button
    Then user validate the alert message
    And user validate the UIMessage

    @lmti02
    Scenario: Change in Text Validation
      Given user clicks on Change Text Button
      Then validate the change Text value