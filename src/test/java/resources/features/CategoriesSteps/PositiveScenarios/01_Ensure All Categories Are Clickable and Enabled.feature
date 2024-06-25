Feature: Ensure All Categories Are Clickable and Enabled

  Scenario: Ensure all categories are clickable and enabled
    Given Go to the Main Page
    And Click Categories And Control Enabled with:
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