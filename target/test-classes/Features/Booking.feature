Feature: My Booking Page Functionality

  Scenario: Verify page title of My Booking Page
    Given User is on the My Booking page
    When User retrieves the page title
    Then The page title should be "TRJ Partner"

  Scenario: Navigate through My Booking tabs
    Given User is on the My Booking page
    When User clicks the "Upcoming" tab
    Then The "Upcoming" bookings should be displayed
    When User clicks the "Completed" tab
    Then The "Completed" bookings should be displayed
    When User clicks the "Cancelled" tab
    Then The "Cancelled" bookings should be displayed

  Scenario: Verify the table rows in My Booking Page
    Given User is on the My Booking page
    When User checks the booking table
    Then The table should display at least 1 row

  Scenario: View booking details
    Given User is on the My Booking page
    When User clicks the "View" icon for a booking
    Then The booking details should be displayed

  Scenario: Verify pagination functionality
    Given User is on the My Booking page
    When User clicks the "Next" pagination button
    Then The next page of bookings should be displayed
    When User clicks the "Previous" pagination button
    Then The previous page of bookings should be displayed

  Scenario: Verify navigation links
    Given User is on the My Booking page
    When User clicks the "Home" icon
    Then The user should be redirected to the home page
    When User clicks the "Logo"
    Then The user should be redirected to the home page
