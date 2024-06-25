# Trendyol Android Test Automation Project

## Overview

This project is designed to automate the testing process for the Trendyol Android application. Utilizing Appium, this project aims to cover a comprehensive range of test scenarios to ensure the application's reliability, performance, and user experience. The tests are written in Java and follow industry-standard best practices.

## Features

- **Automated Testing**: The project leverages Appium to perform automated tests on the Trendyol Android application.
- **Comprehensive Test Coverage**: Includes positive and negative test cases for various features and pages of the application.
- **Gherkin Syntax**: Test scenarios are written using Gherkin syntax to enhance readability and maintainability.
- **Continuous Integration**: Integrates with CI/CD pipelines for automated testing on code changes.

## Technologies Used

- **Appium**: For automating mobile application testing.
- **Java**: The primary programming language for writing test scripts.
- **JUnit/TestNG**: Test frameworks used for structuring and running tests.
- **Maven/Gradle**: Build automation tools for managing project dependencies and building the project.
- **Gherkin**: For writing human-readable test scenarios.

## Test Scenarios

### 1. Login Page

- **Positive Tests**:
  - Successful login with correct username and password.
  - Successful password reset via "Forgot Password" link.
  - Successful login using social media accounts (Google, Facebook).
- **Negative Tests**:
  - Unsuccessful login with incorrect username or password.
  - Unsuccessful login with empty username and password.
  - Unsuccessful login with invalid email format.

### 2. Sign-Up Page

- **Positive Tests**:
  - Successful account creation with all required fields filled correctly.
  - Successful account creation using social media accounts.
- **Negative Tests**:
  - Unsuccessful account creation with missing or incorrect information.
  - Unsuccessful account creation with duplicate email.
  - Unsuccessful account creation with invalid email format or weak password.

### 3. Product Search and Filtering

- **Positive Tests**:
  - Successful product search with valid keywords.
  - Successful product filtering by categories, price range, brand, and color.
- **Negative Tests**:
  - Unsuccessful search with invalid or nonsensical keywords.
  - Filtering with no results returns appropriate message.

### 4. Product Detail Page

- **Positive Tests**:
  - Display of correct product details, high-quality images, reviews, and ratings.
- **Negative Tests**:
  - Handling of incomplete or incorrect product information and failed loading of reviews.

### 5. Shopping Cart and Checkout

- **Positive Tests**:
  - Adding products to the cart and updating the cart correctly.
  - Successful checkout with valid information and multiple payment methods.
- **Negative Tests**:
  - Unsuccessful checkout with an empty cart, invalid payment information, or out-of-stock products.

### 6. Profile and Settings

- **Positive Tests**:
  - Display and update of profile information, password change, and address/payment information management.
- **Negative Tests**:
  - Handling of incomplete or incorrect information for profile updates and password changes.

### 7. Notifications and Messages

- **Positive Tests**:
  - Display of notifications and successful sending/receiving of messages.
- **Negative Tests**:
  - Handling of incomplete or incorrect information for messages and failed loading of notifications.

### 8. Home Page

- **Positive Tests**:
  - Correct loading of the home page, featured products, and campaigns.
- **Negative Tests**:
  - Handling of failed loading of the home page, campaigns, and product images.

### 9. Categories and Subcategories

- **Positive Tests**:
  - Correct listing and redirection to subcategories and display of products.
- **Negative Tests**:
  - Handling of failed loading of categories and subcategories.


### 10. Discounts and Campaigns

- **Positive Tests**:
  - Listing discounted products and applying valid campaign codes.
- **Negative Tests**:
  - Handling of invalid campaign codes and out-of-stock discounted products.

### 11. Order History and Tracking

- **Positive Tests**:
  - Display of correct order history, status, and shipment tracking information.
- **Negative Tests**:
  - Handling of failed loading of order history and details.

### 12. Favorite Products and Lists

- **Positive Tests**:
  - Adding products to the favorite list and displaying/removing them correctly.
- **Negative Tests**:
  - Preventing duplicate and invalid products in the favorite list.

### 13. Contact and Support

- **Positive Tests**:
  - Successful submission of the contact form and live chat support.
- **Negative Tests**:
  - Handling of incomplete or incorrect information for contact forms and failed live chat connections.


### 14. User Reviews and Ratings

- **Positive Tests**:
  - Adding and displaying user reviews and ratings.
- **Negative Tests**:
  - Preventing invalid or incomplete reviews and incorrect ratings.


### 15. Address Management

- **Positive Tests**:
  - Adding and updating addresses successfully.
- **Negative Tests**:
  - Handling of incomplete information for adding addresses and issues with deleting addresses.

