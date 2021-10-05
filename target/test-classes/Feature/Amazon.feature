Feature: verify Amazon order booking

Scenario: verifying Amazon Search product 

Given user is on the same product 
When  user should search product
             |TV     |
             |Iphone |
             |Laptop |
             |Shirts |
Then user should verify all product listed succefully
             