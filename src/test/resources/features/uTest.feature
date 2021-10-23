# Author: Anderson_Jurado_Castro
  @stories
  Feature: UTest
    As a user, I want to create a new user in the platform UTest
  @scenario1
  Scenario: Create a new user
    Given than bill wants to create a new user
    When he fill out the form on the platform UTest
      |strFirstName|strLastName|strEmail|strMounth|strLenguage|strCity|strCountry|strPassword|strComputerOS|strComputerVersion|strComputerLenguaje|strBrandMobil|strModelMobil|strMobilOS|intDay|intYear|intZip|
      |Bill|User|example2@gmail.com|January|Spanish|Pasto|Colombia|Fq/yarj!Q59a86$|Debian|9.4 (Stretch)|English|Samsung|Galaxy S9|Android 10|31|1991|520002|
    Then he create a new user
    |strQuestion|
    |Complete Setup|