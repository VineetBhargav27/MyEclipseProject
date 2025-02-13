Feature: Login
Scenario:  Successful login  with Valid Crendentials



Given User launch Chrome browser
When User opens url "https://admin-demo.nopcommerce.com/"
And User enters email id as "admin@yourstore.com"and Password as "admin"
And click on Login
Then Page title should be "Dashboard/nopCommerce administration"
When user click on logout link
Then title should be "Your store. Login"
And Close browser