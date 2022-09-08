Feature: This feature is to validate Contact  page Creation

Scenario: Verify contact link is dispalyed in Homepage
Given Launch "<URL>" for demoblaze   
Then Click contact link
Then Insert Contact email in contact email field and contact name on contact name field    
Then Type messasge in send message box 