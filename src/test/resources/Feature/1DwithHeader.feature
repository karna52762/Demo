Feature: verify Amazon order booking

  Scenario: verifying Amazon Search products
    Given user is on the same products
    When user should search products
      | TV     | Sony   |
      | phone  | Iphone |
      | Laptop | Lenovo |
    Then user should verify all product listed success
