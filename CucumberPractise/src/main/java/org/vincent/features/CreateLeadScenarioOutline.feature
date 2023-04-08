
Feature: Create Lead

Background: Launch URL
Given Open the browser and launch the leaftap application url "http://leaftaps.com/opentaps/control/login"

  Scenario Outline: To create a lead
    
    Given enter the username "Demosalesmanager"
    And enter the password "crmsfa"
    And click submit to login
    And click the CRM-SFA link
    And chose the create lead option
    And enter company name <cname>
    And enter first name <fname>
    And enter last name <lname>
    When enter create lead submit button
    #Then I validate the outcomes
    #And check more outcomes
    Examples:
    |cname|fname|lname|
    |'TL'|'Vin'|'VJ'|
    |'Tem'|'Vij'|'Deb'|
