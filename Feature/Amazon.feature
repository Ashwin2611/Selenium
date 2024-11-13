#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Amazon

  Scenario Outline: Valid Amazon User
    Given Login in the Browser and Go to login Page
    And Give User Credentials and login <username> <password>
    When Search Monitor in search box
    And Choose your Item
    And Add the Item to the cart
    Then Add the Same Item in WishList
    And close WishList and Search Mobile in Search box
    Then Choose Samsng in the Filter Option
    And Go to Cart and reduce Item Quantity
    Then Click your profile and logout
    
        Examples:
      | username                   | password     |
      | ashwinmurugan1@gmail.com   | Ashwin@2611 |

  Scenario Outline: Invalid Amazon User
    Given Login in the Browser and Go to login Page
    When Give User Credentials and login
    Then Verify Login

    Examples: 
      | username  | password |
      | invalid@gmail.com | Ashwin@2611 | 
