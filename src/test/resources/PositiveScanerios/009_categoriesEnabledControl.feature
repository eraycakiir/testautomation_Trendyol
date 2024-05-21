Feature: Check All Categories
  Scenario: Ensure all categories are clickable and enabled
    Given Go to the Main Page
    And Click Categories And Control Enabled with:
      | category          |
      | Kadın             |
      | Erkek             |
      | Ev & Yaşam        |
      | Süpermarket       |
      | Anne & Çocuk      |
      | Kozmetik          |
      | Ayakkabı & Çanta  |
      | Spor&Outdoor      |
      | Elektronik        |
      | Saat & Aksesuar   |
      | Luxury            |
      | Dolap             |
      | Moda              |
      | Oto & Yapı Market |
      | Kitap & Kırtasiye |
      | Hobi & Müzik      |
      | İş Yerine Özel    |