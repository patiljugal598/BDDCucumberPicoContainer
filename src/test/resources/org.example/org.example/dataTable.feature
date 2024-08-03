Feature: Data Table

  Scenario: Verify data tables
    Given my credentials
      | test | test123 |

  Scenario: Verify multiple row credentials
    Given multiple credentials
      | test | test123 |
      | qa   | qa123   |

  Scenario: Verify multiple row credentials without datatable
    Given multiple credentials without datatable parameter
      | test | test123 |
      | qa   | qa123   |

  Scenario: Verify multiple row credentials with datatable type
    Given multiple credentials without datatable type
      | customer1 | customer123 |
      | customer1   | customer123   |