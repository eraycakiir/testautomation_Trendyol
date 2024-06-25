Feature: Filter Products in Favorites

  Scenario: Filter Products in Favorites
    Given Go to the Main Page
    Then Click Categories And Control Enabled with and click category
      | Kadın             |
      | Erkek             |
      | Moda              |
      | Spor&Outdoor      |
      | Saat & Aksesuar   |
      | Kozmetik          |
      | Ev & Yaşam        |
      | Hobi & Müzik      |
      | Süpermarket       |
      | Anne & Çocuk      |
      | Ayakkabı & Çanta  |
      | Elektronik        |
      | Luxury            |
      | Dolap             |
      | Oto & Yapı Market |
      | Kitap & Kırtasiye |
      | İş Yerine Özel    |
    Then Click on the Influencers' Choices Button
    Then Add Three Random Products to Favorites
    Then Click to Favorites Button
    And Filter the Three added products with text and verify that they are the correct product.
