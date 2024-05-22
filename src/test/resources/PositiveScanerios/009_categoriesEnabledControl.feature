Feature: Check All Categories
  Scenario: Ensure all categories are clickable and enabled
    Given Go to the Main Page
    And Click Categories And Control Enabled with:
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