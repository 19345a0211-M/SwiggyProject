

Feature: Order food in swiggy
 
  Scenario: Order food in swiggy
    Given a user in the swiggy homepage
    When Type your delivery location as ‘Hyderabad’ and select the first option from the auto-complete box.
    When Click on the first restaurant shown under ‘Top restaurant chains in Hyderabad’.
    When Click on ‘Add’ button corresponding to first listed dish.
    When Hover over ‘Cart’ in the top right corner.
    When Click on ‘Check Out’ in the sub-menu.
    Then Verify the text "To place your order now, log in to your existing account or sign up." Is visible on the next page sucessfully.

 