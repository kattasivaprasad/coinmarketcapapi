Feature: To verify the Coin Market results on dashboard with different filters

  @BackendTask1
  Scenario Outline: Validate conversion from <Type> to Boliviano
    Given user retrieves ID of "<Type>" coin
    Then user converts "<Amount>" amount of "<Type>" coin with to Boliviano

    Examples:
    | Type      | Amount |
    | Bitcoin   | 1      |
    | Ethereum  | 1      |
    | Tether    | 1      |

  @BackendTask2
  Scenario Outline: Validate information for <Type> cryptocurrency
    Given user fetches the technical documentation of "<Type>" cryptocurrency
    Then user verifies the technical information of the currency
    | name    |  symbol  |  tag  | date   | logo   |
    | <Type>  | <symbol> | <tag> | <date> | <logo> |

    Examples:
    | Type     |symbol|tag     | date                     | logo                                                         |
    | Ethereum |ETH   |mineable| 2015-08-07T00:00:00.000Z | https://s2.coinmarketcap.com/static/img/coins/64x64/1027.png |


  @BackedTask3
  Scenario:Verify info for mineable coins
    Given user retrieves ID of first ten coins and prints the details of coins with mineable