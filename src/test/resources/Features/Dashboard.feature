Feature: Dashboard Functionality on TRJ Partner Website

  Background: 
    Given the user is on the TRJ Partner dashboard

  @DashboardNavigation
  Scenario: Verify navigation to My Bookings page
    When the user clicks on the Booking icon
    Then the My Bookings page should be displayed

  @ProfileNavigation
  Scenario: Verify navigation to My Account page
    When the user clicks on the profile icon
    And selects My Account
    Then the My Account page should be displayed

  @SearchDestination
  Scenario: Search for a destination
    When the user opens the destination field
    And selects city "Goa"
    Then the destination "Goa" should be displayed in recent searches

  @SelectDepartureDate
  Scenario: Select departure date
    When the user clicks on the date field
    And selects the date "31"
    Then the selected date should be displayed

  @RoomTravelSelection
  Scenario: Select rooms and travelers
    When the user clicks on the rooms and travelers field
    And adds one adult, one child with
