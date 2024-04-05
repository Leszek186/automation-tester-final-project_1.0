Final project for the Automation Tester course.
This repository contains a test automation project for the mystore.com online store. The project is designed to automate the testing of various functionalities of the mystore.com website using Selenium WebDriver and Cucumber framework.

Table of Contents
General Info
Project aims to automate testing processes for the mystore.com online store. By utilizing Selenium WebDriver and Cucumber framework, I intend to streamline the testing of various functionalities such as user registration, address management, and product purchasing. The purpose of this project is to enhance the efficiency and accuracy of testing procedures, ultimately ensuring a seamless user experience on the mystore.com platform.

Technologies Used
Selenium WebDriver
Cucumber
Java

Screenshots
![image](https://github.com/Leszek186/automation-tester-final-project_1.0/assets/141226298/2a2632a6-7bd0-4999-98cb-0e7f368e1abf)


Setup

Workshop Task 1 - Selenium WebDriver + Cucumber

Manually create a user on the website https://mystore-testlab.coderslab.pl.

Write a script that:

will log in to the created user,
will navigate by clicking on the Addresses tile after logging in (the address we should end up at is: https://mystore-testlab.coderslab.pl/index.php?controller=addresses),
will click on + Create new address,
will fill in the New address form - the data should be taken from the Examples table in Gherkin (alias, address, city, zip/postal code, country, phone),
will check if the data in the added address is correct.


Workshop Task 2 

Write a script that:

logs in with the same user from task 1,
selects the Hummingbird Printed Sweater for purchase (additional option: check if there is a 20% discount on it),
selects size M (additional option: parameterize the size selection to choose from S, M, L, XL),
selects 5 pieces according to the parameter provided in the test (additional option: parameterize the quantity of items),
adds the product to the cart,
proceeds to the checkout option,
confirms the address (you can manually add it beforehand),
selects the pickup method - PrestaShop "pick up in store",
selects the payment option - Pay by Check,
clicks on "order with an obligation to pay",
takes a screenshot of the order confirmation and the amount.


