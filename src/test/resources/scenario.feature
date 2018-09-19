Feature: William Hill test
  Background:
    Given I am on William Hill sports website

  Scenario: Check presence of cdb cookie on sports homepage
    When I check cookie notice pop up presence
    And I close the cookie notice
    Then I check presence of cdb cookie


   Scenario Outline: Join button translation to <language>
     When I check presence of Join button
     And I switch language to other <language>
     And I check presence of Join button
     And I check that Join button label <label> is translated into other language

     Examples:
     |language|label|
     | Deutsch |Anmelden|
     | 日本語 |登録|
     | Ελληνικά |Εγγραφή|