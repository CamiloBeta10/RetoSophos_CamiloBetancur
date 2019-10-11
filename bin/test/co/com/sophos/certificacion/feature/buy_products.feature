
@tag
Feature: Buy tv on the page of Metro Ceconsud

  @tag1
  Scenario Outline: he sees the product in the shopping cart
    Given You enter the page of Metro
    When he selects a product
    	|id	| product  | reference | price  |
    	|<id>	|<product>  |<reference>|<price>|
    Then he verifies which shopping cart
    
  Examples:
	| id | product  | reference | price  |
	##@externaldata@./src/test/resources/co/com/sophos/certificacion/datadriven/productInformation.xlsx@Sheet1
   |1   |AOC Televisor LED 32'' HD 32M1370   |575986   |S/699.00|
     
