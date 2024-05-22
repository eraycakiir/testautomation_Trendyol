Feature:

  Scenario:
    Given Go to the Main Page
    Then Click Categories And Control Enabled with and click category
      | category          |
      | Erkek             |
      | Kadın             |
      | Moda              |
      | Spor&Outdoor      |
      | Hobi & Müzik      |
      | Kozmetik          |
      | Ev & Yaşam        |
      | Saat & Aksesuar   |
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
